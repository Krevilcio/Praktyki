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
    double salary = employee.GetSalary();
    
    Console.WriteLine($"Employee {name} salary: {salary} as {function}");
    
    Console.WriteLine("Do you want to add another employee? (y/n)");
    string answer = Console.ReadLine();

    if (answer.ToLower() != "y")
    {
        running = false;
    }
}