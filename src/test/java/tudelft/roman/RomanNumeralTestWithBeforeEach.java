package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    // Se agrega prueba con el valor romano de V y resultado final 5
    @Test
    public void singleNumber5() {
        int result = roman.convert("V");
        Assertions.assertEquals(5, result);
    }

    // Se agrega prueba con el valor romano de X y resultado final 10
    @Test
    public void singleNumber10() {
        int result = roman.convert("X");
        Assertions.assertEquals(10, result);
    }

    // Se agrega prueba con el valor romano de II y resultado final 2
    @Test
    public void multiplenumber2() {
        int result = roman.convert("II");
        Assertions.assertEquals(2, result);
    }

    // Se agrega prueba con el valor romano de III y resultado final 3
    @Test
    public void multiplenumber3() {
        int result = roman.convert("III");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    // Se agrega prueba con el valor romano de VI y resultado final 6
    @Test
    public void numberWithManyDigits6() {
        int result = roman.convert("VI");
        Assertions.assertEquals(6, result);
    }

    // Se agrega prueba con el valor romano de XVI y resultado final 16
    @Test
    public void numberWithManyDigits16() {
        int result = roman.convert("XVI");
        Assertions.assertEquals(16, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    // Se agrega prueba con el valor romano de IX y resultado final 9
    @Test
    public void numberWithSubtractiveNotation9() {
        int result = roman.convert("IX");
        Assertions.assertEquals(9, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    // Se agrega prueba con el valor romano de XIX y resultado final 19
    @Test
    public void numberWithAndWithoutSubtractiveNotation19() {
        int result = roman.convert("XIX");
        Assertions.assertEquals(19, result);
    }

    // Se agrega prueba con el valor romano de VX y resultado final debe ser invalido

    @Test
    public void invalidNumber() {
        int result = roman.convert("VX");
        Assertions.assertEquals(50, result);
        //El programa dice que espera el valor de 5 pero si se le coloca 5 lo coloca como valido, lo cual no es correcto
    }

}
