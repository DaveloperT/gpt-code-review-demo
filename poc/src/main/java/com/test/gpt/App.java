package com.test.gpt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.test.gpt.UserInputException;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main(String[] args) {
        try {
            execute();
        } catch (UserInputException e) {
            e.printStackTrace();
        }
        
    }

    public static void execute() throws UserInputException {
        MakeBusiness mb = new MakeBusiness();
        mb.makeBusiness();
    }

}
