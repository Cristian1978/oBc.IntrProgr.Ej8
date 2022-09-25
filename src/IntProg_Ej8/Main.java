package IntProg_Ej8;


public class Main {

    public static void main(String[] args) {
        // Crear objeto persona
        Persona persona = new Persona();

        persona.setNombre("Cristian");
        System.out.println("Mi nombre es " + persona.getNombre());
        persona.setEdad(43);
        System.out.println("Tengo " + persona.getEdad() + " años de edad");
        persona.setTelefono(379400000);
        System.out.println("Mi teléfono es el nro." + persona.getTelefono());
    }
}
//Crear Clase Persona
class Persona {
    //Crear las variables: edad, nombre y teléfono de la clase Persona
    private int edad;
    private String nombre;
    private int telefono;

    // Gets y Sets de las variales
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
}
