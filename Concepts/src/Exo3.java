public class Exo3 {
    public class Employe {
        public void travailler() {
            System.out.println("L'employé travaille.");
        }
    }
    public class Enseignant extends Employe {

        @Override
        public void travailler() {
            System.out.println("L'enseignant enseigne les élèves.");
        }
    }
    public class Directeur extends Employe {

        @Override
        public void travailler() {
            System.out.println("Le directeur gère l'école et prend des décisions.");
        }
    }
    public class PersonnelAdministratif extends Employe {

        @Override
        public void travailler() {
            System.out.println("Le personnel administratif gère les documents et les tâches administratives.");
        }
    }
    public class Ecole {
        public /*static*/ void main(String[] args) {
            Employe employe1 = new Enseignant();
            Employe employe2 = new Directeur();
            Employe employe3 = new PersonnelAdministratif();
    
            employe1.travailler();
            employe2.travailler();
            employe3.travailler();
        }
    }    
}

//correction
/*public class ex3 {
    public static void main(String[] args) {
        Employe enseignant = new Enseignant();
        Employe directeur = new Directeur();
        Employe personnelAdministratif = new PersonnelAdministratif();
        enseignant.travailler();
        directeur.travailler();
        personnelAdministratif.travailler();
    }
}

class Employe {
    public void travailler() {
        System.out.println("L'employé travaille.");
    }
}

class Enseignant extends Employe {
    public Enseignant() {
        super();
    }
    
    public void travailler() {
        System.out.println("L'enseignant enseigne.");
    }
}

class Directeur extends Employe {
    public Directeur() {
        super();
    }
    
    public void travailler() {
        System.out.println("Le directeur gère l'école.");
    }
}

class PersonnelAdministratif extends Employe {
    public PersonnelAdministratif() {
        super();
    }
    
    public void travailler() {
        System.out.println("Le personnel administratif gère les tâches administratives.");
    }
} */