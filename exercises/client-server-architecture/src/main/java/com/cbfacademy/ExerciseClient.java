package com.cbfacademy;
import java.io.*;
import java.net.*;
//output string socket you want to swet up your message 


public class ExerciseClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4040);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            String message = "Hello, World!";
            out.println(message);
            System.out.println("Sent message to server: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// use to run code ./mvnw -q clean compile exec:java -Dexec.mainClass=com.cbfacademy.ExerciseClient
//run the client code first and then the server code 