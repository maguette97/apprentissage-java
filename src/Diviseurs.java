package apprentissage;

public class Diviseurs {
    public static void main(String[] args){
        int n = 36;
        int compteur = 0;

        for (int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
                compteur++;
            }
        }
        System.out.println(compteur + " diviseurs");
    }
}
