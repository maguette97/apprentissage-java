package algo;

public class MoyenneMention {
    public static void main(String[] args) {

        double note1 = 8;
        double note2 = 9;
        double note3 = 10;
        double moyenne = (note1+note2+note3)/3;

        if (moyenne>=16){
            System.out.println(moyenne + " Très bien");
        }
        else if (moyenne>=14 && moyenne<=16){
            System.out.println(moyenne + " Bien");
        }
        else if (moyenne>=12 && moyenne<=14){
            System.out.println(moyenne + " Assez bien");
        }
        else if (moyenne>=10){
            System.out.println(moyenne + " Passable");
        }
        else {
            System.out.println(moyenne + " Ajourné");
        }


    }
}
