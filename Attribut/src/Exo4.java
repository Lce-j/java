public class Exo4 {
    public class Account{
        private static int numberOfAccount;
        public Account(){
            ++numberOfAccount;
        }
        public static int getNumberOfAccount() {
            return numberOfAccount;
        }
    }
    public void main(String[] args) {
        Account a = new Account();
        Account b = new Account();
        Account c = new Account();

        System.out.println(Account.getNumberOfAccount());
    }
}

//correction
/* public class Exo4 {
    public static void main(String[] args) {
        System.out.println(Compte.nombreDeComptes);

        Compte compte = new Compte("123");
        System.out.println(Compte.nombreDeComptes);
        Compte compte2 = new Compte("456");
        System.out.println(Compte.nombreDeComptes);
        Compte compte3 = new Compte("789");
        System.out.println(Compte.nombreDeComptes);
    }
}

public class Compte {
    static int nombreDeComptes = 0;
    private String nom;

    public Compte(String nom) {
        this.nom = nom;
        nombreDeComptes++;
    }
    public String getNom() {
        return nom;
    }
}*/