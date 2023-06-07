// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a[] = {3,99,40,100,66,38,19,2};
        int i;
        int small = a[0];
        int large = a[0];
        for(i = 0; i<a.length; i++)
        {
            if(a[i] < small)
            {
                small = a[i];
            }
            else if (a[i] > large)
            {
                large = a[i];
            }
        }
        System.out.println("Smallest number in array is: "+small);
        System.out.println("Largest number in array is: "+large);

    }
}