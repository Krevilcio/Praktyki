using System;
using System.Runtime.InteropServices.JavaScript;

class Employee
{
    public string Name;
    public int Age;
    public string Function;
    
    public Employee(string name, int age, string function)
    {
        Name = name;
        Age = age;
        Function = function;
    }

    public double GetSalary()
    {
        double baseSalary = 0;

        if (Function == "Driver")
        {
            baseSalary = 6000;
        }
        else if (Function == "Mechanic")
        {
             baseSalary = 5000;
        }
        else if (Function == "Personnel")
        {
            baseSalary = 4000;
        }
        else
        {
            baseSalary = 0;
        }

        double result = baseSalary * 1.1 * Age;
        result = Math.Round(result, 2);
        return result;
    }
}
