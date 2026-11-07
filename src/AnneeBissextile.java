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
}
