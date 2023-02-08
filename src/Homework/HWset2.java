package Homework;

public class HWset2 {
    public static void main(String[] args) {
        System.out.println(didIPass(false, 50));
        int[] A1 = {3, 2, 7, 13, 5, 4, 1};
        int[] A2 = {13, 2, 3, 10, 3, 1, 2};
        doubleCount(A1, A2, A1.length, A2.length);
        namePyramid("laina");
    }

    public static boolean didIPass(boolean didIcheat, double finalGrade) {
        if (didIcheat == false && finalGrade > 60) {
            return true;
        } else {
            return false;
        }
    }

    static void doubleCount(int[] A1, int[] A2, int n, int m) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (A1[i] == A2[j])
                    System.out.println(A1[i] + " " + A2[j]);
    }

    public static void namePyramid(String name) {
        for (int i = 1; i <= name.length(); i++) {
            for (int j = 5 - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
