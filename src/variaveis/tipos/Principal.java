package variaveis.tipos;

public class Principal {
    public static void main(String[] args) {
    int quantidadePassos = 500;
    double alturaMetros = 1.60;
    String nome = "José";

    if (quantidadePassos < 1000) {
        String sugestao = "Sugiro que você tente aumentar sua meta!";
        alturaMetros = 2.3;
        System.out.println(sugestao);
    }
    }
}
