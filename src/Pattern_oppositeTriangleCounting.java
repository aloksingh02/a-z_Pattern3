//     1
//    13
//   135
//  1357
// 13579
//1357911

import java.util.Scanner;
public class Pattern_oppositeTriangleCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of triangle: ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<a-i; j++){
                System.out.print("");
            }
            for(int j=1; j<=i; j++){
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }

    }
}
