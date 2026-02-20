package variaveis.tipos.desafios;

public class Autonomia {
    public static void main(String[] args) {
        double consumoMedia = 12.5; //12.5 km por litro
        double capacidadeTanque = 50; //tanque máximo de 50l
        double combustivelAtual = 20;
        double distanciaViagem = 200;
        capacidadeTanque = consumoMedia * capacidadeTanque;
        combustivelAtual = consumoMedia * combustivelAtual;
        System.out.println("Autonomia máxima do carro: " + capacidadeTanque);
        System.out.println("Autonomia atual de: " + combustivelAtual);
        if (combustivelAtual >= distanciaViagem) {
            System.out.println("Você vai conseguir fazer a viagem sem precisar abastecer!");
        } else {
            System.out.println("Você vai precisar completar o combustível durante a viagem!");
        }
    }
}
