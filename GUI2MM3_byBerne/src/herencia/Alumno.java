package herencia;

public class Alumno extends Persona implements Bailador{
    
    private int boleta;

    public Alumno(String nombre, int edad, String domicilio){
       super(nombre,edad,domicilio);

    }

    @Override
    public void bailar() {
        System.out.println("Estoy bailando y soy "+super.nombre);
    }

    @Override
    public void aplauden() {
        System.out.println("Estoy apluadiendo y soy "+super.nombre);
    }


   

}
