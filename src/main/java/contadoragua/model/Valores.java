package contadoragua.model;


public class Valores {

    private double precoAgua;
    private double tarifaBasica;
    private int leituraAtual;
    private int leituraMesAnterior;

    public Valores(double precoAgua, double tarifaBasica, int leituraAtual, int leituraMesAnterior) {
        this.precoAgua = precoAgua;
        this.tarifaBasica = tarifaBasica;
        this.leituraAtual = leituraAtual;
        this.leituraMesAnterior = leituraMesAnterior;
    }

    public double precoEsgoto() {
        return precoAgua * 0.7;
    }

    public int consumoDeAgua() {
        return leituraAtual - leituraMesAnterior;
    }

    public double getPrecoAgua() {
        return precoAgua;
    }

    public double getTarifaBasica() {
        return tarifaBasica;
    }
}
