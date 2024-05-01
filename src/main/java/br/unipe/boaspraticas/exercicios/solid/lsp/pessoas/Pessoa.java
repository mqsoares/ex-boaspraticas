package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

class Pessoa implements Greeting {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void greeting() {
        System.out.println("Oi!");
    }
}