/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dystr.sys.sheet.pkg2;

/**
 *
 * @author Marc
 */
public class StringUtil {
private static void printLetterN(String[] args, int n)
{
    for (String word: args){
        System.out.println("Der Buchstabe an Stelle: " +(n+1) +"ist " +word.charAt(n));
        
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           for (int i=0; i<args.length;i++)
    {
        System.out.println("Wort in Kleinbuchstaben:" +args[i].toLowerCase());
    }
           
           System.out.println("Eingabe in umgekehrter Reihenfolge: ");
           for (int i=args.length -1; i>=0;i--){
               System.out.print(args[i]+" ");
           }
           System.out.println("");
         printLetterN(args,0);
         System.out.println("");
         printLetterN(args,1);
    }
    
}
