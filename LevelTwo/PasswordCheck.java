import java.util.Scanner;

public class PasswordCheck{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    int count = 0;

    while(count != 10){

    System.out.print("Enter password: ");

    String userInput = inputCollector.nextLine();

    if (userInput.equals("Grace")){

        break;
}
        count++;

    }
  
    }
}
