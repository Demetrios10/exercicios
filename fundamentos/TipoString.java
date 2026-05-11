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


        

    }
}
