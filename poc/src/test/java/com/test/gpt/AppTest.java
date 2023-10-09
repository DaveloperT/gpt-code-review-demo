package com.test.gpt;

import com.test.gpt.App;
import com.test.gpt.UserInputException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testExecute() throws UserInputException {
        // Arrange
        String inputString = "Test Input";
        MakeBusinessMock mbMock = new MakeBusinessMock();

        // Act
        App.execute(inputString);

        // Assert
        Assert.assertEquals(inputString, mbMock.getLastInput());
    }

    @Test
    public void testReadUserInput() throws IOException{
        // Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("Test Input".getBytes());
        System.setIn(in);

        // Act
        String userInput = App.readUserInput();

        // Assert
        Assert.assertEquals("Test Input", userInput);
    }

    @Test
    public void testMain() {
        // Arrange
        String expectedOutput = "Type something...\n";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Act
        App.main(null);

        // Assert
        Assert.assertEquals(expectedOutput, out.toString());
    }

    // Helper class to mock MakeBusiness for testing execute method
    class MakeBusinessMock extends MakeBusiness {
        private String lastInput;

        @Override
        public void makeBusiness(String input) {
            lastInput = input;
        }

        public String getLastInput() {
            return lastInput;
        }
    }
}
