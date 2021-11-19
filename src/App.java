import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World! I am live. How are you feeling today?");

        Scanner userInput = new Scanner(System.in);
        String str = userInput.nextLine().toLowerCase();
        boolean keepLoop = true;
        int sKey = handleInput(str);

            do {
                switch (sKey) {
                    case 1:
                        System.out.println("I'm sorry to hear that...");
                        keepLoop = false;
                        userInput.close();
                        break;
                    case 2:
                        System.out.println("Great! I hope your day continues that way. =)");
                        keepLoop = false;
                        userInput.close();
                        break;
                    case 3:
                        System.out.println("Hmm.. I didnt seem to understand your answer. Please try typing another synonym for your answer.");
                        sKey = handleInput(userInput.nextLine().toLowerCase());
                        break;
                }
            } while (keepLoop);

        };
        
        public static int handleInput(String input) {
            String[] positiveStr = {"good", "fine", "wonderful", "happy", "great", "fantastic"};
            String[] negativeStr = {"bad", "not so good", "horrible", "im feeling down", "sad"};
            int answer  = 3;

            for (int i = 0; i < negativeStr.length; i++) {
                if (input.equals(negativeStr[i])) {
                    answer = 1; //negative answer
                    break;
                }else{
                    for (int y = 0; y < positiveStr.length; y++) {
                        if (input.equals(positiveStr[y])) {
                            answer = 2;// positive answer
                            break;
                        }
                    }
                }
            }

            return answer;
        }
        
    }



