package us.mattgreen;
import java.util.Scanner;

public class UserInput
{
    Scanner keyboard = new Scanner(System.in);

    public int getMiceKilled() {
        boolean validNumber = false;
        int miceKilled = 0;
        while (!validNumber) {
            System.out.println("Please enter amount of mice your cat has killed.");
            try {
                miceKilled = Integer.parseInt(keyboard.nextLine());
                validNumber = true;
            }
            catch (NumberFormatException e) {
                System.out.println(e.getLocalizedMessage());
            }
            catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                validNumber = true;
            }
        }
        return miceKilled;
    }

    public String getName() {
        String name = "";
        boolean validName= false;
        while (!validName) {
            System.out.println("Please enter cat's name: ");
            name = keyboard.nextLine();
            validName = checkName(name);
        }
        return name;
    }

    public boolean checkName(String name) {
        boolean isValid = false;
        if (!name.isEmpty() && name != null && name != "Bob") {
            isValid = true;
        }
        return isValid;
    }

}
