import java.util.Scanner;


    public class Vowels {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string input: ");
            String name = sc.nextLine();
            char ch[] = name.toCharArray();
            int count = 0;
            name = name.toLowerCase();
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                {
                    count++;
                }
                //else {
                //    return 0;
                //}
            }
            System.out.println("Number of vowels in given input: "+count);

        }
    }
}
