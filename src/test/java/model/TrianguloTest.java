package model;

import org.junit.Before;
import org.junit.Test;
import service.CalculadoraService;

public class TrianguloTest {
    CalculadoraService calculadoraService;
    @Before
    public void before(){
        calculadoraService = new CalculadoraService();
    }
}
