/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distr.sheet.pkg2.exerc.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Marc
 */
public class DistrSheet2Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Geben Sie ihr zu setzendes Passwort ein");
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       String input = in.readLine(); 
      char [] test=input.toCharArray(); 
       int j=1;
       int h;
       int k=1;
       h= test.length;
       if (h>=8){
           
       }
       else{
           System.out.println("Das Passwort braucht mindestens 8 Zeichen, einen Großbuchstaben und eine Zahl");
           return;
       }
       for (int i=0; i<h;i++ ){
         Boolean tmp=Character.isDigit(test[i]);
         if (tmp ==true){
             
             j=2;
             break;
         }
       }
       if (j!=2){
            System.out.println("Das Passwort braucht mindestens 8 Zeichen, einen Großbuchstaben und eine Zahl");
            return;
       }
       
       for (int i=0;i<h;i++){
           Boolean tmp=Character.isUpperCase(test[i]);
           if (tmp==true){
              
                k=2;
                break;
           }
       }
       if (k!=2){
           System.out.println("Das Passwort braucht mindestens 8 Zeichen, einen Großbuchstaben und eine Zahl");
           return;
       }
       System.out.println("Das Passwort erfüllt alle Bedingungen, gratz!");
    }
    
   
    
}
