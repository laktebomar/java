import java.lang.reflect.Array;

import jdk.internal.vm.vector.VectorSupport.VectorCompareOp;

public class Td1{
    public static void main(String[] args) {
            /*Point A = new Point(2, 4);
            Point B = new Point(1,2);
            System.out.println(Point.plusLoin(A, B));*/

            Vecteur tab = new Vecteur(4, 3);
            Vecteur tab1 = new Vecteur(4, 3);
            //int[]  tab1 = new int[4];
            //int[] arr = UrilTab.sumVec(tab, tab1);
            System.out.println(somme(tab, tab1));
            tab.affiche();
        }
}       


class Point {
    private int x, y;
    public Point(int a, int o){
        x=a;
        y=o;
    }


    static String plusLoin (Point A, Point B){
        int dist_0 = A.x*A.x +A.y*A.y;
        int dist1_0 = B.x*B.x +B.y*B.y;
        if (dist_0 > dist1_0){
            return "("+ A.x + ", " + A.y+")";
        }
        return "("+ B.x + ", " + B.y+")";
    }
} 

/*class UrilTab {

    static int somme(double[] tab){
        int s = 0;
        for (int i=0; i<tab.length; i++){
                s += tab[i];
        }
        return s;
    }

    static double[] incr(double[] tab, int c){
        for (int i =0; i< tab.length;i++){
            tab[i] += c;
        }
        return tab;
    }
    static double[] genere(double[] tab, int n){
        double[] arr={0, 0, 0, 0, 0};
        for (int i =0; i< tab.length;i++){
            if (i%2==0){
                ;
            }
            else{
            arr[i] = tab[i];}
        }
        return arr;
    }
    static void afficher(double[] tab, int n){
        for (int i =0; i< n;i++){
            System.out.println(tab[i]+"\n");
        }
    }
}*/

/*class UrilTab{
    static double sum(double[] tab){
        double s = 0;
        for(double elem:tab){
            s+=elem;
        }
        return s;
    }
    static double[] increment(double[] tab, double e){
        for(int i=0; i<tab.length; i++){
            tab[i]+=e;
        }
        return tab;
    }
    static void afficher(int[] tab){
        for (int i =0; i< tab.length;i++){
            System.out.println(tab[i]+"\n");
        }
    }

    static int[] sumVec(int[] tab1, int[] tab2){
        for(int i=0; i<tab1.length;i++){
            tab1[i]+=tab2[i];
        }
        return tab1;
    }
}*/


class Vecteur
{

        public Vecteur(double[] v){
            this.v = v;
        }

        public void affiche(){
            for (int i =0; i< v.length;i++){
                System.out.println(v[i]+"\n");
            }
        }
        /*public int prod_scalaire(Vecteur v, Vecteur z){
            int s = 0;
            for (int i=0;i<v.length; i++){
                s += v.i+z.i;
            }
            return s;
        }*/

        static double somme(Vecteur a, Vecteur b){
            double s = 0;
            if(a.length !=b.length){
                return 0;
            }
            for(double i=0; i<a.length;i++){
                s += a.i+b.i;
            }
            return s;
        }
}


