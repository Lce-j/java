public class Exo13 {
    public static void main(String[] args) throws Exception {
        int a = 24;
        int b = 42;
        System.out.println("Avant l'échange : a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Après l'échange : a = " + a + ", b = " + b);
    }
}
