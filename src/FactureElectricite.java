package apprentissage;

public class FactureElectricite {
    public static void main(String[] args){
        int kWh = 200;
        int price1 = 90;
        int price2 = 110;
        int totalApayer1 = kWh*price1;
        int totalApayer2 = (kWh-150)*price2 + 150*90;
        if (kWh <= 150){
            System.out.println("Prix à payer: " +totalApayer1);
        }
        else {
            System.out.println("Prix à payer: " +totalApayer2);
        }
    }
}
