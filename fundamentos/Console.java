package fundamentos;

import java.util.Scanner;

public class Console {
    
    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Boa noite!");
        System.out.println("Até mais!");

        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: R$ %.2f\n", 1234.5678);



        System.out.print("Digite o seu nome: ");
        Scanner entrada = new Scanner(System.in); // System.in é o fluxo de entrada do teclado

        String nome = entrada.nextLine(); // nextLine() lê a linha inteira digitada pelo usuário, incluindo espaços em branco
        
        System.out.println("Olá, " + nome + "!");
        
        entrada.close(); // Fechar o scanner para liberar recursos do sistema

    }
    
}
