public class Cuadrado extends Rectangulo{

    public Cuadrado (double l1, double l2) {
        super(l1, l2);
    }
    @Override

    public String toString(){
        return "Cuadrado con Lado: " +this.getl1() + ", tiene un area de " + super.area() + " m^2";
    }
}