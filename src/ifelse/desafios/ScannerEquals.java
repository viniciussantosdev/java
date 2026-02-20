package ifelse.desafios;

import java.util.Scanner;

public class ScannerEquals {
    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in); //Definir função do scanner
        System.out.println("Digite a senha: ");
        String tentativaSenha = scanner.nextLine();
        scanner.close();
        if (tentativaSenha.equals(senhaCorreta)){ //A comparação é feita usando o método .equals(),
            //responsável por comparar duas variáveis e verificar se são iguais
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
