import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestApp {

    public static void main(String[] args) {
        execute();
    }

    private static void execute() {
        MakeBusiness mb = new MakeBusiness();
        mb.makeBusiness();
    }

    private static class MakeBusiness{

        private static final String STRING_TO_PRINT = "This is a demo app";

        public void makeBusiness() throws RuntimeException {
            System.out.println("Type something...");
            String userInput = readUserInput();

            if(userInput.equals("error")) {
                throw new RuntimeException();
            }

            System.out.println("I can agree on that!");
        }

        private String readUserInput() {
            try {
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
                String userInput = reader.readLine();
                
                return userInput;
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            return null;
        }
    }
}