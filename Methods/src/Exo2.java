public class Exo2 {
    public class Personne {
        private String nom;
        protected int age;
        String adresse; // Default (pas de modificateur)
    
        // Constructeur
        public Personne(String nom, int age, String adresse) {
            this.nom = nom;
            this.age = age;
            this.adresse = adresse;
        }
    
        // Méthode publique pour afficher le nom
        public void afficherNom() {
            System.out.println("Nom : " + nom);
        }
    
        // Méthode privée pour changer le nom
        private void changerNom(String nom) {
            this.nom = nom;
        }
    
        // Méthode protégée pour afficher l'âge
    }
}

//correction
/*public class Exo_02 {
        public static void main(String[] args) {
            Personne personne = new Personne("John", "24 Rue Jeanne d'Arc", 25);

            personne.afficherNom();
            personne.afficherAddresse();
        }
    }


public class Personne {
    public String nom;
    public String adresse;
    public int age;

    public Personne(String nom, String adresse, int age) {
        this.nom = nom;
        this.adresse = adresse;
        this.age = age;
    }

    public Void afficherNom () {
        System.out.println(nom);
        return null;
    }

    private void changerNom (String nom) {
        this.nom = nom;
    }

    protected void afficherAge () {
        System.out.println(age);
    }

    void afficherAddresse () {
        System.out.println(adresse);
    }


} */