public class NombresParfaits {
    public static void main(String[] args) {

        for (int n = 1; n<=1000; n++){
            int somme = 0;
            for (int i = 1; i <= n; i++){
                if (n%i==0 && i!=n ){
                    somme = somme + i;
                }
            }
            if(n == somme){
                System.out.println(somme);
            }
        }
    }

}
