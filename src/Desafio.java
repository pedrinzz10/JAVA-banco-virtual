import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Pedro";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;


        System.out.println("__________________________");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n__________________________");


        String menu = """
                
                
                -- DIGITE SUA OPÇÃO --
                
                1- CONSULTAR SALDO
                2- TRANSFERIR VALOR 
                3- RECEBER VALOR 
                4- SAIR
                
                ----------------------
                """;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("O Saldo atualizado é " + saldo);
            } else if (opcao == 2 ) {
                System.out.println("Qual o valor que deseja transferir ? ");
                double valor = scanner.nextDouble();
                if (valor > saldo){
                    System.out.println("não há saldo para realizar transferência");
                } else {
                    saldo -= valor;
                }
            } else if (opcao == 3){
                System.out.println("Qual é o valor recebido ?");
                double valor = scanner.nextDouble();
                saldo += valor;
            } else if (opcao != 4) {
                System.out.println("opção inválida");

            }


        }

        

    }
}
