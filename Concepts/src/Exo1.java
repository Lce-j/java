public class Exo1 {
    public abstract class Animal{
        protected String nom;
        public Animal(String nom) {
            this.nom = nom;
        }
        public void manger() {
            System.out.println(nom + " est en train de manger.");
        }
        public abstract void seDeplacer();
        
    }
    public abstract class Oiseau extends Animal{
        public Oiseau(String nom) {
            super(nom);
        }
        public void seDeplacer() {
            voler();
        }
        public void voler(){
            System.out.println("L'oiseau vole'");
        }
    }
    public abstract class Mammifere extends Animal{
        public Mammifere(String nom) {
            super(nom);
        }
        public void seDeplacer() {
            marcher();
        }
        public void marcher(){
            System.out.println("L'oiseau vole'");
        }
    }
    public abstract class Lezard extends Animal{
        public Lezard(String nom) {
            super(nom);
        }
        public void seDeplacer() {
            ramper();
        }
        public void ramper(){
            System.out.println("L'oiseau vole'");
        }
    }
}

//correction
/* abstract class Animal {
    String nom;
    Animal(String nom) {
        this.nom = nom;
    }
    abstract void seDeplacer();
}

class Mammifere extends Animal {
    Mammifere(String nom) {
        super(nom);
    }
    void seDeplacer() {
        System.out.println(nom + this.marcher());
    }
    String marcher() {
        return "marche sur ses pattes.";
    }
}

class Oiseau extends Animal {
    Oiseau(String nom) {
        super(nom);
    }
    void voler() {
        System.out.println(nom + " bat des ailes et vole.");
    }
}

class Reptile extends Animal {
    Reptile(String nom) {
        super(nom);
    }
    void ramper() {
        System.out.println(nom + " rampe.");
    }
}*/