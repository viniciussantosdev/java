package ifelse.desafios;

import java.util.Scanner;
public class DiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia da semana (em letras minúsculas):");
        String diaUtil = scanner.nextLine();
        scanner.close();
        if (diaUtil.equals("segunda") || diaUtil.equals("terça") || diaUtil.equals("quarta") ||
                diaUtil.equals("quinta") || diaUtil.equals("sexta")) {
            System.out.println(diaUtil + " é um dia útil");
        } else if (diaUtil.equals("sabado") || diaUtil.equals("domingo")) {
            System.out.println(diaUtil + " não é um dia útil");
        } else {
            System.out.println("Erro de digitação\nDigite novamente!");
        }
    }
}
