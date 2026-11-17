package algo;

public class FicheProduit {

    public static void main(String[] args) {
        String nom = "Ordinateur";
        double prixUnitaire = 350000.0;
        int quantite = 3;
        boolean estDisponibilite = true;
        double total = prixUnitaire * quantite;

        System.out.println("Produit: " + nom);
        System.out.println("Prix unitaire: " + prixUnitaire + " FCFA");
        System.out.println("Quantité: " + quantite);
        System.out.println("Total: " + total + " FCFA");
        System.out.println("Disponibilite: " + estDisponibilite);
    }

}
