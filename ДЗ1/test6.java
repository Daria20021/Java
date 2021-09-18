import java.util.Arrays;

public class test6 {
    public static void main (String args[]) {
        char[] arrays  = new char[] {'1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        Arrays.sort(arrays);

        for (int a = 0; a < arrays.length; a++) {
            System.out.print(arrays[a]);
        }

        System.out.print("\n");
        for (int b = 5; b <= 9; b++) {
            System.out.print(arrays[b]);
        }
    }
}

