package flamingo.aprendendo.introducao;

public class TiposPrimitivos {

    public static void main(String[] args){
        // byte: -128 a 127
        // short: -32.768 a 32.767
        // int: -2bi a 2bi
        // long = para numeros inteiros grandes (usa um L mo final do numero
        // float = precisão simples (usa F no final, ex: 10,50f
        // char = guarda uma unica letra ou simbolo em formato unico (EX: (A) )
        // boolean = guarda apenas dois valores> true (verdadeiro) ou false (falso)
        byte idade = 25;
        int municipio = 114000000;
        long contabancaria = 999999999999999999L;
        float salario = 15000.50f;
        double SalarioExtra = 25000;
        char PrimeiraLetraDoNome = 'E';
        boolean vaiEstudarNasFerias = false;
        System.out.println("vaiEstudarNasFerias");
        System.out.println("Primeira letra do nome é" + PrimeiraLetraDoNome);
        System.out.println("PL caiu = " +SalarioExtra);
        System.out.println("Meu sakario  dewpois de estudar com o bigas é" + salario);
        System.out.println("Minha idade é " + idade);
        System.out.println("São paulo (sp): Mais de " + municipio + "milhoes de moradores");
        System.out.println("Minha conta bancaria daqui 5 anos" + contabancaria);

    }
}
