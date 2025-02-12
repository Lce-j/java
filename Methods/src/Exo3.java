public class Exo3 {
    public class Calculatrice {
       
        public double add(int a, int b) {
            return a + b;
        }
    
        public double add(double a, double b) {
            return a + b;
        }
    
        public double sous(int a, int b) {
            return a - b;
        }
    
        public double sous(double a, double b) {
            return a - b;
        }
    
        public double multi(int a, int b) {
            return a * b;
        }
    
        public double multi(double a, double b) {
            return a * b;
        }
    
        public double divid(int a, int b) {
            return (double) a / b;
        }
    
        public double divid(double a, double b) {
            return a / b;
        }
    
        public double effectuerOperation(String operation, double a, double b) {
            return switch (operation) {
                case "add" -> add(a, b);
                case "sous" -> sous(a, b);
                case "multi" -> multi(a, b);
                case "divid" -> divid(a, b);
                case "secret" -> afficherMessageSecret();
                default -> Double.NaN;
            };
        }
        
        private double afficherMessageSecret() {
            System.out.println("✨ Bravo ! Vous avez trouvé l'easter egg ! ✨");
            return 42.42;
        }
    
        public  void main(String[] args) {
            Calculatrice calc = new Calculatrice();
    
            System.out.println("Addition : " + calc.effectuerOperation("add", 10, 5));
            System.out.println("Soustraction : " + calc.effectuerOperation("sous", 10, 5));
            System.out.println("Multiplication : " + calc.effectuerOperation("multi", 10, 5));
            System.out.println("Division : " + calc.effectuerOperation("divid", 10, 5));
    
            
            System.out.println("Easter Egg : " + calc.effectuerOperation("secret", 0, 0));
        }
    }
    
}

//correction
/*//Exo3
public class Exo3 {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println("Addition : " + calc.effectuerOperation("add", 5, 3));
        System.out.println("Addition float: " + calc.effectuerOperation("add", 5.5, 3.2));
        System.out.println("Soustraction : " + calc.effectuerOperation("sous", 8, 2));
        System.out.println("Soustraction float: " + calc.effectuerOperation("sous", 8.7, 2.4));
        System.out.println("Multiplication : " + calc.effectuerOperation("multi", 4, 3));
        System.out.println("Multiplication float: " + calc.effectuerOperation("multi", 4.1, 3.0));
        System.out.println("Division : " + calc.effectuerOperation("divi", 9.0, 3.0));
        System.out.println("Division float: " + calc.effectuerOperation("divi", 9.3, 3.2));

    }
} */