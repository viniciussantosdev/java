package forwhile.desafios;

public class TotalArray {
    public static void main(String[] args) {
        int[] valores = {10,20,30,40,50};
        int soma = 0;
        for (int valor : valores) { // um array virou uma só variavel
            soma += valor; //+= usado SEMPRE para fazer soma
        }
        System.out.println("A soma total de receitas é: " + soma);
    }
}
