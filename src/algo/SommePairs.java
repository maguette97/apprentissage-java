public class SommePairs {
    public static void main(String[] args) {

        int somme = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somme += i;
            }
        }
        System.out.println("Somme de 1 à 100 : " + somme);
    }
}
