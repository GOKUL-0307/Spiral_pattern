import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int g = (n * 2) - 1;
        int[][] a = new int[g][g];
        for (int i = 0; i < g; i++) {
            if (i < n) {
                for (int k = i; k < g - i; k++) {
                    a[i][k] = n - i;
                }
            } else {
                for (int j = n - ((i + 2) - n); j <= i; j++) {
                    a[i][j] = (i - n) + 2;
                }
            }
        }
        for (int i = 0; i < g; i++) {
            if (i < n) {
                for (int k = i; k < g - i; k++) {
                    a[k][i] = n - i;
                }
            }
            else {
                for (int j = n - ((i + 2) - n); j <= i; j++) {
                    a[j][i] = (i - n) + 2;
                }
            }
        }

            for (int l = 0; l < g; l++) {
                for (int j = 0; j < g; j++) {
                    System.out.print(a[l][j]+" ");
                }
                System.out.println();
            }
        }
    }