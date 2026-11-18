public class Pgcd {
    public static void main (String[] args){

        int a = 17;
        int b = 5;
        while (b!=0) {
            int reste = a % b;
            a = b;
            b = reste;

        }
        System.out.println("PGCD : " + a);
    }
}
