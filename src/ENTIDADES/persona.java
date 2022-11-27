package ENTIDADES;

public class persona {
    public String nombre;
    public int edad;
    public String apellido;

    public void caminando (){
        System.out.println("estoy caminando");
    }
    public void cumple (){
        System.out.println( "hoy cumplo años");
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", apellido='" + apellido + '\'' +
                '}';


    }
}
