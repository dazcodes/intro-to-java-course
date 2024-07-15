//Tuesday 9th July 2024
package com.cbfacademy;
import java.net.URI;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class App {
    public static void main(String[] args) {
        try{
            //URL is the abstract concept 
          URL url = new URI("https://codingblackfemales.com/").toURL();
          //create our connection below and define the connection 
           HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //we want to set a get request
          connection.setRequestMethod("GET");
// when we make requests on the internet it comes back as a stream, so bits of it. this inputstream object will take the input stream and pass to the input stream reader which will handle it and also handle the buffer 
         try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
            while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
          //closing the connection
            connection.disconnect();
          }
//throw exception 'catch' used just incase there is an error
         } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
