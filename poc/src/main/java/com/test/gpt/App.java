package com.test.gpt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.test.gpt.UserInputException;

public class App {
	private static final String ERROR_STRING = "Errore!";
	private static final String DONT_AGREE_STRING = "I do nota agree.";
    
    public static void main(String[] args) {
        try {
            execute(readUserInput());
        } catch (UserInputException e) {
            System.out.println(DONT_AGREE_STRING);
        }        
    }

    public static void execute(String inputString) throws UserInputException {
        MakeBusiness mb = new MakeBusiness();
        mb.makeBusiness(inputString);
    }

    static String readUserInput() {
        System.out.println("Type something...");
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
