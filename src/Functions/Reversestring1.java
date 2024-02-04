package Functions;

public class Reversestring1 {
    public static void main(String[] args) {
        String name = "Anilkumar";
        String y = "";
        for (int i = name.length() - 1; i >= 0; i--) {

            y = y + name.charAt(i);
        }
            System.out.print(y);

    }
}
