import com.coti.tools.Esdia;

import model.Person;


public class App {
    public static void main(String[] args) throws Exception {

        // Solicitar datos de las tres personas
        String name1 = Esdia.readString("Nombre de la primera persona");
        float weight1 = Esdia.readFloat("Peso de la primera persona");
        float height1 = Esdia.readFloat("Altura de la primera persona");

        Person p1 = new Person();
        p1.setName(name1);
        p1.setWeigthInKg(weight1);
        p1.setHeightInMeters(height1);

        String name2 = Esdia.readString("Nombre de la segunda persona");
        float weight2 = Esdia.readFloat("Peso de la segunda persona");
        float height2 = Esdia.readFloat("Altura de la segunda persona");

        Person p2 = new Person();
        p2.setName(name2);
        p2.setWeigthInKg(weight2);
        p2.setHeightInMeters(height2);

        String name3 = Esdia.readString("Nombre de la tercera persona");
        float weight3 = Esdia.readFloat("Peso de la tercera persona");
        float height3 = Esdia.readFloat("Altura de la tercera persona");

        Person p3 = new Person();
        p3.setName(name3);
        p3.setWeigthInKg(weight3);
        p3.setHeightInMeters(height3);
    }
}
