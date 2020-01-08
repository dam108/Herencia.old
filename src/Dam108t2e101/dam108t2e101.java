package Dam108t2e101;
public class dam108t2e101 {
    public static void main(String[] args) {
        // creamos una figura
        System.out.println("Creamos una figura 2D");
        Figura2D fig1 =  new Figura2D(15.89645, 25.65874);
        // vemos dimensiones de la figura
        fig1.verDim();
        
        // creamos un triangulo
        System.out.println("Creamos un Triangulo");
        Triangulo tri1 = new Triangulo(3, 4, "rectangulo");
        
        // calculamos el area del triangulo
        
        System.out.println("El area del triangulo es "+tri1.area());
    }
    
}
