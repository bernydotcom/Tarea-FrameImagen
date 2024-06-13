package herencia;

public class Persona {
    private String nombre;
    private int edad;
    private String domicilio;


    public Persona(){
        this.domicilio = "";
        this.edad = 0;
        this.nombre = "";
        
    }

    public Persona(String nombre, 
                    int edad, 
                    String domicilio){
       this.nombre = nombre;
       this.edad = edad;
       this.domicilio = domicilio; 

    }

    public void setNombre (String nombre){
        this.nombre = nombre;

    }

    public String getNombre(){
        return this.nombre;

    }


}
