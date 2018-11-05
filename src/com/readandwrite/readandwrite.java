package com.readandwrite;

import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class readandwrite {
    public static void write() {

        System.out.println("append to txt? Answer Y or N.");
        Scanner userInput = new Scanner(System.in);
        String response = userInput.nextLine();                                                         //Stores user response for whether or not to encrypt
        while (response != "Y") {                                                                   //Checks to see if your response is Y and if it isn't Y or N it prompts you to try again

            if (response.equals("Y")) {
                try {
                    String filename = "passwords.txt";
                    FileWriter fw = new FileWriter(filename, true); //the true will append the new data
                    System.out.println("append to text:");
                    String append = userInput.nextLine();
                    fw.write("\n" + append);//appends the string to the file
                    System.out.println("Do you want to append again? Answer Y or N.");
                    response = userInput.nextLine();

                    fw.close();
                } catch (IOException ioe) {
                    System.err.println("IOException: " + ioe.getMessage());
                }                                           //Same thing as last line but for a different variable
                //Stops the code from continuing to run

            } else if (response.equals("N")) {
                System.out.println("Thanks!");
                break;
            } else {
                System.out.println("Not a valid response");
                System.out.println("Try again, make sure it is Y or N:");
                response = userInput.nextLine();                                                    //Resets the value of the user response
            }
        }
        /*try
        {
            String filename= "passwords.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            Scanner userInput = new Scanner(System.in);
            System.out.println("append to text:");
            String append = userInput.nextLine();
            fw.write(append);//appends the string to the file

            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }*/
    }
}
