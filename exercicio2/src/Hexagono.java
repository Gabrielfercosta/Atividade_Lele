class Hexagono extends Shape {
    private double lado;

    public Hexagono(double lado) {
        super("Hexágono");
        this.lado = lado;
    }

    public double calcularArea() {
        return 3 * Math.sqrt(3) * lado * lado / 2;
    }

    public double calcularPerimetro() {
        return 6 * lado;
    }
}