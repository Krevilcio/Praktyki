namespace Praktyki.Zad1;

public class Car
{
    public string Model;
    public string Color;
    public string Brand;
    public int YearOfProduction;
    public double Mileage;

    public Car(string model, string color, string brand, int yearOfProduction, double mileage)
    {
        this.Model = model;
        this.Color = color;
        this.Brand = brand;
        this.YearOfProduction = yearOfProduction;
        this.Mileage = mileage;
    }
}