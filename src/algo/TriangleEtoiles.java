package algo;

public class TriangleEtoiles {
    public static void main(String[] args){
        int n = 1;
        String etoile = "*";

        while(n<=1){
            System.out.println(etoile);
            for(int i =1; i<=2; i++){
                System.out.print(etoile);
            }
            System.out.println();
            for(int i =1; i<=3; i++){
                System.out.print(etoile);
            }
            System.out.println();
            for(int i =1; i<=4; i++){
                System.out.print(etoile);
            }
            n=n+1;

        }
    }
}
