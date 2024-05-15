public class Gerente extends Funcionario {
    public Gerente(String nome, float salarioHora, float horasTrabalhadas){
        super(nome, salarioHora, horasTrabalhadas);
    }
    @Override
    public double calculaSalario(){
        return super.calculaSalario() * 1.05;
    }
}
