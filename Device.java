class Device
{
    protected String name;
    protected String characteristics;
    public Device(String name, String characteristics)
    {
        this.name = name;
        this.characteristics = characteristics;
    }
    public void sound()
    {
        System.out.println("Звук пристрою");
    }
    public void show()
    {
        System.out.println("Назва пристрою: " + name);
    }
    public void desc()
    {
        System.out.println("Опис пристрою: " + characteristics);
    }
}
class Kettle extends Device
{
    public Kettle(String name, String characteristics)
    {
        super(name, characteristics);
    }
    @Override
    public void sound()
    {
        System.out.println("Чайник: 'кіпіння води'");
    }
}
class Microwave extends Device
{
    public Microwave(String name, String characteristics)
    {
        super(name, characteristics);
    }
    @Override
    public void sound()
    {
        System.out.println("Мікрохвильовка: 'дзвінкий звук'");
    }
}
class Car extends Device
{
    public Car(String name, String characteristics)
    {
        super(name, characteristics);
    }
    @Override
    public void sound()
    {
        System.out.println("Автомобіль: 'гучний звук двигуна'");
    }
}
class Steamship extends Device
{
    public Steamship(String name, String characteristics)
    {
        super(name, characteristics);
    }
    @Override
    public void sound()
    {
        System.out.println("Пароплав: 'гучний та протяжний звук'");
    }
}
