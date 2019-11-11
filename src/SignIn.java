import java.util.ArrayList;
import java.util.Scanner;

public class SignIn {
    boolean sign = true;

    public void signIn(ArrayList<User> arr, String social) {
        while (sign) {
            Scanner key = new Scanner(System.in);
            System.out.println("Please enter your email address :");
            String email = key.next();
            System.out.println("Please enter new password :");
            String pass = key.next();
            for (User a : arr) {
                if (a.getName().equalsIgnoreCase(email)) {
                    if (a.getPassword().equalsIgnoreCase(pass)) {
                        System.out.println("you are logged on to " + social);
                        System.out.println("Do you want log off? (yes/no) :");
                        String answer = key.next();
                        if(answer.equalsIgnoreCase("yes")) {
                            sign = false;
                            System.out.println("You have logged off");
                        }
                    }

                }

            }
            if(sign) {
                System.out.println("You have entered an invalid username/password");
            }
        }
    }
}