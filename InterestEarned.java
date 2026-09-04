import java.util.Scanner;
public class InterestEarned 
{
    public static void main(String[] args)
    {
        double Principal;
        double InterestRate;
        double InterestCompound;
        double rate;
        double amount ;
        double Interest;
        Scanner keyboard = new Scanner(System.in);
        System.out.print ("Enter the principal ");
        Principal = keyboard.nextDouble();
        System.out.print("Enter the Interest rate as a percentage ");
        InterestRate = keyboard.nextDouble();
        System.out.print("Enter the number of times the interest is compounded ");
        InterestCompound = keyboard.nextDouble();
        rate = InterestRate / 100.0;
        amount = Principal * Math.pow(1 + (rate / InterestCompound),InterestCompound);
        Interest = amount - Principal ;
        System.out.println();
        System.out.printf("Interest Rate: %.2f\n", InterestRate);
        System.out.printf("Times Compounded:%.0f\n",InterestCompound);
        System.out.printf("Principal:$%.2f\n ", Principal);
        System.out.printf("Interest:$%.2f\n", Interest);
        System.out.printf("Amount in savings:$%.2f\n", amount);







        
    }
}
