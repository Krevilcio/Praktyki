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
    
    
    
    public double GetSalary1()
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
            Console.WriteLine("Unable to calculate salary");
        }
        
        return Math.Round(baseSalary * 1.1 * Age, 2);
    }
    
    

    public double GetSalary2()
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
            Console.WriteLine("Unable to calculate salary");
        }
        
        return Math.Round(baseSalary * 2.0 * Age, 2);      
    }
    
    public double GetSalary3()
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
            Console.WriteLine("Unable to calculate salary");
        }
        
        return Math.Round(baseSalary * 3.5 * Age, 2);       
        
    }

}