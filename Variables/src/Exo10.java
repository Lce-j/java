import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exo10 {
    public static void main(String[] args) throws Exception {

        // Types primitifs
        byte my42TypeByte = 42;
        short my42TypeShort = 42;
        int my42TypeInt = 42;
        long my42TypeLong = 42L;
        float my42TypeFloat = 42.0f;
        double my42TypeDouble = 42.0;
        char my42TypeChar = '4';
        boolean my42TypeBoolean = true;

        // Types de référence
        String my42TypeString = "42";
        Integer my42TypeInteger = 42;
        Double my42TypeDoubleObj = 42.0;
        int[] my42TypeArray = {4, 2};
        List<Integer> my42TypeList = new ArrayList<>();
        my42TypeList.add(42);
        Map<String, Integer> my42TypeMap = new HashMap<>();
        my42TypeMap.put("quarante-deux", 42);
        Object my42TypeObject = new Object();

        // === DÉTECTION DES TYPES ===
        System.out.println(getType(my42TypeByte));
        System.out.println(getType(my42TypeShort));
        System.out.println(getType(my42TypeInt));
        System.out.println(getType(my42TypeLong));
        System.out.println(getType(my42TypeFloat));
        System.out.println(getType(my42TypeDouble));
        System.out.println(getType(my42TypeChar));
        System.out.println(getType(my42TypeBoolean));

        System.out.println(getType(my42TypeString));
        System.out.println(getType(my42TypeInteger));
        System.out.println(getType(my42TypeDoubleObj));
        System.out.println(getType(my42TypeArray));
        System.out.println(getType(my42TypeList));
        System.out.println(getType(my42TypeMap));
        System.out.println(getType(my42TypeObject));
    }

    // === MÉTHODE DE DÉTECTION DES TYPES ===
    public static String getType(Object obj) {
        return obj.getClass().getSimpleName();
    }

    // Surcharge pour détecter les types primitifs (car getClass() ne marche pas avec eux)
    public static String getType(byte value) { return "byte"; }
    public static String getType(short value) { return "short"; }
    public static String getType(int value) { return "int"; }
    public static String getType(long value) { return "long"; }
    public static String getType(float value) { return "float"; }
    public static String getType(double value) { return "double"; }
    public static String getType(char value) { return "char"; }
    public static String getType(boolean value) { return "boolean"; }
}

//correction
/*public class Exo10 {
    public static void main(String[] args) {
            int my42Int = 42;
            double my42Double = 42.0;
            char my42Char = 'a';
            float my42Float = 42.0f;
            boolean my42Boolean = true;
            String my42String = "42";
            long my42Long = 42L;
            short my42Short = 42;
            byte my42Byte = 42;

            System.out.println(((Object)my42Int).getClass().getSimpleName());
            System.out.println(((Object)my42Double).getClass().getSimpleName());
            System.out.println(((Object)my42Char).getClass().getSimpleName());
            System.out.println(((Object)my42Float).getClass().getSimpleName());
            System.out.println(((Object)my42Boolean).getClass().getSimpleName());
            System.out.println(((Object)my42String).getClass().getSimpleName());
            System.out.println(((Object)my42Long).getClass().getSimpleName());
            System.out.println(((Object)my42Short).getClass().getSimpleName());
            System.out.println(((Object)my42Byte).getClass().getSimpleName());
    }
}
 */
