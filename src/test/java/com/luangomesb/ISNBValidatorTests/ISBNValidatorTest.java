package com.luangomesb.ISNBValidatorTests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
//import org.omg.CORBA.BooleanHolder;

import com.luangomesb.ISNBTools.ISBNValidator;

public class ISBNValidatorTest {

  @Test
  public void checkValidISBN() {
    String validNumber = "8576082675";
    boolean result = ISBNValidator.check(validNumber);
    assertTrue(result, "should return true for a valid number");
  }

  @Test
  public void checkValidNumberWithX() {
    String validNumber = "012000030X";
    boolean result = ISBNValidator.check(validNumber);
    assertTrue(result, "should return true for a valid number");
  }

  @Test
  public void checkInvalidISBN() {
    boolean result = ISBNValidator.check("8576082676");
    assertFalse(result, "Should return false for a invalid number");
  }

  @Test
  public void checkNumberSize() {
    assertThrows(NumberFormatException.class, () -> {
      ISBNValidator.check("576082676");
    });
    assertThrows(NumberFormatException.class, () -> {
      ISBNValidator.check("95796082676");
    });
  }

  @Test
  public void checkTextAsParam() {
    assertThrows(NumberFormatException.class, () -> {
      ISBNValidator.check("helloworld");
    });
  }

}
