package model;

public class Person {

    // ATRIBUTOS
    private String name = "Jorge";
    private float weigthInKg = 0.0f;
    private float heightInMeters = 0.0f;

    // Constructor CTOR
    public Person() {  // Los constructores no tienen tipo retorno
        this.name = "";
        this.heightInMeters = 0.0f;
        this.weigthInKg = 0.0f;
    }

    // MÉTODOS
    public float getIMC() {
        return this.weigthInKg / (this.heightInMeters * this.heightInMeters);
    }

    // Pasamos las 3 personas y vamos comparando
    public Person mayorAltura(Person p1, Person p2, Person p3) {
        Person masAlto = p1;

        if (p2.getHeightInMeters() > masAlto.getHeightInMeters()) {
            masAlto = p2;
        }

        if (p3.getHeightInMeters() > masAlto.getHeightInMeters()) {
            masAlto = p3;
        }

        return masAlto;
    }

    // Pasamos las 3 personas y vamos comparando
    public Person mayorPeso(Person p1, Person p2, Person p3) {
        Person masPeso = p1;

        if (p2.getWeigthInKg() > masPeso.getWeigthInKg()) { 
            masPeso = p2;
        }

        if (p3.getWeigthInKg() > masPeso.getWeigthInKg()) {
            masPeso = p3;
        }

        return masPeso;
    }

    // Mostrar resultados , pasamos la persona con mayor altura y perso y lo mostramos por pantalla sacando su nombre
    public void mostrarResultado(Person masAltura, Person masPeso) {
        System.out.println("La persona que tiene mayor altura es " + masAltura.getName());
        System.out.println("La persona con mayor peso es " + masPeso.getName());
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeigthInKg() {
        return weigthInKg;
    }

    public void setWeigthInKg(float weigthInKg) {
        this.weigthInKg = weigthInKg;
    }

    public float getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(float heightInMeters) {
        this.heightInMeters = heightInMeters;
    }
}
