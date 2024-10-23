public class Human
{
    private String name;
    private int age;
    private String gender;
    public Human(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
class Builder extends Human
{
    private String constructionCompany;
    public Builder(String name, int age, String gender, String constructionCompany)
    {
        super(name, age, gender);
        this.constructionCompany = constructionCompany;
    }
    public String getConstructionCompany()
    {
        return constructionCompany;
    }
    public void setConstructionCompany(String constructionCompany)
    {
        this.constructionCompany = constructionCompany;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Construction Company: " + constructionCompany);
    }
}
class Sailor extends Human
{
    private String shipName;
    public Sailor(String name, int age, String gender, String shipName)
    {
        super(name, age, gender);
        this.shipName = shipName;
    }
    public String getShipName()
    {
        return shipName;
    }
    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Ship Name: " + shipName);
    }
}
class Pilot extends Human
{
    private String airline;
    public Pilot(String name, int age, String gender, String airline)
    {
        super(name, age, gender);
        this.airline = airline;
    }
    public String getAirline()
    {
        return airline;
    }
    public void setAirline(String airline)
    {
        this.airline = airline;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Airline: " + airline);
    }
}
