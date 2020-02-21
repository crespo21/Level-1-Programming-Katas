import java.util.Scanner;

public class RightHandedTriangle {
    public static void rightTriangle(int rAt ){

        //for loops

        for (int i =1; i<= rAt; i++){

            for (int j=1; j <= i; j++)

            {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number GREATER than 1 to build a Right Angle Triangle: ");
        int rAt = input.nextInt();
        rightTriangle(rAt);

    }
}

