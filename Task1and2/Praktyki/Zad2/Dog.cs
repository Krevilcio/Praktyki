namespace Praktyki.Zad2;

public class Dog : AnimalAction
{
    public void AnimalSound()
    {
        Console.WriteLine("Woof!");
    }

    public void Run()
    {
        Console.WriteLine("Dog runs fast!");
    }

    public void Eat()
    {
        Console.WriteLine("Dog eats a bone");
    }

    public void Sleep()
    {
        Console.WriteLine("Dog sleeps 10 hours per day");
    }

    public void Bark()
    {
        Console.WriteLine("Dog barks : Woof!");
    }
    
    public void fetchBall()
    {
        Console.WriteLine("Dog fetches the ball");
    }
}