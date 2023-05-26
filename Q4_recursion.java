import java.util.Arrays;

public class Q4_recursion {
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    private static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            //System.out.println(Arrays.toString(chars));
            for(int i = 0;i<chars.length;i++){
                System.out.print(chars[i]+" ");
            }
            System.out.println();
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                permute(chars, index + 1);
            }
        }
    }

    public static void main(String[] args) {
        char[] chars = {'c', 'a', 'r', 'b', 'o', 'n'};
        permute(chars, 0);

    }
}
