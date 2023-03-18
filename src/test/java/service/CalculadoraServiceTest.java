package service;

import model.Quadrado;
import model.Triangulo;
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
    public void deveSomar() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: somar
        int soma =  calculadoraService.somar(a, b);
        // Then: resultado deve ser igual 4
        assertEquals(4, soma);

    }

    @Test
    public void deveSubtrair() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: subtrair
        int subtracao =  calculadoraService.subtrair(a, b);
        // Then: resultado deve ser igual 0
        assertEquals(0, subtracao);

    }

    @Test
    public void deveDividir() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: dividir
        int divisao =  calculadoraService.dividir(a, b);
        // Then: resultado deve ser igual 1
        assertFalse(divisao == 2);

    }

    @Test
    public void deveMultiplicar() {
        // Given: dois inteiros
        int a = 2;
        int b = 2;
        // When: multiplicar
        int multiplicacao =  calculadoraService.multiplicar(a, b);
        // Then: resultado deve ser igual 4
        assertEquals(4, multiplicacao);

    }
    @Test
    public void deveCalcularAreaTriangulo() {
        // Given: um triangulo
        Triangulo triangulo = new Triangulo(3,4);
        // When: calcular área
        double resultado = calculadoraService.calcularArea(triangulo);
        // Then: resultado deve ser igual 6
        assertEquals(6,resultado,0.0);
    }

    @Test
    public void deveCalcularAreaDoQuadrado (){
        //Given: um quadrado
        Quadrado quadrado = new Quadrado(4);
        //When: calcular área
        double resultado = calculadoraService.calcularArea(quadrado);
        //Then: resultado deve ser igual 16
        assertTrue(resultado==16);
    }

    @Test
    public void deveRetonarOMenorTriangulo(){
        //Given: dois triangulos
        Triangulo triangulo1 = new Triangulo(4,5);
        Triangulo triangulo2 = new Triangulo(6,7);
        //When: verificar o menor triangulo
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);
        //Then: o resultado deve ser o triangulo1
        assertEquals(resultado,triangulo1);
    }

    @Test
    public void deveRetornarOMaiorQuadrado(){
        //Given: dois quadrados
        Quadrado quadrado1 = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(6);
        //When: calcular as areas
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado1,quadrado2);
        //Then: deve retornar o quadrado2
        assertEquals(resultado,quadrado2);
    }

    @Test
    public void deveRetornarNull(){
        //Given: dois quadrados
        Quadrado quadrado1 = new Quadrado(6);
        Quadrado quadrado2 = new Quadrado(6);
        //When: calcular as areas
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado1,quadrado2);
        //Then: deve retornar null
        assertNull(resultado);
    }

    @Test
    public void deveRetornarOMesmoObjeto(){
        //Given: dois quadrados
        Quadrado quadrado1 = new Quadrado(6);
        Quadrado quadrado2 = quadrado1;

        //Then: deve retornar o mesmo quadrado (mesmo endereço na memória)
        assertSame(quadrado1, quadrado2);
    }

    @Test
    public void deveRetornarQueTriangulosSaoDiferentes(){
        //Given: dois triângulos
        Triangulo triangulo1 = new Triangulo(4,5);
        Triangulo triangulo2 = new Triangulo(6,7);
        //When: calcular as áreas
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo1,triangulo2);
        //Then: deve retornar triângulos diferentes
        assertNotNull(resultado);
    }
}
