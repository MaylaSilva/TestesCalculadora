package service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    @Before
    public void before(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void somar() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: somar
        int soma =  calculadoraService.somar(a, b);
        // Then: resultado deve ser igual 4
        assertEquals(4, soma);

    }

    @Test
    public void subtrair() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: subtrair
        int subtracao =  calculadoraService.subtrair(a, b);
        // Then: resultado deve ser igual 0
        assertEquals(0, subtracao);

    }

    @Test
    public void dividir() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: dividir
        int divisao =  calculadoraService.dividir(a, b);
        // Then: resultado deve ser igual 1
        assertEquals(1, divisao);

    }

    @Test
    public void multiplicar() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: multiplicar
        int multiplicacao =  calculadoraService.multiplicar(a, b);
        // Then: resultado deve ser igual 4
        assertEquals(4, multiplicacao);

    }
}
