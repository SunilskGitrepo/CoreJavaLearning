package StringsCode;

public class Lab2 {
    public static void main(String[] args) {
        String name = "Sunil";
        String str2 = new String(" Kumar");
        System.out.println(name.concat(str2));
        System.out.println(name + str2);
        System.out.println(name.contains("m"));

        String actual_password = "Password8055";
        String expected_Password = "PasswoRd8055";
        System.out.println(actual_password.equalsIgnoreCase(expected_Password));
    }
}
