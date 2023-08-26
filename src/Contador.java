import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException  exception) {
                System.out.println(exception.getMessage());
            }

            System.out.println("Deseja executar novamente? (S/N)");
            String resposta = scanner.next();
            executando = resposta.equalsIgnoreCase("S");
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

