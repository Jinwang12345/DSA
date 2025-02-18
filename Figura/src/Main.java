import java.util.Arrays;
public class Main {
    public static double suma(Figura[] v) {
        double ret = 0;
        for (Figura f : v) {
            ret += f.area();
        }
        return ret;
    }
    public static void sort(Figura[] v){
        Arrays.sort(v);
    }
    public static void print(Figura[] v) {
        for (Figura figura : v) {
            System.out.println("La figura es un "+figura.toString());
        }
    }
    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Circulo(6);
        v[1] = new Rectangulo(6,4);
        v[2] = new Cuadrado(6, 6);
        v[3] = new Triangulo(7,11);

        double res = suma(v);

        System.out.println("Area total es: "+res + " m^2");

        sort(v);

        print(v);



    }
}