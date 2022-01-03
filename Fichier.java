import java.io.*;
import java.util.Scanner;

public class Fichier {
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
                    if (arr[0].length()<wordToFind.length()|arr[0].length()>wordToFind.length()) {
                        if (arr[0].contains(wordToFind)){
                            System.out.println("maybe you are looking for "+ arr[0]);
                            break;
                        }
                        if (k!=n) System.out.println("looking .. ");
                        if (k==n & !arr[0].contains(wordToFind))  System.out.println("not found");
                    }

                    
                    else if (arr[0].length()==wordToFind.length()) {
                        int z=0;  
                        for(int i=0; i<wordToFind.length(); i++){
                            if (arr[0].charAt(i) == wordToFind.charAt(i)){
                                z++;
                            }    
                        }
                        if(z>=2){
                            if(arr[0].equals(wordToFind)){
                                System.out.println(line); 
                                break;
                            }
                            else{
                                System.out.println("maybe you are looking for "+ arr[0]);
                                break;
                            }
                        }
                                
                        }
             
                         
                    else System.out.println("not found");
                    
                }
                mfrbl=false;
            
        }
        dict_in.close();
    }
    else{
        user_in.close();
        break;
    }
}
}}
