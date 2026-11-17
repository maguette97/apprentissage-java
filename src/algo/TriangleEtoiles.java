package algo;

public class TriangleEtoiles {
    public static void main(String[] args){
        int hauteur = 4;
        String etoile = "*";

        for (int ligne = 1; ligne <= hauteur; ligne++) {

            for (int colonne = 1; colonne <= ligne; colonne++) {
                System.out.print(etoile);
            }

            System.out.println();
        }
    }
}
