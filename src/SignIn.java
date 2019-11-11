import java.util.ArrayList;
import java.util.Scanner;

public class SignIn {

    public void signIn(ArrayList<User> arr, String social){
        Scanner key=new Scanner(System.in);
        System.out.println("Please enter your email address :");
        String email=key.next();
        System.out.println("Please enter new password :");
        String pass=key.next();
        for(User a:arr) {
            if(a.getName().equalsIgnoreCase(email)){
                if(a.getPassword().equalsIgnoreCase(pass)){
                    System.out.println("you are logged on to " + social);
                }
            }
        }
    }
}
