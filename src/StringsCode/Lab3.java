package StringsCode;

public class Lab3 {
    public static void main(String[] args) {
        //String are immutable in nature
        String s1 =  "Sunil"; // String pool
        String s2 =  new String("Sunil"); // Heap area
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        //StringBuilder and StringBuffer are mutable in nature
        StringBuilder s3 = new StringBuilder("Jai");
        s3.append(" Hind");
        System.out.println(s3);

        StringBuffer s4 = new StringBuffer("Raghu");
        s4.append(" Pati");
        s4.append(" Raghava");
        s4.append(" Rajaram");
        System.out.println(s4);
    }
}
