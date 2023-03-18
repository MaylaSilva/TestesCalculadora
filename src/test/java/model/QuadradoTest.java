package model;

import org.junit.Assert;
import org.junit.Test;

public class QuadradoTest {

    @Test
    public void deveCriarQuadradoCorretamente(){
        //Given: um quadrado
        Quadrado quadrado = new Quadrado(4);

        //Then: deve criar um quadrado
        Assert.assertTrue(quadrado.getLado() == 4);
    }
}
