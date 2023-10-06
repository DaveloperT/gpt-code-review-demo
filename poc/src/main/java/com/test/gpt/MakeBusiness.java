package com.test.gpt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeBusiness {
    private static final String STRING_TO_PRINT = "I totally agree!";

    public void makeBusiness() throws UserInputException {
        System.out.println("Type something...");
        String userInput = readUserInput();

        if(userInput.equals("error")) {
            throw new UserInputException();
        }

        System.out.println(STRING_TO_PRINT);
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
