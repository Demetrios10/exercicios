package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.print("Digite o seu nome: ");
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        

         System.out.print("Digite o sua idade: ");
         Scanner entrada2 = new Scanner(System.in);
         int idade = entrada2.nextInt();
        

         System.out.print("Digite a sua cidade: ");
         Scanner entrada3 = new Scanner(System.in);
         String cidade = entrada3.nextLine();
        
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos e mora em " + cidade + ".");
        entrada.close();
        entrada2.close();
        entrada3.close();

    }
    
}
