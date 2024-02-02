package Jan31;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        for(int i=0 ; i<=n ; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FIZZBUZZ");
            }
           else if(i%3==0) {
                System.out.println("FIZZ");
            }
            else if(i%5==0){
                System.out.println("BUZZ");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("---------EOP--------");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("Enter the num:");
//        switch(num) {
//            case(num%3 == 0 && num%5 == 0):
//            System.out.println("FizzBuzz");
//            break;
//            case num%3==0:
//            System.out.println("FIZZ");
//            break;
//            case(num % 5 == 0):
//            System.out.println("BUZZ");
//            break;
//            default:
//                System.out.println(num);
//                break;
//        }

        }

    }

