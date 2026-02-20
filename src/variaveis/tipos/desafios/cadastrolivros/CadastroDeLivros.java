package variaveis.tipos.desafios.cadastrolivros;
public class CadastroDeLivros {
    public static void main(String[] args) {
        String titulo = "O Pequeno Príncipe";
        String autor  = "Antoine de Saint-Exupéry";
        int numeroPag = 96;
        double preco = 36.90;
        char categoria = 'F';
        String categoriaDescricao;

        if (categoria == 'F'){
            categoriaDescricao = "Ficção";
        } else if (categoria == 'N') {
            categoriaDescricao = "Não-Ficção";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }
        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + numeroPag + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");
    }
}
//Você está iniciando suas atividades como pessoa desenvolvedora e foi designado para criar um programa de cadastro de
//livros que será escolhida através de um único caractere.