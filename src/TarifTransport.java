public class TarifTransport {
    public static void main(String[] args) {
        int age = 65;
        int prixBillet = 500;
        int prixAPayer;

        if (age < 12) {
            prixAPayer = prixBillet / 2;
        } else if (age > 60) {
            prixAPayer = prixBillet - prixBillet * 30 / 100;
        } else {
            prixAPayer = prixBillet;
        }

        System.out.println("Vous devez payer " + prixAPayer + " FCFA");
    }
}
