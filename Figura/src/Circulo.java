public class Circulo extends Figura{

    // Atributo privado para almacenar el radio del círculo
    private double r;
    // Constructor de la clase Circulo que recibe el radio como parámetro
    public Circulo (double r){
        this.r=r;// Asigna el valor del radio al atributo de la clase
    }
    // Sobrescribe el método area() de la clase Figura
    @Override

    public double area() {
        return Math.PI*this.r*this.r;
    }
    @Override
    // Devuelve una representación en texto del círculo con su radio y área
    public String toString() {
        return "Circulo con Radio: "+this.r+" y area: "+this.area() + " m^2";
    }
}