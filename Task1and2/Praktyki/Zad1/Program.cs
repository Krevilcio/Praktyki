using System;
using Praktyki.Zad1; 


namespace Praktyki.Zad1
{
    class Program
    {
        static void Main(string[] args)
        {
            Car car1 = new Car("Aventador SVJ", "Red", "Lamborghini", 2020, 7500);
            Car car2 = new Car("Mustang", "Blue", "Ferrari", 2019, 12000.7);

            Console.WriteLine($"Car 1: {car1.Model}, {car1.Color}, {car1.Brand}, {car1.YearOfProduction}, {car1.Mileage} km");
            Console.WriteLine($"Car 2: {car2.Model}, {car2.Color}, {car2.Brand}, {car2.YearOfProduction}, {car2.Mileage} km");
        }
    }
}