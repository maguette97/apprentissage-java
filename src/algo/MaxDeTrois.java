package algo;

public class MaxDeTrois {
    public static void main(String[] args) {
        int a = -4;
        int b = -1;
        int c = -8;

        if (a >= b && a >= c) {
            System.out.println("Le plus grand est " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Le plus grand est " + b);
        } else {
            System.out.println("Le plus grand est " + c);
        }
    }
}
