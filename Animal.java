class Animal
{
    protected String name;
    protected int age;
    protected double weight;
    public Animal(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void makeSound()
    {
        System.out.println("This animal makes a sound.");
    }
    public void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
    }
    class Tiger extends Animal
    {
        private String furColor;
        public Tiger(String name, int age, double weight, String furColor)
        {
            super(name, age, weight);
            this.furColor = furColor;
        }
        @Override
        public void makeSound()
        {
            System.out.println("Tiger roars!");
        }
        @Override
        public void displayInfo()
        {
            super.displayInfo();
            System.out.println("Fur Color: " + furColor);
        }
    }
    class Crocodile extends Animal
    {
        private double length;
        public Crocodile(String name, int age, double weight, double length)
        {
            super(name, age, weight);
            this.length = length;
        }
        @Override
        public void makeSound()
        {
            System.out.println("Crocodile growls!");
        }
        @Override
        public void displayInfo()
        {
            super.displayInfo();
            System.out.println("Length: " + length + " meters");
        }
    }
    class Kangaroo extends Animal
    {
        private double jumpHeight;
        public Kangaroo(String name, int age, double weight, double jumpHeight)
        {
            super(name, age, weight);
            this.jumpHeight = jumpHeight;
        }
        @Override
        public void makeSound()
        {
            System.out.println("Kangaroo makes a bouncing sound!");
        }
        @Override
        public void displayInfo()
        {
            super.displayInfo();
            System.out.println("Jump Height: " + jumpHeight + " meters");
        }
    }
}
