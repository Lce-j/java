public class Exo1 {
    public class Addition{
        public int calculerSomme(int a, int b) {
            return a + b;
        }
        
        public void main(String[] args) {
            Addition addition = new Addition();
            int resultat = addition.calculerSomme(10, 32);
            System.out.println("La somme est : " + resultat);
        }
    }
}

//correction
/*public class Exo_01 {
        public static void main(String[] args) {
            Addition add = new Addition();
            System.out.println(add.addition(10, 20));
        }
    }

    public class Addition {
        public int addition( int a , int b ) {
            return a + b;
        }
    } */