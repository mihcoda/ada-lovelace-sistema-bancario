import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Ada Lovelace";
        String tipoDeConta = "Corrente";
        double saldo = 1815.99;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoDeConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("\n*************************");

        String menu = """
                 Digite sua opção 
                1- Consultar saldos
                2- Transferir valor
                3- Valor a ser recebido
                4- Sair
                Digite a opção desejada
                """;
        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é" + saldo);
            } else if (opcao ==2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor >saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo" + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebeido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo" + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida");
            }
        }
    }
}
