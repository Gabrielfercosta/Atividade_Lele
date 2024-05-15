class Losango extends Shape {
    private double diagonal1;
    private double diagonal2;

    public Losango(double diagonal1, double diagonal2) {
        super("Losango");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    public double calcularPerimetro() {
        return 4 * Math.sqrt((diagonal1 / 2) * (diagonal1 / 2) + (diagonal2 / 2) * (diagonal2 / 2));
    }
}