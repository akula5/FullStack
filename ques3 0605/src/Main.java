// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0, n2=1, n3;
        for(int i=1;i<=n;i++)
        {
            System.out.print(n1 + "\t");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}