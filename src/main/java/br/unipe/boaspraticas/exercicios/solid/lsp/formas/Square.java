package br.unipe.boaspraticas.exercicios.solid.lsp.formas;

class Square implements GeometricForms {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    public void draw() {
        // Desenhar um quadrado
    }
}