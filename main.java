import java.util.HashMap;
/**
 *
 * @author briehn
 */
public class main {

    /**
     * @param args the command line arguments
     */
    private static void map(String x, String y) {
        HashMap<Character, Character> hash = new HashMap<>();
        for (int i = 0; i < x.length(); i++) {
            char c1 = x.charAt(i);
            char c2 = y.charAt(i);
            if (hash.containsKey(c1)) {
                if (c2 != hash.get(c1)) {
                    System.out.println("False.");
                    return;
                }
            }
            hash.put(c1, c2);
        }
        System.out.println("True.");
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bcd";
        map(s1, s2);
        map(s2, s1);
    }
    
}
