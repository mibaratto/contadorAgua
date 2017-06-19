package contadoragua.controller;


import contadoragua.model.Valores;

public class Calculadora {

    // tb + consumo  * (agua + esgoto)

    private Valores valores;

    public Calculadora(Valores valores) {
        this.valores = valores;
    }

    public double calculaPrecoAgua() {
        return valores.getTarifaBasica() + valores.consumoDeAgua()
                * (valores.getPrecoAgua() + valores.precoEsgoto());
    }

}
