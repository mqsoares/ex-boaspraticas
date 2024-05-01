package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

class Funcionario extends  Pessoa implements Greeting {
    private double salario;

    public Funcionario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void calcularSalario() {
    }
    @Override
    public void greeting() {
        super.greeting();
        System.out.println("Hello, How are you!");
    }
}
