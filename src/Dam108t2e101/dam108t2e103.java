package Dam108t2e101;
public class dam108t2e103 {
    public static void main(String[] args) {
        // creamos una figura
        System.out.println("Creamos una figura 2D");
        Figura2D_v3 fig1 =  new Figura2D_v3(12.89, 23.6574);
        // vemos dimensiones de la figura
        fig1.verDim();
        
        // creamos un triangulo
        System.out.println("Creamos un Triangulo");
        Triangulo_v3 tri1 = new Triangulo_v3(6, 8, "rectangulo");
        
        // calculamos el area del triangulo
        
        System.out.println("El area del triangulo es "+tri1.area());
    }
    
}
