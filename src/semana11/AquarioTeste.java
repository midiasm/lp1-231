package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTeste{
    @Test
    // Arrange
    public void testaCalcularVolume(){
    Aquario aquario = new Aquario();
    aquario.comprimento = 100.0;
    aquario.largura = 50.0;
    aquario.altura = 100.0;
    
    //Act
    double volume = aquario.calcularVolume();

    //Assert
    assertEquals(500.00, volume);
    }
}