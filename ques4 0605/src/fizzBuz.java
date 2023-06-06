public class fizzBuz {
    void person(int n) {
        for(int i=1;i<=n;i++)
        {
            if((i%3==0) && (i%5==0))
            {
                System.out.print("FizzBuzz" + "\t");
            }
            else if (i%3==0)
            {
                System.out.print("Fizz" + "\t");
            }
            else if (i%5==0)
            {
                System.out.print("Buzz" + "\t");
            }
            else
            {
                System.out.print(i + "\t");
            }
        }

    }
}
