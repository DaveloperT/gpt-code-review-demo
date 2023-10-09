package com.test.gpt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeBusiness {
    private static final String STRING_TO_PRINT = "I totally agree!";

    public void makeBusiness(String inputString) throws UserInputException {
        if(inputString.equals("error")) {
            throw new UserInputException();
        }

        System.out.println(STRING_TO_PRINT);
    } 
}
