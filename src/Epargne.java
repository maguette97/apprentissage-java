package apprentissage;

public class Epargne {
    public static void main(String[] args){
        double somme = 100000;
        double objectif = 100000*2;
        double taux = 5.0 /100;
        int annee = 0;

        while(somme<objectif){
            double interet = somme*taux;

            somme=somme+interet;
            annee++;

        }
        System.out.println(annee + " ans" + " (environ: " + somme);

    }
}
