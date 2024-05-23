public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Prova de recuperação");

        else
        System.out.println("Reprovado");

    //Condição ternária pode abreviar o algoritimo condicional (outra forma de fazer)
        
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "recuperaçao" : "Reprovado";

        System.out.println(resultado);
    }
}
