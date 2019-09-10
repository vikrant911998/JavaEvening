import java.util.Scanner;

class Demo1{
    public static void main(String args[]){
        int a=0;
        double d = 4.765;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        a = sc.nextInt();
        
        System.out.println("The value of a is "+a+" and d is "+d);

        if(a != 4){
            System.out.println("Equal found");
        }
        else if(a == 5){
            System.out.println("Equal found in elseif");
        }
        else{
            System.out.println("Inside Else");
        }
    }

}