import javax.swing.JOptionPane;

public class Trabalho {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int num, numP, contador, conta, num22, divisor, media, fat, menor, resultado, numeroAtual, menorNumero;

		boolean isPrimo;
		String entrada;
		int[] numeros20 = new int[20];
		contador = 1;
		numP = 0;
		conta = 0;
		num22 = 0;
		isPrimo = true;
		divisor = 0;
		fat = 1;
		media = 0;
		resultado = 0;
		numeroAtual = 0;
		menorNumero = 0;

		for (int x = 0; x < 20; x++) {

			entrada = JOptionPane.showInputDialog("Informe um numero");
			num = Integer.parseInt(entrada);

			if (num < 2) {
				numP++;
				System.out.println("È primo");
				System.out.println("Foram informado =" + numP);
			}

			for (int i = 2; i <= num; i++) {
				if (((num % i) == 0) && (i != num)) {
					isPrimo = false;
					divisor = i;
					break;
				}
			}

			if (isPrimo) {
				numP++;
				System.out.println("é Primo");
				System.out.println("Foram informado " + numP + " Primo");
			} else {
				System.out.println("Não é Primo --> " + num);
			}

			if (num == 22) {
				num22++;
				System.out.println("O numero 22 foi digitado = " + num22);
			}
			if (num % 5 == 0) {
				System.out.println("O número é multiplo de 5");
			} else {
				System.out.println("O número não é multiplo de 5");
			}
			if (num % 2 == 0) {
				System.out.println("Par = " + (num));
			} else {
				System.out.println("Impar = " + (num));
			}

			numeros20[x] = num;

			numeroAtual = num;
			fat = 1;
			if (menorNumero == 0 || numeroAtual < menorNumero) {

				menorNumero = numeroAtual;

				for (int z = 1; z <= menorNumero; z++) {

					fat *= z;
					System.out.println("fatorial de " + menorNumero + " e : " + fat);

				}
			}

			for (int i = 0; i < numeros20.length; i++)
				media += numeros20[i];

			float total = (float) media / numeros20.length;

			System.out.println("A média é: " + total);
			System.out.println("=============================================================");
			System.out.println("=============================================================");
		}

	}

}
