package srcJAN22;
import java.util.Scanner;
public class LAB003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter triangle sides:");
        int side_A = sc.nextInt();
        int side_B = sc.nextInt();
        int side_C = sc.nextInt();

        if(side_A == side_B && side_B == side_C && side_C == side_A)
        {
            System.out.println("Equilateral triangle");
        }
        else if(side_A == side_B || side_B == side_C || side_C == side_A)
    {
            System.out.println("Isoceles triangle");
        }
        else{
            System.out.println("Scalene");
        }
    }
}
