import java.util.Scanner;

public class SumOfOneToFifty{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    int count = 1;

    int sum = 0;
    while(count != 6){

    System.out.print("Enter a number: ");

    int userInput = inputCollector.nextInt();

    sum += userInput;
    count++;
    }
    System.out.println(sum);
    }
}
