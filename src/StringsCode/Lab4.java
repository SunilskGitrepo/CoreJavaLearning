package StringsCode;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Original_String");
        String user_input = sc.next();
        boolean result = IsPalindrome(user_input);
            if(result){
                System.out.println("Is Palindrome");
            }
            else{
                System.out.println("Not a Palindrome");
            }

        }


    private static boolean IsPalindrome(String UserInput) {
        String original_string = UserInput;
        StringBuilder sb = new StringBuilder(UserInput);
        String reverse_string = sb.reverse().toString();
        System.out.println(reverse_string);
        return original_string.equalsIgnoreCase(reverse_string);

    }
}
