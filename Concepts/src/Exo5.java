import java.util.ArrayList;
import java.util.List;

public class Exo5 {
    public class Avion {
        // Méthode générique de décollage
        public void decoller() {
            System.out.println("L'avion décolle.");
        }
    }
    public class AvionDeChasse extends Avion {

        // Redéfinition de la méthode decoller()
        @Override
        public void decoller() {
            System.out.println("L'avion de chasse décolle à grande vitesse !");
        }
    }
    public class AvionDeTransport extends Avion {

        // Redéfinition de la méthode decoller()
        @Override
        public void decoller() {
            System.out.println("L'avion de transport décolle lourdement et lentement.");
        }
    }

    public class PorteAvion {
        private List<Avion> avions;

        public PorteAvion() {
            this.avions = new ArrayList<>();
        }

        public void ajouterAvion(Avion avion) {
            avions.add(avion);
        }

        public void lancerDecollages() {
            for (Avion avion : avions) {
                avion.decoller();
            }
        }
    }
}

//correction
/*public class Ex5 {
    public static void main(String[] args) {
        Avion S14 = new AvionDeChasse();
        Avion A380 = new AvionDeTransport();
        PorteAvion porteAvion = new PorteAvion();

        porteAvion.addAvion(S14); // on intialisee les avions
        porteAvion.addAvion(A380);

        porteAvion.avion.get(0).decoller(); // on fait decoller un des avions
        System.out.println("Avion décollé");
    }
}


public class Avion {
    public void decoller() {
        System.out.println("Decollage de l'avion");
    }
}


public class AvionDeChasse extends Avion{
    @Override
    public  void decoller() {
        System.out.println("Decollage de l'avion de chasse");
    }
}

public class AvionDeTransport extends Avion {
    @Override
    public void decoller() {
        System.out.println("Decollage de l'avion de transport");
    }
}

import java.util.ArrayList;
import java.util.List;

public class PorteAvion {
    public List<Avion> avion = new ArrayList<Avion>();
    public void addAvion(Avion a) {
        avion.add(a);
    }
} */