//*       *
// *     *
//  *   *
//    *
//  *   *
// *     *
//*       *


import java.util.Scanner;
public class Pattern_crossInSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int a = sc.nextInt();


        for(int i=0; i<=a; i++){
            for(int j=0; j<=a; j++){
                if((j==i) || j==(a-i-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
