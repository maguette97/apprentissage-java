public class ConversionSecondes {
    public static void main(String[] args) {
        int totalSecondes = 3725;

        int totalMinutes = totalSecondes / 60;
        int heures = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int secondes = totalSecondes % 60;

        System.out.println(heures + " h " + minutes + " min " + secondes + " s");
    }
}
