package Pattern;

// Diamond shape pattern.

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diamond size: ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2;
        int i, j;
        int space;

        // upper half
        for(i = 1; i <= mid; i++){
            for(space = 1; space <= mid - i; space++){
                System.out.print(" ");
            }
            for(j = 1; j <= (i * 2) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(i = 1; i <= mid - 1; i++){
            for(space = 1; space <= i; space++){
                System.out.print(" ");
            }
            for(j = 1; j <= 2 * (mid - i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
