public class Rectangulo extends Figura {
    double l1;
    double l2;
    public Rectangulo (double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }
    @Override

    public double area (){
        return this.l1*this.l2;
    }

    public double getl1(){
        return this.l1;
    }
    @Override

    public String toString() {
        return "Rectangulo con Lados: " + this.l1 + " i " + this.l2 + ", Y tiene un area de " + this.area() + " m^2";
    }
}