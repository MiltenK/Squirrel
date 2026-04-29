public class Nut {
    double weight;

    public Nut(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "nut{weight=" + weight + '}';
    }
}