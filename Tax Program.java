import java.util.Scanner;
/**
 * Program to determine the tax rate
 *
 * Aryaman Subramanian
 * 9/27/26
 */
class Taxprogram
{
    public static void main(String[] args)
    {
        Taxprogram program = new Taxprogram();
        program.SalaryTax();
    }

    public void SalaryTax()
    {
        Scanner input = new Scanner(System.in);

        //get the salary from the user
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();

        //check if the salary is negative
        if (salary < 0)
        {
            System.out.println("Salary cannot be negative.");
            return;
        }

        System.out.printf("Salary is: $%,.2f%n", salary);

        //calculate tax based on salary
        double tax = 0;

        if (salary <= 50000)
            tax = salary * 0.01;
        else if (salary <= 75000)
            tax = 500 + (salary - 50000) * 0.02;
        else if (salary <= 100000)
            tax = 1000 + (salary - 75000) * 0.03;
        else if (salary <= 250000)
            tax = 1750 + (salary - 100000) * 0.04;
        else if (salary <= 500000)
            tax = 7750 + (salary - 250000) * 0.05;
        else
            tax = 20250 + (salary - 500000) * 0.06;

        //calculate all the tax tiers.
        System.out.printf("Tax is: $%,.2f%n", tax);
    }
}
