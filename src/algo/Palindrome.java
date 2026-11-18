public class Palindrome {
    public static void main(String[] args){
        int nombre = 12321;
        int resultat = 0;
        int original = nombre;

        while (nombre>0) {
            int chiffre = nombre % 10;
            resultat = resultat * 10 + chiffre;
            nombre = nombre / 10;

            System.out.print(resultat+ " ");

        }
        if (resultat == original) {
            System.out.print(" oui");
        }
        else {
            System.out.print(" non");
        }


    }
}
