package algo;

public class InverserNombre {
    public static void main(String[] args){
        int nombre = 1234;
        int resultat = 0;

        while(nombre>0){
            int chiffre = nombre%10;
            resultat = chiffre;nombre = nombre / 10;
            System.out.print(resultat);
        }
    }
}
