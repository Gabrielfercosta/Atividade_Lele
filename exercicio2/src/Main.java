public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        System.out.print("A forma é um: ");
        System.out.println(retangulo.getNome()); 
        System.out.print("A área é igual a: ");
        System.out.println(retangulo.calcularArea());      
        System.out.print("O perímetro é igual a: ");
        System.out.println(retangulo.calcularPerimetro());

        System.out.println("-----------------------------------");

        Circulo circulo = new Circulo(5);
        System.out.print("A forma é um: ");
        System.out.println(circulo.getNome());  
        System.out.print("A área é igual a: ");
        System.out.println(circulo.calcularArea()); 
        System.out.print("O perímetro é igual a: ");       
        System.out.println(circulo.calcularPerimetro());   

        System.out.println("-----------------------------------");

        Losango losango = new Losango(6, 8);
        System.out.print("A forma é um: ");
        System.out.println(losango.getNome());  
        System.out.print("A área é igual a: ");
        System.out.println(losango.calcularArea());  
        System.out.print("O perímetro é igual a: ");    
        System.out.println(losango.calcularPerimetro());

        System.out.println("-----------------------------------");

        Hexagono hexagono = new Hexagono(4);
        System.out.print("A forma é um: ");
        System.out.println(hexagono.getNome()); 
        System.out.print("A área é igual a: ");
        System.out.println(hexagono.calcularArea());      
        System.out.print("O perímetro é igual a: ");
        System.out.println(hexagono.calcularPerimetro()); 

        System.out.println("-----------------------------------");
        
        Pentagono pentagono = new Pentagono(5);
        System.out.print("A forma é um: ");
        System.out.println(pentagono.getNome());  
        System.out.print("A área é igual a: ");
        System.out.println(pentagono.calcularArea());  
        System.out.print("O perímetro é igual a: ");
        System.out.println(pentagono.calcularPerimetro());
    }
}