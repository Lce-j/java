public class Exo2 {
    public class Voiture {
        private String modele;
        private String couleur;
        private double prix;
    
        public Voiture(String modele, String couleur, double prix) {
            this.modele = modele;
            this.couleur = couleur;
            setPrix(prix);
        }
    
        public String getModele() {
            return modele;
        }
    
        public void setModele(String modele) {
            this.modele = modele;
        }
    
        public String getCouleur() {
            return couleur;
        }
    
        public void setCouleur(String couleur) {
            this.couleur = couleur;
        }
    
        public double getPrix() {
            return prix;
        }
    
        public void setPrix(double prix) {
            if (prix > 0) {
                this.prix = prix;
            } else {
                System.out.println("Erreur : Le prix doit être positif !");
            }
        }
    
        public void afficherDetails() {
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Prix : " + prix + " €");
        }
    
        public /*static*/ void main(String[] args) {
            Voiture voiture1 = new Voiture("Tesla Model S", "Noir", 79999.99);
    
            voiture1.afficherDetails();
            
            voiture1.setCouleur("Rouge");
            voiture1.setPrix(85000.00);

            voiture1.setPrix(-1000.00);
            voiture1.afficherDetails();
        }
    }
    
}

//correction
/* class Voiture {
    private String modele;
    private String couleur;
    private double prix;

    public Voiture(String modele, String couleur, double prix) {
        this.modele = modele;
        this.couleur = couleur;
        this.setPrix(prix);
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = Math.max(0,prix);
    }

    public void afficherDetails() {
        System.out.println("ModÃ¨le: " + modele + ", Couleur: " + couleur + ", Prix: " + prix);
    }
}*/