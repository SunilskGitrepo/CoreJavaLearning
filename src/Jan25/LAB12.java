package Jan25;

public class LAB12 {
    public static void main(String[] args) {
        for(int i=0 ; i<10 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
                   continue;
            }
            System.out.println(i + " is odd number");
        }

    }
}
