package ifelse.desafios;

import java.util.Scanner;

public class CalculoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = scanner.nextInt();
        scanner.close();
        if (lado1 + lado2 > lado3) {
            System.out.println("Os lados podem formar um triângulo");
        } else {
            System.out.println("Os lados não podem formar um triângulo");
        }
    }
}
