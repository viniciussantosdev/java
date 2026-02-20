package ifelse.desafios;

import java.util.Scanner;

public class Doador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o peso do doador(em kg): ");
        int peso = scanner.nextInt();
        scanner.close();
        if (idade >= 18 && idade <= 65 && peso >= 50){
            System.out.println("O doador é compatível para doar sangue!");
        } else if (idade <= 18 || idade >= 65 && peso >= 50) {
            System.out.println("O doador não é compatível.\nMotivo: Deve ter entre 18 e 65 anos.");
        } else if (idade >= 18 && idade <= 65 && peso <= 50) {
            System.out.println("O doador não é compatível.\nMotivo: Deve pesar mais de 50kg.");
        } else {
            System.out.println("O doador não tem nenhum dos critérios atingidos!");
        }
    }
}
