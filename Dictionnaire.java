import java.util.Arrays;
import java.util.Scanner;

public class Dictionnaire {
 public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();
    String[] Dict = new String[n];
    
    for (int i=0; i<n; i++){
        System.out.println("entrer un mot:");
        String input = a.next().toLowerCase();
        Dict[i] = input; 
    }
    System.out.println("trouver votre mot prefere dans notre dict:");
    int z=0;
    String user_inpt = a.next().toLowerCase();
    for(int i=0; i<n; i++){
        if (user_inpt.equals(Dict[i])){
            System.out.println("on l'a trouvé");
            break;
        }
        else if (user_inpt.charAt(0)!=Dict[i].charAt(0) | (user_inpt.charAt(0) == Dict[i].charAt(0) & !user_inpt.equals(Dict[i]))){
            z++;
            if (z==n)
                System.out.println("word not found");
        }
        
    }
    System.out.println(Arrays.toString(Dict));
 }   
}
