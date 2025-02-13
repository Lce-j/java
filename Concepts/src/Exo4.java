public class Exo4 {
    public abstract class Forme {
        public abstract double calculerSurface();
    }
    public class Cercle extends Forme {
        private double rayon;
        public Cercle(double rayon) {
            this.rayon = rayon;
        }
        @Override
        public double calculerSurface() {
            return Math.PI * Math.pow(rayon, 2);
        }
    }
    public class Rectangle extends Forme {
        private double largeur;
        private double hauteur;
        public Rectangle(double largeur, double hauteur) {
            this.largeur = largeur;
            this.hauteur = hauteur;
        }
        @Override
        public double calculerSurface() {
            return largeur * hauteur;
        }
    }
    public class Geometrie {
        public /*static*/ void main(String[] args) {
            Forme cercle = new Cercle(5);
            System.out.println("Surface du cercle : " + cercle.calculerSurface());

            Forme rectangle = new Rectangle(4, 7);
            System.out.println("Surface du rectangle : " + rectangle.calculerSurface());
        }
    }
    
}

//correction
/* public class ex4 {
    public static void main(String[] args) {
        Forme cercle = new Cercle(5);
        Forme rectangle = new Rectangle(4, 6);
        System.out.println("Surface du cercle: " + cercle.calculerSurface());
        System.out.println("Surface du rectangle: " + rectangle.calculerSurface());
    }
}

abstract class Forme {
    public abstract double calculerSurface();
}

class Cercle extends Forme {
    private double rayon;
    public Cercle(double r) {
        super();
        rayon = r;
    }
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}

class Rectangle extends Forme {
    private double largeur;
    private double hauteur;
    public Rectangle(double largeur, double hauteur) {
        super();
        largeur = largeur;
        hauteur = hauteur;
    }
    public double calculerSurface() {
        return largeur * hauteur;
    }
}*/