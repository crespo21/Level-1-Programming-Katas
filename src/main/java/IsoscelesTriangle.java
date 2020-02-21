import java.util.Scanner;

public class IsoscelesTriangle {


    public static void isosceles(int index){


        for (int i = 0; i <=index; i++){


            for (int j = 2; j>=i; j--){
                System.out.print(" ");

            }
            for (int k = 1; k<=(2*i); k++){

                System.out.print("*");
            }

            System.out.println("*");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number greater than 0 to build an Isosceles Triangle: ");
        int index = input.nextInt();
        isosceles(index);
    }

}
