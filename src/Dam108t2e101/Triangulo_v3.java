package Dam108t2e101;

public class Triangulo_v3 extends Figura2D_v3 {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo_v3(){}
    Triangulo_v3(double al, double an, String es){
        super(al, an);
        this.estilo = es;
    }
    /*
    Añade un constructor a la clase Triangulo al que se le pasan tres parámetros: estilo, alto y ancho.
    Se invocará al constructor por defecto de la clase base.
    Modificar el programa de los ejercicios anteriores para que los triángulos sean creados mediante
    este nuevo constructor.
    */
    
    public void verEstilo(){
        System.out.println(estilo);
    }
    public double area(){
        return ( this.getAlto() * this.getAncho() )/2;
    }
    
}
