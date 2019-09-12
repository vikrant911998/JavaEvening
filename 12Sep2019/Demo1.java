
import java.util.Scanner;

class Demo1{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("Enter the choice");
        choice = sc.nextInt();

        int result = choice>5 ? 5 : choice;

        System.out.println(result);




        // switch(choice){
        //     case "one":System.out.println("String is one");
        //         break;
        //     case "two":System.out.println("String is two");
        //         break;
        //     case "three":System.out.println("String is three");
        //         break;
        //     default:System.out.println("String is Invalid");
        //         break;

        // };

    }

}
