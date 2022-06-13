package javaArrays;

import java.util.Arrays;

public class secondSmallestNumberArray {
    public static int getSecondSmallstSecondVersia(int[] c, int numb) {
        Arrays.sort(c);
        return c[3];
    }

    public static int getSecondSmallest(int[] a, int total) {
        int num;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (a[i] < a[j]) {
                    num = a[i];
                    a[i] = a[j];
                    a[j] = num;
                }
            }
        }
        return a[1]; //second element
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 9, 2, 4};
        int b[] = {24, 36, 42, 55, 21, 22, 88};
        System.out.println("Second smallest: " + getSecondSmallest(a, 6));
        System.out.println("Second Smallest ; " + getSecondSmallest(b, 7));
        System.out.println("SecondVersia");
        System.out.println("Second Smallest versia: " + getSecondSmallstSecondVersia(a, 6));
        System.out.println("Second Versia " + getSecondSmallstSecondVersia(b, 7));
    }


}
