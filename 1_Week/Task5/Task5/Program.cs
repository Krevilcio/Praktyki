bool running = true;

while (running)
{
    Console.WriteLine("Enter employee name:");
    string name = Console.ReadLine();
    
    Console.WriteLine("Enter employee age:");
    int age = Convert.ToInt32(Console.ReadLine());
    
    Console.WriteLine("Enter a function: (Driver, Mechanic, Personnel)");
    string function = Console.ReadLine();
    
    Employee employee = new Employee(name, age, function);
    
    double salary1 = employee.GetSalary1();
    double salary2 = employee.GetSalary2();
    double salary3 = employee.GetSalary3();
    
    
    Console.WriteLine($"Employee {name} salary: 1. {salary1} 2. {salary2} 3. {salary3} as {function}");
    
    Console.WriteLine("Do you want to add another employee? (y/n)");
    string answer = Console.ReadLine();

    if (answer.ToLower() != "y")
    {
        running = false;
    }
}