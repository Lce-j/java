import java.util.Random;

public class Exo9 {
    public static void main(String[] args) throws Exception {
        int rand = new Random().nextInt(42) + 1;
        boolean isFortyTwo = (rand == 42) && true;

        System.out.println("Nombre généré : " + rand);
        System.out.println("Résultat : " + isFortyTwo);
    }
}
//correction
/*public class Exo9 {
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 42) + 1;
        boolean isEqual42 = (rand == 42);

        System.out.println("Le nombre aléatoire est : " + rand);
        System.out.println("Est-ce égal à 42 ? " + isEqual42);
    }
} */