package contadoragua;

import contadoragua.controller.Calculadora;
import contadoragua.model.Valores;

public class Main {

    public static void main(String[] args) {

        Valores valores = new Valores(1,1,2,1);
        Calculadora calculadora  = new Calculadora(valores);

        System.out.println(calculadora.calculaPrecoAgua());
    }
}
