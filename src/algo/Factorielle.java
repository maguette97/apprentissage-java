package algo;

public class Factorielle {
    public static void main(String[] args){
        int n = 20;
        long resultat = 1;

        for (int i=1; i<=n; i++){
            resultat=resultat*i;

        }
        System.out.println(n + "! = " + resultat);



    }
}
