import java.util.*;

public class Exo{
   //exo1
    /*public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(14);
        arr.add(9);
        ArrayList<Integer> coef = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(4);
        int userinput;
        boolean mfrbl=true;
        Scanner clavier = new Scanner(System.in);
        
       
        while(mfrbl){
            System.out.println("quel opération vous voulez faire\n1- ajouter\n2- modifier \n3- moyenne des notes\n4- afficher");
            userinput = clavier.nextInt();
            if (userinput==1){
                ajouter(arr, coef);
            }
              
            
            else if(userinput==2)
                modifier(arr, 9, 12);
            else if(userinput==3)
                System.out.println(moyenne(arr, coef)); 
            else{
                System.out.println(arr);
                mfrbl = false;
            }
            
    }
        
}

    public static ArrayList<Integer> ajouter(ArrayList<Integer> l, ArrayList<Integer> coefs){
        Integer i, coef;
        int m, j=0;
        Scanner clavier = new Scanner(System.in);
        System.out.println("combien d'element vous voulez ajouter?");
        m= clavier.nextInt();
        while(j<m){
            System.out.println("entrer la note à ajouter:");
            i = clavier.nextInt();
            System.out.println("entrer son coef ");
            coef = clavier.nextInt();
            coefs.add(coef);
            l.add(i);
            j++;
        }
       
        return l;
    }

    public static double moyenne(ArrayList<Integer> l, ArrayList<Integer> coefs){
        double sum =0;
        for(int i=0; i<l.size(); i++)
            sum+= l.get(i)*coefs.get(i);
        double moy = (sum/l.size());
        return moy;
    }

    public static void affiche(ArrayList<Integer> l){
        System.out.println("tes notes sont: ");
        for (int i=0; i<l.size();i++){
            System.out.println(l.get(i));
        }

    }
    public static void modifier(ArrayList<Integer> arr, Integer e, Integer e2)
    {
    
        arr.set(arr.indexOf(e), e2);
    } */

    //exo 2
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
    }

    public static ArrayList<Integer> singleton(int x){
        ArrayList<Integer> arr = new ArrayList<>();
        if (!arr.contains(x)) arr.add(x);
        return arr;
    }

    public static ArrayList<Integer> ajouter(ArrayList<Integer> arr, Integer a){
        arr.add(a);
        return arr;
    }

    public static void afficher(ArrayList<Integer> l){
        for(Integer elm:l){
            System.out.println(elm);
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> arr, ArrayList<Integer> arr2){
        ArrayList<Integer> s = new ArrayList<>();
        s.addAll(arr); 
        s.addAll(arr2);
        return s;
    }
    

    public static ArrayList<Integer> intersection(ArrayList<Integer> arr, ArrayList<Integer> arr2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Integer elm:arr){
            if (arr2.contains(elm))
                list.add(elm);
        }
        return list;
    }

    public  static boolean isExist(ArrayList<Integer> arr, int x){
        if (!arr.contains(x)) return false;
        return true;
    }

    public static int arrSize(ArrayList<Integer> arr){
        return arr.size();
    }
}