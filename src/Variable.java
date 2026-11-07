public class Variable {
    public static void main(String[] args) {
//        String nom = "Ordinateur";
//        double prixUnitaire = 350000.0;
//        int quantite = 3;
//        boolean estDisponibilite = true;
//        double total = prixUnitaire * quantite;
//
//        System.out.println("Produit: " + nom);
//        System.out.println("Prix unitaire: " + prixUnitaire + " FCFA");
//        System.out.println("Quantité: " + quantite);
//        System.out.println("Total: " + total + " FCFA");
//        System.out.println("Disponibilite: " + estDisponibilite);

//        int x = 10;
//        int y = 4;
//        System.out.println(x / y);
//        System.out.println(x % y);
//        System.out.println(x / 4.0);
//        System.out.println("Résultat : " + x + y);
//        System.out.println("Résultat : " + (x + y));
//
//        int totalSecondes = 3725;
//
//        int totalMinutes = totalSecondes / 60;
//        int heures = totalMinutes / 60;
//        int minutes = totalMinutes % 60;
//        int secondes = totalSecondes % 60;
//
//        System.out.println(heures + " h " + minutes + " min " + secondes + " s");
//
//        int nombre = 17;
//
//        if (nombre % 2 == 0) {
//            System.out.println(nombre + " est pair");
//        } else {
//            System.out.println(nombre + " est impair");
//        }
//
//        int age = 65;
//        int prixBillet = 500;
//        int prixAPayer;
//
//        if (age < 12) {
//            prixAPayer = prixBillet / 2;
//        } else if (age > 60) {
//            prixAPayer = prixBillet - prixBillet * 30 / 100;
//        } else {
//            prixAPayer = prixBillet;
//        }
//
//        System.out.println("Vous devez payer " + prixAPayer + " FCFA");

        int annee = 2024;
        boolean estBissextile = (annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0;

        if (estBissextile) {
            System.out.println(annee + " est bissextile");
        } else {
            System.out.println(annee + " n'est pas bissextile");
        }
}}