
import java.util.Scanner;
public class Pattern_oppositeTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
