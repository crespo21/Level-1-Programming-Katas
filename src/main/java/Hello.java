import java.util.Scanner;

public  class Hello{
    public static void hello(String name){
        System.out.println("Hello "+name);
    }
    public static  void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        Hello instance = new Hello();
        instance.hello(name);
    }
}
