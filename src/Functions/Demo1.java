package Functions;

public class Demo1 {
    public static void main(String[] args) {

        //main("pramod");

         int d = main(24);
        System.out.println(d);

    }

    public static void main(String a){
        System.out.println("I'm a main function but JVM wont recognize me");

    }
    public static int main(int a){
        return a+102;
    }

    }
