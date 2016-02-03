/*
 * cette classe Matrice servira à definit les
 * les operations matricielles.
 */
package pagerank;

/**
 *
 * @author Poulmanogo
 */
public class Matrice {
    
    //METHODE QUI RENVOI LA PRODUIT DE DEUX MATRICES
    public static float[] produit(float[] e, float[] tabPreds, int [] tabDebut){
        float r[]={0,0,0};
        int k=0;
        for(int i=0; i<3; i++){
            for(int j=tabDebut[i]; j<tabDebut[i+1]; j++){
                r[i]+=e[k++]*tabPreds[j];
            }
            k=0;
        }
        return r;
    }
}
