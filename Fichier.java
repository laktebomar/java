import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Fichier {

    static int compute_Levenshtein_distance(String str1, String str2)
    {
    
        if (str1.isEmpty())
        {
            return str2.length();
        }
  
      
  
        if (str2.isEmpty()) 
        {
            return str1.length();
        }
  
        int replace = compute_Levenshtein_distance(
              str1.substring(1), str2.substring(1))
              + NumOfReplacement(str1.charAt(0),str2.charAt(0));
  
        int insert = compute_Levenshtein_distance(
                         str1, str2.substring(1))+ 1;
  
        int delete = compute_Levenshtein_distance(
                         str1.substring(1), str2)+ 1;
        
        return minm_edits(replace, insert, delete);
    }
  
    static int NumOfReplacement(char c1, char c2)
    {   
        return c1 == c2 ? 0 : 1;
    }
  
    static int minm_edits(int... nums)
    {
        return Arrays.stream(nums).min().orElse(
            Integer.MAX_VALUE);
    }
public static void main(String[] args) throws IOException {
    
    String word, def, wordToFind;
    boolean trf = true;
    PrintWriter dict = new PrintWriter(new FileWriter("dict.txt"));
   
    String line;
    Scanner user_in = new Scanner(System.in);
    int choice, stp; 
    int n=0;
    System.out.println("choisir ce que vous voulez faire : \n -1 ajouter des mots au dict\n -2 chercher des mots sur dict");
   
   
    while (true){
        choice = user_in.nextInt();
        if (choice == 1){
            while (trf){
                System.out.println("si vous voulez quittez tappez: 0 sinon tapez 1");
                System.out.println("entrer un mot");
                word = user_in.next();    
                System.out.println(("entrer définition"));
                def = user_in.next();
                dict.println(word +" : "+ def);
                stp = user_in.nextInt();
                n++;
                if(stp==0){
                    trf = false;
                };
                
               
            }
            dict.close();
        }
       
        else if (choice ==2){
            BufferedReader dict_in = new BufferedReader(new FileReader("dict.txt"));
            boolean mfrbl = true;


            while(mfrbl){
                System.out.println("entrer un mot");
                wordToFind = user_in.next();
                
                for (int k=0; k<n;k++){
                    line = dict_in.readLine();
                    String[] arr = line.split(" ", 2);                    
                    if (arr[0].equals(wordToFind)) 
                        System.out.println(line);
                    else if (compute_Levenshtein_distance(arr[0], wordToFind)<=2){
                            System.out.println(line);
                                break;
                        }
                    else{
                        if (k ==n){
                            System.out.println("mot n'existe pas");
                            break;
                        }
                        
                    }   
                            
                    }
                    mfrbl=false;
                }
               
                dict_in.close();
        }
       else{
           break;
       }
    }

}
}