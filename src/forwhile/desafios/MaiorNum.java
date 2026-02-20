package forwhile.desafios;

import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitr os números por espaço: ");
        String[] numerosStr = scanner.nextLine().split(" "); //.split divide a frase onde tiver espaço
        // esse array com nextline e .split("") significa que esse array pegou todas as informações dadas, mesmo sem declarar ela no array
        int maior = Integer.MIN_VALUE;
        // Integer.MIN_VALUE → menor número possível que um int pode ter
        // Isso garante que qualquer número digitado será maior que ele

        for (String numStr : numerosStr) { //vai percorrer cada numero da array , a cada volta, a variavel numstr recebe um valor da array
            int num = Integer.parseInt(numStr); //parseInt transforma uma String para int
            if (num > maior) {
                maior = num; //atualiza a variavel maior
            }
        }
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}
