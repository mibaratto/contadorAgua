package contadoragua.controller;


import contadoragua.model.Valores;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @Before
    public
    void setUp() {
        double precoAgua = 1;
        double tarifaBasica = 10;
        int mesAtual = 2;
        int mesAnterior = 1;
        Valores valores = new Valores(precoAgua, tarifaBasica, mesAtual, mesAnterior);
        calculadora = new Calculadora(valores);
    }

    @Test
    public void deveCalcularPrecoAgua() throws Exception {

        // given
        double precoEsperado = 11.7;

        // when
        double preco = calculadora.calculaPrecoAgua();

        // then
        Assert.assertEquals(precoEsperado, preco, 0);

    }

}