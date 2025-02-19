public abstract class Figura implements Comparable<Figura> {
    public abstract double area(); // Cada subclase implementara este metodo

    @Override
    // Indica que estamos sobrescribiendo un método de Comparable<Figura>


    public int compareTo(Figura otraFigura) {
        // Compara el área de la figura actual (`this`) con el área de `otraFigura`.
        // Utiliza `Double.compare(a, b)`, que devuelve:
        // - Un número negativo si `this.area()` es menor que `otraFigura.area()`
        // - Cero si ambas áreas son iguales
        // - Un número positivo si `this.area()` es mayor que `otraFigura.area()`
        return Double.compare(this.area(), otraFigura.area());
        // Ordenará las figuras por área de menor a mayor
    }
}
