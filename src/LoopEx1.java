import java.util.Scanner;

public class LoopEx1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //num 1 to 10
        int num1 = 0;
        for (int index = 1; index <= 10; index++){
            num1 = num1 + 1;
            System.out.println(num1);

        }
        System.out.println("****");

        // num 10 to 1
        num1 = 11;
        for (int index = 1; index <= 10; index++){
            num1 = num1 - 1;
            System.out.println(num1);

        }
        System.out.println("****");

        // num odd from 1 to 20
        num1 = -1;
        for (int index = 1; index <= 10; index++){
            num1 = num1 + 2;
            System.out.println(num1);

        }
        System.out.println("****");

        // num even from 1 to 20
        num1 = 0;
        for (int index = 1; index <= 10; index++){
            num1 = num1 + 2;
            System.out.println(num1);

        }
        System.out.println("****");

        // print nums from user input to 1
        System.out.println("enter a number:");
        int userNum = kb.nextInt();
        for (int index = userNum; index > 1;) {
            index--;
            System.out.println(index);
        }


        // sum of all nums from 1 to 10
        num1 = 0;
        for (int i = 1; i <=10; i++){
            num1 += i;
        }
        System.out.println(num1);


        // print sum of all nums from user input to 1
        System.out.println("enter a number:");
        int userNum2 = kb.nextInt();
        for (int i = userNum2;i > 1 ;){
            i--;
            userNum2 += i;

        }
        System.out.println(userNum2);

        // asterisk shapes i ii and iii
        for (int i = 1;i <= 4;i++){
            System.out.println("**********");
        }
        String ast = "";
        for (int i = 1;i <= 5;i++){
            ast += "*";
            System.out.println(ast);
        }
        ast = "     ******";
        for (int i = 1;i <= 5;i++){

            System.out.println(ast.substring(i, i+5));
        }


        // factorial of a number, product of all nums from input to 1
        System.out.println("enter a number:");
        int userNum3 = kb.nextInt();
        for (int i = userNum3;i > 1;){
            i--;
            userNum3 = (userNum3 * i);
        }
        System.out.println(userNum3);


    }
}
