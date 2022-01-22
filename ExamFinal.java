import java.util.ArrayList;
import java.util.Scanner;



public class ExamFinal {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String type, destination, nom, docs;
        double duree, argent;
        int choix;
        boolean document=false;


        ArrayList<Client> clt = new ArrayList<>();
        ArrayList<Offre> offres = new ArrayList<>();
        //création d'une agence et client 
       Agence a = new Agence("a", 150, offres, 1700, clt);
        Client c = new Client("lakteb", 1600, true);
        Offre o = new Offre("normale", "casablace", 6);
        Offre o1 = new Offre("normale", "kenitra", 6);
        System.out.println("lancer un offre");
        System.out.println("type d'offre");
        type = s.next();
        System.out.println("destination d'offre");
        destination = s.next();
        System.out.println("duree d'offre");
        duree = s.nextDouble();
        Offre nvo = new Offre(type, destination, duree);
        //lancement des offres
        a.lancerOffre(o);
        a.lancerOffre(o1);
        a.lancerOffre(nvo);
        //ajout des cliens aux agences
        System.err.println("ajouter un client");
        System.out.println("saisir son nom:");
        nom = s.next();
        System.out.println("saisir sa somme: ");
        argent = s.nextDouble();
        System.out.println("does he have all docs? ");
        docs = s.next();
        if (docs.equals("oui"))
            document = true;
    

        Client c1 = new Client(nom, argent, document);
        a.ajouterClient(c);
        a.ajouterClient(c1);
        

        //afficher les offres
        a.afficherOffre();
        System.out.println("choisir un offre dans l'agence "+ a.getNom());
        choix = s.nextInt();
        c.choisirOffre(choix-1, a);

        // confirmer ou déliner
        a.confirmation(c1, a.getOffre().get(choix-1));
      
    }
}


class Agence {
    private String nom;
    private ArrayList<Offre> offres;
    private int nbrPlace;private double prix;
    private ArrayList<Client> clt;
    public Agence(String nom, int nbrPlace,ArrayList<Offre> offres,double prix, ArrayList<Client> clt)
    {
        this.clt = clt;
        this.nbrPlace = nbrPlace;
        this.prix = prix;
        this.nom = nom;this.offres = offres;
    }

    public void lancerOffre(Offre o){
        if (!offres.contains(o))
            offres.add(o);
        else System.out.println("offre deja existé");;

    }

    public void afficherOffre() {
        int j = 1;
        for(Offre ofr: offres){
            System.out.println(j +" type: "+ofr.getType()+" destiantion: "+ofr.getDest()+" duree: "+ofr.getDuree());
            j++;
        }}

    public void ajouterClient(Client c){
        if (!clt.contains(c))
            clt.add(c);
        else System.out.println("client deja existé");;
    }



    public ArrayList<Offre> getOffre(){
        return offres;
    }

    public void confirmation(Client c, Offre o) {
        if (o.getType().equals("normale")){
            if (c.getArg()>=prix & clt.size()<nbrPlace)
                System.out.println("vous avez tous les critéres pour voyager");
            else
                System.out.println("vous n'avez pas tous les critéres pour voyager");
        }
        else{
            if (c.getArg()>=prix & c.getDoc() & clt.size()<nbrPlace)
                System.out.println("vous avez tous les critéres pour voyager");
            else
                System.out.println("vous n'avez pas tous les critéres pour voyager");
        }

    }

    public String getNom(){
        return nom;
    }
}



class Client {
    private String nom;
    private double argent;
    private boolean document;


    public Client(String nom, double argent, boolean document){
        this.nom = nom;
        this.argent = argent;
        this.document = document;
    }

   

    public double getArg(){
        return argent;
    }
    
    public Boolean getDoc(){
        return document;
}
    public void choisirOffre(int b, Agence a){
        if (a.getOffre().contains(a.getOffre().get(b)))
            System.out.println("vous avez choisi l'offre suivant: " +a.getOffre().get(b).getDest() +" de duree: " +a.getOffre().get(b).getDuree());
    }
    
}

class Offre{
    private String type, destination;
    private double duree;

    public Offre (String type, String destination, double duree){
        this.type = type;
        this.destination = destination;this.duree = duree;
    }

    public String getType(){
        return type;
    }

    public String getDest(){
        return destination;
    }
    public double getDuree(){
        return duree;
    }

}