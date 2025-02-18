public class Circulo extends Figura{
    private double r;
    public Circulo (double r){
        this.r=r;
    }
    @Override

    public double area() {
        return Math.PI*this.r*this.r;
    }
    @Override

    public String toString() {
        return "Circulo con Radio: "+this.r+" y area: "+this.area() + " m^2";
    }
}