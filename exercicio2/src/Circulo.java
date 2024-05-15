class Circulo extends Shape {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}