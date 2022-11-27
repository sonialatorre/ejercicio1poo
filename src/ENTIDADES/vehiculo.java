package ENTIDADES;

public class vehiculo {
    public String velocidad;
    public String marca;

    public void movimiento (){
        System.out.println("auto en movimiento");

    }
    public void funcion (){
        System.out.println("auto en funcionamiento");
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "velocidad='" + velocidad + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
