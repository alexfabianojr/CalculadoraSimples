package calculadora;
import java.util.Scanner;

public class Body {
	public static void corpoDoPrograma () {
		
		Scanner sc = new Scanner(System.in);
		Soma soma = new Soma();
		Subtracao subtracao = new Subtracao();
		Multiplicacao multiplicacao = new Multiplicacao();
		Divisao divisao = new Divisao();
		
		boolean estadoLoop = true;
		int interruptor;
		
		while (estadoLoop) {
			
			System.out.println("Seja bem vindo! Por Favor, Insira o valor da operação desejada:");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtracao");
			System.out.println("3 - Multiplicacao");
			System.out.println("4 - Divisao");
			System.out.println("0 - Para encerrar o programa");
			interruptor = sc.nextInt();
			
			switch (interruptor) {
				
				case 0:
					estadoLoop = false;
					break;
					
				case 1:
					System.out.println("Insira o primeiro valor a ser somado");
					double entradaUsuarioSoma1 = sc.nextDouble();
					System.out.println("Insira o segundo valor a ser somado");
					double entradaUsuarioSoma2 = sc.nextDouble();
					System.out.println("Resultado da soma é: " + soma.realizandoSoma(entradaUsuarioSoma1, entradaUsuarioSoma2));
					break;
					
				case 2:
					System.out.println("Insira o valor a ser subtraído:");
					double entradaUsuarioSubtracao1 = sc.nextDouble();
					System.out.println("Insira a quantidade a ser subtraida:");
					double entradaUsuarioSubtracao2 = sc.nextDouble();
					System.out.println("Resultado da subtracao é: " + subtracao.realizandoSubtracao(entradaUsuarioSubtracao1, entradaUsuarioSubtracao2));
					break;
					
				case 3:
					System.out.println("Insira um valor a ser multiplicado: ");
					double entradaDoUsuarioMultiplicacao1 = sc.nextDouble();
					System.out.println("Insira o valor do multiplicador:");
					double entradaDoUsuarioMultiplicacao2 = sc.nextDouble();
					System.out.println("Resultado da multiplicação é: " + multiplicacao.realizandoMultiplicacao(entradaDoUsuarioMultiplicacao1, entradaDoUsuarioMultiplicacao2));
					break;
					
				case 4:
					System.out.println("Insira um valor a ser dividido: ");
					double entradaDoUsuarioDivisao1 = sc.nextDouble();
					System.out.println("Insira o divisor: ");
					double entradaDoUsuarioDivisao2 = sc.nextDouble();
					System.out.println("Resultado da divisão é: " + divisao.realizandoDivisao(entradaDoUsuarioDivisao1, entradaDoUsuarioDivisao2));
					break;
					
			}
		}
		sc.close();
	}

}
