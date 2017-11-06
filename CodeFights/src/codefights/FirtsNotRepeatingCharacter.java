package codefights;

public class FirtsNotRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(firtsNotRepeatingCharacter2("abaccbffd"));
    }

    static char firtsNotRepeatingCharacter(String s) {
        String b = "";
        Character c;
        String cad;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (s.substring(i + 1).contains(c.toString()) || b.contains(c.toString())) {
            } else {
                return c;
            }
            b += c.toString();
        }
        return '_';
    }

    static char firtsNotRepeatingCharacter2(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return s.charAt(i);
            }
            
        }
        return '_';
    }
}
