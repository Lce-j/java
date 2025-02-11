public class Exo3 {
   public class Animal{
        protected String name;
    }
    public class Dog extends Animal{
        public Dog(String name){
            this.name = name;
        }
    }
}

//correction
/* public class Exo3 {
    public static void main(String[] args) {
        Dog red = new Dog();

        System.out.println(red.getName());
    }
}

public class Animal {
    protected String name = "je suis protected";
}

public class Dog extends Animal {
    public String getName() {
        return name;
    }
}*/