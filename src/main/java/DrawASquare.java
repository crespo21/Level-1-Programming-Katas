import java.util.Scanner;
public class DrawASquare {
    public void square(int area){
        for (int i =0; i< area;i++){
            for (int j= 0; j< area; j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number that's > 1 to build a square: ");
        int area = input.nextInt();
        DrawASquare sqr = new DrawASquare();
        sqr.square(area);
    }
}
