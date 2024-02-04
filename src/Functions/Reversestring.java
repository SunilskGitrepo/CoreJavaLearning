package Functions;

public class Reversestring {
    public static void main(String[] args) {
        String name = "Sunilkumar";
        char[] ch = name.toCharArray();
        int left = 0;
        int right = ch.length-1;

        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;

        }
        String rev_name = new String(ch);
        System.out.println(rev_name);

//        for(int i = 0; i<=length(); i++){
//        temp = left(i);


    }
}
