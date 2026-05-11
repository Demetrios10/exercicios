package fundamentos;

public class NotacaoPonto{
    public static void main(String[] args) {
        
    
        String s = "Bom dia X";
        s = s.toUpperCase(); // O método toUpperCase é usado para converter todos os caracteres de uma string para maiúsculas. No exemplo, ele converte a string "Bom dia X" para "BOM DIA X".
        s = s.replace("X", "  Senhora"); // O método replace é usado para substituir um caractere ou uma sequência de caracteres por outro. No exemplo, ele substitui a letra "X" por "  Senhora" na string original "Bom dia X". O resultado final será "Bom dia   Senhora".
        s = s.concat("!!!"); // O método concat é usado para concatenar (juntar) duas strings. No exemplo, ele adiciona "!!!" ao final da string resultante da etapa anterior, que é "Bom dia   Senhora". O resultado final será "Bom dia   Senhora!!!".
        
        System.out.println(s);
        System.out.println("Demetrios".concat("Alves".toUpperCase()));

        String  y  = "Deltas";
        System.out.print(y.concat("City"));

    }
}