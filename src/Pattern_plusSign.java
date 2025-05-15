//   *
//   *
//*******
//   *
//   *

import java.util.Scanner;
public class Pattern_plusSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a: ");
        int a = sc.nextInt();
        System.out.println("enter the b: ");
        int b = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if((i==(a/2+1)) || (j==(b/2+1))){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }

            }System.out.println();
        }
    }
}
