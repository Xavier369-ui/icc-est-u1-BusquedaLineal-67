package models;

public class Persona {

    private String name;
    private int age;
    private int value;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Persona [name=" + name + ", age=" + age + "]";
    }
    public int showPersonsByValue(Persona[] personas, int valueBuscado) {
        int contador = 0;

        for (int i = 0; i < personas.length; i++) {
            Persona persona = personas[i];
            if (persona.getValue() == valueBuscado) {
                contador++;
                System.out.println("Persona #" + contador + " encontrada en índice " + i + ": " + persona.getName());
            }
        }

        if (contador == 0) {
            System.out.println("No se encontró ninguna persona con el valor: " + valueBuscado);
        }

        return contador; // ahora podemos capturar el número de coincidencias
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    



}
