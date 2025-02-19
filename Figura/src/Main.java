import java.util.Arrays;
public class Main {

    // Método para calcular la suma total de las áreas de todas las figuras en el array
    public static double suma(Figura[] v) {
        double ret = 0;// Inicializa la variable acumuladora de área
        for (Figura f : v) {// Recorre cada figura en el array
            ret += f.area();// Suma el área de cada figura al total
        }
        return ret;// Retorna el área total de todas las figuras
    }
    // Método para ordenar el array de figuras por su área
    public static void sort(Figura[] v){
        Arrays.sort(v); // Usa el método sort() que ordena usando compareTo() de Figura
    }

    // Método para imprimir todas las figuras en el array

    public static void print(Figura[] v) {
        for (Figura figura : v) {// Recorre el array de figuras
            System.out.println("La figura es un "+figura.toString());
        }
    }

    public static void main(String[] args) {
        // Crea un array de figuras con 4 elementos

        Figura[] v = new Figura[4];
        // Se inicializan diferentes figuras con sus respectivos valores

        v[0] = new Circulo(6);
        v[1] = new Rectangulo(6,4);
        v[2] = new Cuadrado(6, 6);
        v[3] = new Triangulo(7,11);
        // Calcula y muestra el área total de todas las figuras

        double res = suma(v);

        System.out.println("Area total es: "+res + " m^2");
        // Ordena las figuras por su área en orden ascendente

        sort(v);
        // Imprime las figuras ordenadas por su área

        print(v);



    }
}