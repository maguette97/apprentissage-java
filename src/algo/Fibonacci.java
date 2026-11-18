public class Fibonacci {
    public static void main(String[] args){

        int precedent = 0;
        int actuel = 1;

        for (int i = 1; i <= 15; i++) {
            System.out.print(precedent + " ");
            int suivant = precedent+actuel;
            precedent = actuel;
            actuel = suivant;
        }


    }
}
