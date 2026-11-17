package algo;

public class TriangleEtoiles {
    public static void main(String[] args){
        int hauteur = 4;
        String etoile = "*";

        for (int i = 1; i <= hauteur; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(etoile);
            }

            System.out.println();
        }
    }
}
