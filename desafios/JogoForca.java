package desafios;


public class JogoForca {
    public static void main(String[] args) {
        String palavra = "JAVA";
        StringBuilder palavraOculta = new StringBuilder("____");
        char letra;
        int tentativas = 6;

        while (tentativas > 0 && palavraOculta.toString().contains("_")) {
            System.out.println("Palavra: " + palavraOculta);
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            letra = System.console().readLine().toUpperCase().charAt(0);

            if (palavra.indexOf(letra) >= 0) {
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        palavraOculta.setCharAt(i, letra);
                    }
                }
            } else {
                tentativas--;
            }
        }

        if (palavraOculta.toString().equals(palavra)) {
            System.out.println("Parabéns! Você ganhou! A palavra era: " + palavra);
        } else {
            System.out.println("Game Over! A palavra era: " + palavra);
        }
    }
    
}
