package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.CalculadoraService;

public class TrianguloTest {
    @Test
    public void deveCriarTrianguloCorretamente(){
        //Given: um triângulo
        Triangulo triangulo = new Triangulo(7,14);

        //Then: deve criar um triângulo
        Assert.assertTrue(triangulo.getAltura() == 14);
    }
}
