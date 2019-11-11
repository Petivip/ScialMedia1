import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      ArrayList<User> dbs=new ArrayList<>();
      User user=new User("Petros","melake");
        User user1=new User("tony","melake");
        User user2=new User("monday","melake");
        User user3=new User("tuesday","melake");
        User user4=new User("wendsday","melake");
        User user5=new User("thursday","melake");

        Collections.addAll(dbs,user,user1,user2,user3,user4,user5);

        sign(dbs);




    }
    public static void sign(ArrayList<User> arr) {
        boolean ver = true;

        Scanner key = new Scanner(System.in);
        SignIn singin = new SignIn();


            System.out.println("Facebook, Twitter, LinkedIn, or Instagram");
            System.out.println("Which Social Media do you want to login to: ?");

        while (ver) {
            String ans = key.next();
            if (ans.equalsIgnoreCase("facebook")) {
                singin.signIn(arr, ans);
                ver=false;
            } else if (ans.equalsIgnoreCase("twitter")) {
                singin.signIn(arr, ans);
                ver=false;
            } else if (ans.equalsIgnoreCase("linkedin")) {
                singin.signIn(arr, ans);
                ver=false;
            } else if (ans.equalsIgnoreCase("Instgram")) {
                singin.signIn(arr, ans);
                ver=false;
            } else {
                System.out.println("Please enter one of the above specified platforms");
            }

        }
    }
}
