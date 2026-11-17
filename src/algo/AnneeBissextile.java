package algo;

public class AnneeBissextile {
    public static void main(String[] args) {
        int annee = 2024;
        boolean estBissextile = (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;

        if (estBissextile) {
            System.out.println(annee + " est bissextile");
        } else {
            System.out.println(annee + " n'est pas bissextile");
        }
    }

    public static class TriangleEtoiles {
        public static void main(String[] args){
            int n = 1;
            String etoile = "*";

            while(n<=1){
                System.out.println(etoile);
                for(int i =1; i<=2; i++){
                    System.out.print(etoile);
                }
                System.out.println();
                for(int i =1; i<=3; i++){
                    System.out.print(etoile);
                }
                System.out.println();
                for(int i =1; i<=4; i++){
                    System.out.print(etoile);
                }
                n=n+1;

            }
        }
    }
}
