public class Product {
    public double price=10;
    public double getMethod()
    {
        return price;
    }

    public double getMethod(int q) {
        return (q*price);
    }
    public double getMethod(int q,int q1)
    {
        return (q+q1)*price;
    }
    public double setMethod(double d) {
        price = d;
        return d;
    }
}