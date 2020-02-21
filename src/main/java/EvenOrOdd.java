import java.util.Scanner;

public class EvenOrOdd {
    public void even_or_odd(int number){
        if (number % 2 == 0)
        {
            System.out.println("even");
        } else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to check if it's Even or Odd: ");
        int number =input.nextInt();
        EvenOrOdd odd = new EvenOrOdd();
        odd.even_or_odd(number);
    }
}

