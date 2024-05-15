public class Lider extends Funcionario {
    public Lider(String nome, float salarioHora, float horasTrabalhadas){
        super(nome, salarioHora, horasTrabalhadas);
    }
    @Override
    public double calculaSalario() {
        return super.calculaSalario() * 1.02;
    }
}
