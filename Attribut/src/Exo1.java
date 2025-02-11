public class Exo1 {
    public class Book {
        private String title;
        public String getTitle(){
            return title;
        }
        public void setTitle(String title){
            this.title = title;
        }
    }

}

//correction
/* class Livre{
    private String titre;

    public Livre(String titre){
        this.titre = titre;
    }

    public String getLivre(){
        return this.titre;
    }

    public void setLivre(String name){
        this.titre = name;
    }
}

public class ex1 {
    public static void main(String[] args) throws Exception {
        Livre livre = new Livre("Super Livre trop cool");

        System.out.println(livre.getLivre());

        livre.setLivre("Super Livre trop cool 2");

        System.out.println(livre.getLivre());
    }
}*/