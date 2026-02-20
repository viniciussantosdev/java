package ifelse.desafios;

import java.util.Scanner;

//Ajude Pedro a resolver esse problema! Crie um programa que solicite ao usuário dois números inteiros,
//compare-os e exiba uma mensagem indicando qual é o maior ou se ambos são iguais.
public class NumeroMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        System.out.println("Digite o segundo número:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("O número maior é " + n1);
        } else if (n2 > n1) {
            System.out.println("O número maior é " + n2);
        } else {
            System.out.println("Os números são iguais");
        }
        scanner.close();
    }
}
