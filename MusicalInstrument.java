class MusicalInstrument
{
    protected String name;
    protected String characteristics;
    public MusicalInstrument(String name, String characteristics)
    {
        this.name = name;
        this.characteristics = characteristics;
    }
    public void sound()
    {
        System.out.println(name + " видає звук.");
    }
    public void show()
    {
        System.out.println("Інструмент: " + name);
    }
    public void desc()
    {
        System.out.println("Опис інструмента: " + characteristics);
    }
    public void history()
    {
        System.out.println("Історія створення інструмента " + name + ": Невідомо.");
    }
}
class Violin extends MusicalInstrument
{
    public Violin()
    {
        super("Скрипка", "Смичковий струнний інструмент.");
    }
    @Override
    public void sound()
    {
        System.out.println("Скрипка видає мелодійний, пронизливий звук.");
    }
    @Override
    public void history()
    {
        System.out.println("Історія скрипки: Інструмент походить з Італії в XVI столітті.");
    }
}
class Trombone extends MusicalInstrument
{
    public Trombone()
    {
        super("Тромбон", "Мідний духовий інструмент з кулястим розтрубом.");
    }
    @Override
    public void sound()
    {
        System.out.println("Тромбон видає гучний, потужний звук.");
    }
    @Override
    public void history()
    {
        System.out.println("Історія тромбона: Тромбон виник у XV столітті і широко використовується у джазі.");
    }
}
class Ukulele extends MusicalInstrument
{
    public Ukulele()
    {
        super("Укулеле", "Невеликий чотириструнний інструмент родом з Гавайських островів.");
    }
    @Override
    public void sound()
    {
        System.out.println("Укулеле видає м'який, радісний звук.");
    }
    @Override
    public void history()
    {
        System.out.println("Історія укулеле: Інструмент походить з португальських іммігрантів на Гаваях.");
    }
}
class Cello extends MusicalInstrument
{
    public Cello()
    {
        super("Віолончель", "Смичковий струнний інструмент, більший за скрипку.");
    }
    @Override
    public void sound()
    {
        System.out.println("Віолончель видає глибокий, баритоновий звук.");
    }
    @Override
    public void history()
    {
        System.out.println("Історія віолончелі: Виникла в Італії в XVII столітті.");
    }
}
