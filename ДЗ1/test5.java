public class test5 {
    public static void main (String args[]) {
        int[] A1 = {1,2,6};
        int[] A2 = {0,3,5};

        for (int i = 0; i < A1.length; i++) {
            if (A1[i] > A2[i]){
                System.out.println((i+1) + " А1 больше А2");
            }else {
                System.out.println((i+1) + " А2 больше А1");
            }
        }

    }
}
