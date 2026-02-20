package ifelse.desafios;

import java.util.Scanner;

public class VerificarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de acesso: ");
        int codeAcesso = scanner.nextInt();
        System.out.println("Digite o nível de permissão: ");
        int nivelPermitido = scanner.nextInt();
        boolean acesso = codeAcesso == 2023;
        boolean permissao = nivelPermitido <= 3;
        if (acesso && permissao){
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            if (!acesso){
                System.out.println("Acesso negado. O código de acesso está incorreto.");
            } if (!permissao){
                System.out.println("Acesso negado. O nível de permissão numérico está incorreto.");
            }
            scanner.close();
        }
    }
}
