package Dam108t2e101;
public class Figura2D_v3 {
    private double ancho;
    private double alto;
    
    /* CONSTRUCTOR PADRE */
    
    Figura2D_v3(){}
    Figura2D_v3(double al, double an){
        this.alto = al; this.ancho = an;    
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public void verDim(){
        System.out.printf("El alto es %.2f y el ancho es %.2f \n", this.alto, this.ancho);
    }
        
}
