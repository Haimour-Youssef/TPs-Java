package ma.education.tp1;
import ma.education.tp1.Salle;

public class Test {
    public static void main(String[] args) {
        Salle o1 = new Salle();
        Salle o2 = new Salle("Salle Information");
        Salle o3 = new Salle(2,"Salle des courses");
        //--------Q:7
        System.out.println("o1--> Nom : "+o1.nom+"  id : "+o1.id);
        System.out.println("o2--> Nom : "+o2.nom+"  id : "+o2.id);
        System.out.println("o3--> Nom : "+o3.nom+"  id : "+o3.id);
    }
}
