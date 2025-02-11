public class Exo8 {
    public static void main(String[] args) throws Exception {
        char[] myArray42 = "quarante-deux".toCharArray();
        String myWord = new String(myArray42);
        String finalSentence = myWord + " La grande réponse sur la vie, l’univers et le reste !";
        System.out.println(finalSentence);
    }
}
//correction
/*public class Exo8 {
    public static void main(String[] args) throws Exception {
        char[] myArray42 = {'q', 'u', 'a', 'r', 'a', 'n', 't', 'e', '-', 'd', 'e', 'u', 'x'};
        String phrase = new String(myArray42);
        System.out.println("La grande réponse sur la vie, l’univers et le reste ! " + phrase);
    }
} */