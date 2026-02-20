package ifelse.desafios;

public class MediaDoAluno {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 6.0;
        double nota3 = 7.0;
        double nota4 = 9.0;
        double media = ((int) nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 7.0) {
            System.out.println("O estudante teve a média " + media + " e está aprovado!");
        } else if (media >= 5.0 && media >= 6.9) {
            System.out.println("O estudante teve a média " + media + " e está de recuperação!");
        } else {
            System.out.println("O estudante teve a média " + media + " e está reprovado!");
        }
    }
}
