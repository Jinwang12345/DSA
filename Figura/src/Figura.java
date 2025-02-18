public abstract class Figura implements Comparable<Figura> {
    public abstract double area(); // Cada subclase implementara este metodo

    @Override
    public int compareTo(Figura otraFigura) {
        return Double.compare(this.area(), otraFigura.area());
        // Ordenará las figuras por área de menor a mayor
    }
}
