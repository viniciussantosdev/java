package forwhile.desafios;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int postivos = 0;
        int negativos = 0;

        while (true) {

            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            String entrada = scanner.nextLine();
            if (entrada.equals("fim")) {
                break;
            }
            int numero = Integer.parseInt(entrada);
            if (numero > 0){
                postivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        System.out.println("Números positivos: " + postivos);
        System.out.println("Números negativos: " + negativos);

        scanner.close();
    }
}
