import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws Exception {
		try {
			Scanner terminal = new Scanner(System.in);

			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();

			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			terminal.close();

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro dever ser maior que o primeiro parâmetro.");
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException();

		} else {
			// realizar o for para imprimir os números com base na variável contagem
			for (int indice = parametroUm; indice < parametroDois; indice++) {
				System.out.println("imprimindo o numero: " + (indice + 1));
			}
		}
	}
}
