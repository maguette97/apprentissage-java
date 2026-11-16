package apprentissage;

public class SommeChiffres {
    public static void main(String[] args){
        int nombre = 4527;
        int somme = 0;

        while(nombre>0){
            int chiffre = nombre%10;
            somme += chiffre;
            nombre = nombre / 10;
        }
        System.out.println(somme);

    }
}
