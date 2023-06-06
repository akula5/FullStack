public class age {

    void person(int age)
    {
        if (age>=13 && age<=19)
        {
            System.out.println("Person is Teen");
        }
        else if (age < 13)
        {
            System.out.println("Person is Kid");
        }
        else if (age > 19)
        {
            System.out.println("Person is Adult");
        }
        else
        {
            System.out.println("Person is not in the range of given input");
        }
    }

}
