class Pentagono extends Shape {
    private double lado;

    public Pentagono(double lado) {
        super("Pentágono");
        this.lado = lado;
    }

    public double calcularArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }
}