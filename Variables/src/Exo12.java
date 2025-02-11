public class Exo12 {
    public static void main(String[] args) throws Exception {
        String myString = "42424242";
        String replacedString = myString.replaceAll("42", "quarante-deux ");
        System.out.println(replacedString);
    }
}

//correction
/*public class Exo12 {
    public static void main(String[] args) {
        String string42 = "42424242";
        String replaceString = string42.replace("42", "quarante-deux ");
        System.out.println("Chaîne changée : " + replaceString);
    }
} */