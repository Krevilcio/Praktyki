namespace Praktyki.Zad2;

public class Cat : AnimalAction
{
    public void AnimalSound()
    {
        Console.WriteLine("Meow");
    }

    public void Run()
    {
        Console.WriteLine("Cat runs sweetly");
    }

    public void Eat()
    {
        Console.WriteLine("Cat eats fish");
    }

    public void Sleep()
    {
        Console.WriteLine("Cat sleeps 12 hours per day");
    }

    public void Purr()
    {
        Console.WriteLine("Cat purrs");
    }

    public void ClimbTree()
    {
        Console.WriteLine("Cat climb trees");
    }
}