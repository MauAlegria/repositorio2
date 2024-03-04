
package claseabstracta;


public class Circulo extends Figura{

    private double radio;

    @Override
    protected double calcular_area() {
        double pi = 3.1416;
        double resultado = pi * radio * radio;
        return resultado;
    }

    public Circulo() {
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
 

}

  

    
    
    
    
    

