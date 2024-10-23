public class Money
{
    private int wholePart;
    private int fractionalPart;
    public Money(int wholePart, int fractionalPart)
    {
        if(fractionalPart >= 100)
        {
            this.wholePart = wholePart + fractionalPart / 100;
            this.fractionalPart = fractionalPart % 100;
        }
        else
        {
            this.wholePart = wholePart;
            this.fractionalPart = fractionalPart;
        }
    }
    public void display()
    {
        System.out.printf("%d.%02d%n", wholePart, fractionalPart);
    }
    public int getWholePart()
    {
        return wholePart;
    }
    public int getFractionalPart()
    {
        return fractionalPart;
    }
    public void setWholePart(int wholePart)
    {
        this.wholePart = wholePart;
    }
    public void setFractionalPart(int fractionalPart)
    {
        if(fractionalPart >= 100)
        {
            this.fractionalPart = fractionalPart % 100;
            this.wholePart += fractionalPart / 100;
        }
        else
        {
            this.fractionalPart = fractionalPart;
        }
    }
    public void subtract(int wholePart, int fractionalPart)
    {
        int totalCents1 = this.wholePart * 100 + this.fractionalPart;
        int totalCents2 = wholePart * 100 + fractionalPart;
        int resultCents = totalCents1 - totalCents2;
        this.wholePart = resultCents / 100;
        this.fractionalPart = resultCents % 100;
    }
}
class Product
{
    private String name;
    private Money price;
    public Product(String name, Money price)
    {
        this.name = name;
        this.price = price;
    }
    public void display()
    {
        System.out.println("Product: " + name);
        System.out.print("Price: ");
        price.display();
    }
}
