package StringsCode;

public class Lab1 {
    public static void main(String[] args) {
        String str1 = "Hello"; //String constant pool
        String str2 = new String(" Its Sunday"); //Heap Area

        String str3 = "Sunil";
       String str4 = str3.concat(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
