import java.util.Scanner;
public class Pattern_rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght: ");
        int a = sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<a-i+1; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
