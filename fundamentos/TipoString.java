package fundamentos;

public class TipoString {

    public static void main(String[] args) {

        String s = "Boa Noite";

        System.out.println(s.charAt(2)); // Imprime o caractere na posição 2 (a letra 'a')
        System.out.println(s.length()); // Imprime o comprimento da string (9)
        System.out.println(s.concat("!!!")); // Imprime a string concatenada com "!!!"
        System.out.println(s.startsWith("Boa")); // Verifica se a string começa com "Boa" (true)
        System.out.println(s.toUpperCase()); // Imprime a string em maiúsculas
        System.out.println(s.toLowerCase()); // Imprime a string em minúsculas

        var nome = "Denis";
        var sobrenome = "Silva";
        var idade = 39;
        var salario = 12345.987;

        // Imprime a string formatada com os valores de nome e sobrenome e idade e salário
        System.out.printf("O senhor %s %s tem %d anos e recebe R$ %.2f de salário!", 
        nome, sobrenome, idade, salario);



    }
}
