import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while(true){
            Random random = new Random();
            int rand = random.nextInt(1,99);
            System.out.printf("Slumptal: %d\n",rand);
            System.out.println("Q för att avsluta, annars fortsätter vi: ");
            String textInput = scanner.nextLine();

            if(textInput.equalsIgnoreCase("q")){
                System.out.println("Tack o hej!");
                break;
            }
        }
    }
}
