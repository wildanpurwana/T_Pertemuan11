/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.bufferedreader;

/**
 *
 * @author Wildan
 */
 import java.io.BufferedReader; 
 
 import java.io.IOException; 
 
 import java.io.InputStreamReader; 
 
public class ClassBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader
        (     System.in) );
        String name = ""; 
 
 
     System.out.print("Please Enter Your Name:");  
     try{name = dataIn.readLine();
     }catch( IOException e )
         { 
 
             System.out.println("Error!");    } 
 
 
  System.out.println("Hello " + name +"!"); 
    }
    
}
