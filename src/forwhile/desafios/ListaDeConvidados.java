package forwhile.desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeConvidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        while (true){
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar): ");
            String nome = scanner.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")){
                System.out.println("Programa Finalizado.");
                break;
            }

            if (nome.equalsIgnoreCase("ver")){
                System.out.println("Lista dos convidados: " + convidados);
                continue;
            }

            boolean jaExiste = false;

            for (String convidado : convidados){
                if (convidado.toLowerCase().equalsIgnoreCase(nome.toLowerCase())) {
                    jaExiste = true;
                    break;
                }
            }

                if (jaExiste) {
                    System.out.println("O nome: " + nome + " Já está na lista!");
                } else {
                    convidados.add(nome);
                    System.out.println(nome + " foi colocado na lista.");
                }

        }
        scanner.close();
    }
}
