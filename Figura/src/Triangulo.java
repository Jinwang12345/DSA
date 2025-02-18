public class Triangulo extends Figura {
    private double b;
    private double h;
    public Triangulo(double b, double h) {
        this.b=b;
        this.h=h;
    }
    @Override

    public double area() {
        return (this.b*this.h)/2;
    }
    @Override

    public String toString() {
        return "Triangulo con Base: "+this.b+" y Altura: "+this.h+", con area: "+this.area()  + " m^2";
    }
}