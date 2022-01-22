import java.util.*;

public class Bibliotheque {
    public static void main(String args[]){
    ArrayList<Livre> livre = new ArrayList<>();
    Livre e = new Livre("history", "a brief history of homosapiens", "dakdlazza dzabdzaldza");
    Livre e1= new Livre("history", "world war II", "dakdlazza dzabdzaldza");
    Section s = new Section("history", livre);
    s.ajouter(e); s.ajouter(e1);
    s.affiche();
    s.lookForBook("history");
    System.out.println("------");
    ArrayList<Section> l = new ArrayList<>();
    Section s2 = new Section("drama", livre);
    Section s3 = new Section("youssef", livre);
    
    Biblio o = new Biblio(l);
    o.ajouter(l, s);
    o.ajouter(l, s2);
    o.ajouter(l, s3);
    o.affiche();

    System.out.println("-----");
    o.supprimer(l, s2);
    o.affiche();
}
}

class Section {
    private String nomSection;
    private ArrayList<Livre> sect;
    public Section(String nom, ArrayList<Livre> sect){
        nomSection= nom;
        this.sect = sect;
    }

    public String getNom(){
        return nomSection;
    }

    public void affiche(){
        for(Livre s : sect)
            System.out.println(s.getTitre());
    }

    public void ajouter(Livre e){
        sect.add(e);
    }

    public void supprimer(Livre e){
        if(sect.contains(e))
            sect.remove(e);
    }

    public int getCard(){
        return sect.size();
    }


    public void lookForBook(String theme){
        for(Livre l : sect){
            if(theme.equals(l.getTheme()))
                System.out.println("books in "+theme+" are: "+ l.getTitre());
        } 
    }
}


class Biblio{
    private ArrayList<Section> sections;
    public Biblio(ArrayList<Section> sections){
        this.sections = sections;
    }
    
    public void ajouter(ArrayList<Section> sections, Section e){
        sections.add(e);
    }


    public void supprimer(ArrayList<Section> sections, Section e){
        if(sections.contains(e))
            sections.remove(e);
    }
    public void affiche(){
        for(Section s : sections)
            System.out.println(s.getNom());
    }

    

    
}


class Livre{
    private String theme, titre, desc;
    public Livre(String theme, String titre, String desc){
        this.theme = theme;
        this.titre = titre;
        this.desc  = desc;
    }

    public String getTitre(){
        return titre;
    }

    public String getTheme(){
        return theme;
    }
}