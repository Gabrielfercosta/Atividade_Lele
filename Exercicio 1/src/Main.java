public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("gabriel", 10, 40);
        Gerente gerente = new Gerente("gabriel2", 20, 30);
        Lider lider = new Lider ("gabriel3", 20, 50);
        System.out.println(funcionario.calculaSalario());
        System.out.println(gerente.calculaSalario());
        System.out.println(lider.calculaSalario());


    }
}