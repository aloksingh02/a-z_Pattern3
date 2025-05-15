import java.util.Scanner;
public class Pattern_0and1Triangle2Short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(1 +" ");
                }
                else{
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }
}
