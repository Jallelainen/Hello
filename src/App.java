import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! I am live. How are you feeling today?");

        String[] positiveStr = {"good", "fine", "wonderful", "happy", "great", "fantastic"};
        String[] negativeStr = {"bad", "not so good", "horrible", "im feeling down", "sad"};
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String str;

        str = obj.readLine().toLowerCase();

        for (int i = 0; i < negativeStr.length; i++) {
            if (str.equals(negativeStr[i])) {
            System.out.println("I'm sorry to hear that...");
        }
        }
        
        for (int i = 0; i < positiveStr.length; i++) {
            if (str.equals(positiveStr[i])) {
            System.out.println("Great! I hope your day continues that way. =)");
        }
        }
    }


}
