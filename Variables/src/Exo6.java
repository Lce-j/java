public class Exo6 {
    public static void main(String[] args) throws Exception {
        char[] myArray42 = "quarante-deux".toCharArray();
        System.out.print("Tableau : ");
        for (char c : myArray42) {
            System.out.print(c + " ");
        }
    }
}

//correction
/*public class Exo6 {
    public static void main(String[] args) {
        String myString = "quarante-deux";
        char[] myArray42 = myString.toCharArray();
        int longueurTableau = myArray42.length;

        // Concaténation plus lisible des caractères du tableau
        String mot = String.valueOf(myArray42);

        System.out.println("Le tableau contient " + longueurTableau + " caractères");
        System.out.println("Le mot reconstitué est : " + mot);
    }
} */