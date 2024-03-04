package claseabstracta;

//puede existir metodos contructores pero solo pueden ser utilizados por clases hijas.
/*
Una clase abstracta en Java es una clase que no puede ser instanciada directamente, es decir, no se pueden (o deben) crear objetos de esa clase específica. 
Se utiliza como una clase base o plantilla para otras clases relacionadas.

La principal característica de una clase abstracta es que puede tener métodos abstractos. Un método abstracto es abstracto cuando está declarado pero sin su implementación, 
es decir, no contiene entre sus «llaves» nada de código.  En un método abstracto, solo se declara su firma, incluyendo el nombre del método y los parámetros que acepta cerrando 
la línea con «;», nada más que eso.

Cuando una clase declara al menos un método abstracto, se debe marcar como abstracta utilizando la palabra clave «abstract». 
Una clase abstracta puede tener tanto métodos abstractos como métodos concretos (implementados), pero si o si debe implementar al menos un método abstracto 
para considerarse como clase abstracta como tal.

Las clases que heredan de una clase abstracta, llamadas subclases o clases hijas, deben proporcionar una implementación para todos los métodos abstractos heredados. 
Esto significa que las subclases deben completar/implementar los métodos abstractos declarados en la clase abstracta.

Una clase abstracta se utiliza como una abstracción general de la cual se derivan clases más específicas. Proporciona una estructura común y define los métodos abstractos 
que deben implementarse en las subclases. Esto promueve la reutilización del código y la creación de jerarquías de clases.
 */
public abstract class Figura {

    protected double x;//posicion en x
    protected double y;//posicion en y

    protected Figura() {
    }
    
    
    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*
    solo se declara su firma, incluyendo el nombre del método y los parámetros que acepta cerrando 
    la línea con «;», nada más que eso.
     */
    protected abstract double calcular_area();

    

}
