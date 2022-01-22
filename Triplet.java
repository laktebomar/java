import java.util.*;


public class Triplet{

    public static void main(String args[]) {
        Cercle c = new Cercle(3, 4, 6);
        Cercle c2 = new Cercle(2, 7, 9);
        Cercle c3= new Cercle(3, 5, 7);
        ArrayList<Cercle> l = new ArrayList<>();
        l.add(c);
        l.add(c2);
        l.add(c3);
        for (Cercle elm:l){
        }
    }
}



class Comparateur implements Comparator <Cercle>{
    public int comparer(Cercle c1,Cercle c2){
        int r1 = c1.getR(); int r2 = c2.getR();
        if (r1>r2) return -1;
        else if (r1==r2) return 0;
        return 1;
    }
}

class Cercle{
    private int x, y, r;

    public Cercle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r =r; 
    }

    public void affiche(){
        System.out.println("x: "+ x + ", " + "y: "+y+ "\nr: "+r);
    }
    public int getR(){
        return r;
    }

    
}


