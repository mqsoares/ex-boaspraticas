package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {

        Pessoa joao = new Funcionario("João", 3000);
        joao.greeting(); // Hii!

        Pessoa maria = new Funcionario("Maria", 4000);
        maria.greeting(); // Hii, how are you!
    }
}