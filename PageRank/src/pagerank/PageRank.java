/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerank;

/**
 *
 * @author Poulmanogo
 */
public class PageRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomFichier="GrapheDuWeb.txt";
        
        /*0. Affichage du graphe du web*/
        LectureGrapheDuWeb.afficheGrapheDuWeb(nomFichier);
        
       /*1. Construction du tableau de debut des predesseurs de chaque sommet*/
        int tabDebut[]=new int[4];
        tabDebut=LectureGrapheDuWeb.ConstructionTabDebut(nomFichier);
        System.out.println();
        System.out.println("n = "+LectureGrapheDuWeb.n);
        System.out.println("nz = "+LectureGrapheDuWeb.nz);
        System.out.print("TabDebut : ");
        for(int i=0; i<4; i++) System.out.print(tabDebut[i]+"  ");
        System.out.println();
        
       /*2. Construction du tableau des predecesseurs de chaque sommet*/
        float tabPreds[]=new float[LectureGrapheDuWeb.nz];
        tabPreds=LectureGrapheDuWeb.ConstructionTabPreds(nomFichier, tabDebut);
        System.out.print("TabPreds : ");
        for(int i=0; i<LectureGrapheDuWeb.nz; i++) System.out.print(tabPreds[i]+"  ");
        System.out.println();
        
       /*3. Calcul du produit de la matrice */
        float [] e={1,1,1}; System.out.print("Vecteur e : "); for(int i=0; i<e.length; i++) System.out.print(e[i]+"  ");
        float produit[]=Matrice.produit(e,tabPreds, tabDebut);
        System.out.println();
        System.out.print("Produit : "); for(int i=0; i<produit.length; i++) System.out.print(produit[i]+"  ");
        System.out.println();
    }
}
