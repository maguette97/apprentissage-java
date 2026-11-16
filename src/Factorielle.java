package apprentissage;

public class Factorielle {
    public static void main(String[] args){
        int n = 5;
        long resultat = 20;

        for (int i=1; i<=5; i++){
            resultat=resultat*i;

            System.out.println(n + "! = " + resultat);
        }


    }
}
