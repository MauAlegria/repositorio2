
package claseabstracta;


public class Cuadrado extends Figura {
    
    //Atributos Propios
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    
    @Override
    protected double calcular_area() {
        double resultado =  lado * lado;
        return resultado;
    }

    

}
