package ifelse.desafios;

import java.util.Scanner;

public class IntervaloNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor entre 1000 e 5000: ");
        int valor = scanner.nextInt();
        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor de " + valor + " está dentro do intervalo solicitado");
        } else {
            System.out.println("O valor de " + valor + " não está dentro do intervalo solicitado\nTente Novamente!");
        }
    }
}
