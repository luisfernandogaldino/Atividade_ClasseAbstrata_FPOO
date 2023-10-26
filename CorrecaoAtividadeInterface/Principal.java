package CorrecaoAtividadeInterface;

public class Principal {

	public static void main(String[] args) {
		
		Calculando calculando0 = new Calculando();
		System.out.println(" A Soma:"+ calculando0.Somar(9, 4));

		Calculando calculando1 = new Calculando();
		System.out.println(" A Subtração:"+calculando1.Sub(7, 4));

		Calculando calculando2 = new Calculando();
		System.out.println(" A Divisão:"+calculando2.Div(12, 6)); 
		System.out.println(" A Multiplicação:"+calculando2.Mult(7, 4));

		Calculando calculando = new Calculando();
		System.out.println(" O Expoente:"+ calculando.Exp(10, 8));

	}

}
