import java.util.*;

public class DicctList {
    
   
    
    public static void main(String[] args) {
        ArrayList<Dict> Dictionnaire = new ArrayList<>(3);
        Dictionnaire.add( new Dict("omar", "dzddzdz"));
        Dictionnaire.add( new Dict("aaa", "azdza"));
        Dictionnaire.add( new Dict("zzz", "dzddzadz"));
       
        String s = "hmar";
        for(Dict elm: Dictionnaire)
            if (elm.getMot().equals(s))
                System.out.println(elm.getDéf());
            else
                {
                    if (compute_Levenshtein_distance(s, elm.getMot())<=1){
                        System.out.println("maybe your are looking for: " +elm.getDéf());
                    }

                }
    }


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
  

}



class Dict{
    private String mot, déf;
    public Dict(String mot, String déf){
        this.mot = mot; this.déf = déf;
    }

    public String getMot() {
        return mot;
    }

    public String getDéf(){
        return mot+" : "+déf;
    } 
}