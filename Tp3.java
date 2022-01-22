public class Tp3 {
        public static void main(String[] args){
            Point A = new Point();
            //casting which is cnversing data from atype to another one PointNom C = (PointNom)A;
            C.affiche(); 
    }
}


class Point {
    private double  x, y;
    public Point(int x, int y){
        this.x= x;
        this.y= y; 
    }
    public void affiche(){
        System.out.println("("+this.x+", "+this.y+")");
    }
}

class PointNom extends Point{
    private String pt_nom;
    public PointNom(int x, int y, String pt_nom){
        super(x,y);
        this.pt_nom =pt_nom; 
    }
    public void affiche(){

        super.affiche();
        System.out.println("nom est "+ pt_nom);
    }
} 