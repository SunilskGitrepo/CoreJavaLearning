package Jan31;

public class Array1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr1 == arr2);
        System.out.println();
        int[] arr3 = arr1;
        System.out.println(arr1 == arr3);

        arr3[0] = 24;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
