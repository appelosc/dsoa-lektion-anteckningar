import java.util.Scanner;

public class Utils {

    public static int getIntInput(String question){
        Scanner userInput = new Scanner(System.in);
        int userInt;
        while(true){
            System.out.print(question);
            try{
                userInt = userInput.nextInt();
                break;
            } catch (NumberFormatException e){
                System.out.println("Du måste ange ett heltal!");
            }catch (Exception e){
                System.out.println("Någoting gick fel. " + e.getMessage());
            }

        }
        return userInt;
    }
}
