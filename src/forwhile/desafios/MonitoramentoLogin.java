package forwhile.desafios;

import java.util.Scanner;

public class MonitoramentoLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String SENHA_CORRETA = "1234"; //final: o número não pode ser alterado
        for (int tentativas = 3; tentativas > 0; tentativas--) { //tentativas = 3: começa com o valor 3. tentativas > 0:  quando chegar em 0 para. tentativa--: a cada loop ele diminui um.
            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Senha correta! Acesso liberado.");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            } else {
                System.out.println("Acesso bloqueado");
            }
        }
        scanner.close();
    }
}
