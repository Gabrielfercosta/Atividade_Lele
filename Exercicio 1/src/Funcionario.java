public class Funcionario {
    public String nome;
    private float salarioHora;
    public float horasTrabalhadas;

    public Funcionario(String nome, float salarioHora, float horasTrabalhadas) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calculaSalario() {
        return salarioHora * horasTrabalhadas;
    }

}
