package forwhile;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda"}; //array
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00}; //array
        for (int i = 0; i < vendedores.length; i++) {//length percorre até o final da lista (array)
            if (vendedores[i].equalsIgnoreCase("mariana")){//ignorecase ignorar uma string
                continue;
            }
            System.out.printf("%s - comissão %.2f\n", vendedores[i],
                    calcularComissao(vendas[1]));
        }
        int j = 0;
        boolean imprimeOutro = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("%s - comissão %.2f\n", vendedores[j],
                    calcularComissao(vendas[j]));
            j++;
            System.out.println("Deseje imprimir outro?");
            imprimeOutro = scanner.nextBoolean();
        } while (imprimeOutro);
        System.out.println("Todos os nomes:");
        for (String nomeVendedor: vendedores){
            System.out.println("Nomes: " + vendedores);
        }
    }

    public static double calcularComissao(double totalVendas) {
        if (totalVendas <= 5000) {
            return totalVendas * 0.03;
        } else if (totalVendas <= 10000) {
            return totalVendas * 0.05;
        } else {
            return totalVendas * 0.07;
        }
    }

}
