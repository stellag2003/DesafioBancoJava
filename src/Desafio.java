import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String dadosCliente = """
                ***************
                Dados do cliente:
                Nome: Stella Gonçalves
                Tipo Conta: Corrente
                Saldo Inicial: R$ 10.000
                ***************
                """;
        System.out.println(dadosCliente);
        int resposta = 1;
        while (resposta != 4){

            String operacoes = """
                Operações
                
                1- Consultar Saldos
                2- Receber Valor
                3- Transferir Valor
                4- Sair
                
                Informe a opção desejada
                """;

            System.out.println(operacoes);
            resposta = leitor.nextInt();

            switch (resposta) {

                case 1:
                    System.out.println("Seu saldo é de R$ 10.000!");
                    break;

                case 2:
                    System.out.println("Qual valor você quer receber?");
                    double escolha = leitor.nextDouble();
                    double resultado = (escolha + 10000);
                    System.out.println("Seu saldo atualizado é: R$ " + resultado);
                break;

                case 3:
                    System.out.println("Qual valor você quer transferir?");
                    double valor = leitor.nextDouble();
                    if (valor > 10000) {
                        System.out.println("Saldo insuficiente!");
                    }
                    else {
                        double resultado1 = (10000 - valor);
                        System.out.println("Seu saldo atualizado é: R$ " + resultado1);
                    }

                break;

                case 4:
                    System.out.println("Você saiu do banco, volte sempre!");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;

            }


        }
    }
}
