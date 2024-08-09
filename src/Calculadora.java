import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //contadores de operações
        int contadorAdicao = 0;
        int contadorSubtracao = 0;
        int contadorMultiplicacao = 0;
        int contadorDivisao = 0;

        boolean continuar = true;

        while(continuar){
        System.out.println("bora usar a calculadora");
        System.out.println("Insira o primeiro numero");
        int num1 = scanner.nextInt();

        System.out.println("insira o segundo numero");
        int num2 = scanner.nextInt();

        System.out.println("Escolha uma operação: + (adição), - (subtração), * (multiplicação) e / (divisão)");
        char operacao = scanner.next().charAt(0);

        int resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                contadorAdicao++;
                break;
            case '-':
                resultado = num1 - num2;
                contadorSubtracao++;
                break;
            case '*':
                resultado = num1 * num2;
                contadorMultiplicacao++;
                break;
            case '/':
                if (num2 != 0){
                    resultado = num1 / num2;
                    contadorDivisao++;
                }else{
                    System.out.println("divisão por zero não é permitido");
                    operacaoValida = false;
                }break;
            default:
                System.out.println("Erro:operação invalida");
                operacaoValida = false;
                break;
        }
        if (operacaoValida){
            System.out.println("O resultado da operação é :" + resultado);
        }
        //Menu para continuar ou encerrar
            System.out.println("Deseja realizar outra operação ? (s para sim e n para não) ");
            char resposta = scanner.next().charAt(0);

        if (resposta != 's' && resposta != 'S'){
            continuar = false;

            // Exibir contagem de operações
            int totalOperacoes = contadorAdicao + contadorSubtracao + contadorMultiplicacao + contadorDivisao;
            System.out.println("\nEstatisticas de Operações");
            System.out.println("Adições: " + contadorAdicao);
            System.out.println("Subtrações: " + contadorSubtracao);
            System.out.println("multiplicações: " + contadorMultiplicacao);
            System.out.println("Divisões: " + contadorDivisao);
            System.out.println("Total de operações realizadas: " + totalOperacoes);
            System.out.println("Encerrando o programa....");
        }
    }
    scanner.close();
    }
}