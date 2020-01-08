package Dam108t2e101;

public class Triangulo extends Figura2D {
    public String estilo;
    
    /* CONSTRUCTOR HIJO */
    Triangulo(){}
    Triangulo(double al, double an, String es){
        super(al, an);
        this.estilo = es;
    }
    
    public void verEstilo(){
        System.out.println(estilo);
    }
    public double area(){
        return (super.alto * super.ancho)/2;
    }
    
}
