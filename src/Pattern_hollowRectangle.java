//*********
//*       *
//*       *
//*********


import java.util.Scanner;
public class Pattern_hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int a = sc.nextInt();
        System.out.print("Enter the column: ");
        int b = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                if( i==1 || i==a || j==1 || j==b){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
