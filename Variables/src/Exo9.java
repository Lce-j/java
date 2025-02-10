import java.util.Random;

public class Exo9 {
    public static void main(String[] args) throws Exception {
        int rand = new Random().nextInt(42) + 1;
        boolean isFortyTwo = (rand == 42) && true;

        System.out.println("Nombre généré : " + rand);
        System.out.println("Résultat : " + isFortyTwo);
    }
}
