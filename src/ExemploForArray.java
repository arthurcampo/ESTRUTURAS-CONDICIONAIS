public class ExemploForArray {
    public static void main(String[] args) {
    String alunos [] = { "FELIPE", "JONAS", "JULIA","MARCOS" };
        //em array o indice inicia com 0
    for (int=0; x<alunos.length; x++){

        System.out.println("O aluno no indice x=" + x + " é " + alunos [x] );
    }
        //utilizano For Each simplificando o codigo
    //adicionar a variavel
    
    for (String aluno : alunos){
        System.out.println("Nome do aluno é: "+ aluno);
    }// printar os alunos na ordem
    }
}
