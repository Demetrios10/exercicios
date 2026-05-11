package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 1000000000000L;


        // tipos numericos reais 

        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false; // true


        // tipo caractere
        char status = 'A'; // ativo

        System.out.println("Anos de Empresa: " + anosDeEmpresa * 365);
        System.out.println("Número de Voos: " + numeroDeVoos / 2);
        System.out.println("ID: " + id);
        System.out.println("Pontos Acumulados: " + pontosAcumulados);
        System.out.println("Salário: " + salario);
        System.out.println("Vendas Acumuladas: " + vendasAcumuladas);
        System.out.println("Está de Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
















    }

}