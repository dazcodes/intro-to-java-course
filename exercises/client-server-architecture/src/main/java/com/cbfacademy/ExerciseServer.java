package com.cbfacademy;
import java.net.*;
import java.io.*; 

//while true will make the code run continuously so on a loop
//server socket is looking for port 4040
//autoflush will clear the buffer and make sure its been cleared out immediately 
public class ExerciseServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(4040)) {
            System.out.println("Server is listening on port 4040...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                    String message = in.readLine();

                    System.out.println("Received message from client: " + message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//use to run code ./mvnw -q clean compile exec:java -Dexec.mainClass=com.cbfacademy.ExerciseServer
