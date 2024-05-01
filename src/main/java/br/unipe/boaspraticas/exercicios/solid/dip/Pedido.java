package br.unipe.boaspraticas.exercicios.solid.dip;

class Pedido {
    private DataSource dataSource;

    public Pedido(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void salvar() {
        dataSource.salvarPedido(this);
    }
}
