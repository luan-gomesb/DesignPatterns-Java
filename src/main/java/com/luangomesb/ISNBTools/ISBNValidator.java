package com.luangomesb.ISNBTools;

public class ISBNValidator {

   public static final int SHORT_ISBN_LENGTH = 10;
  public static final int LONG_ISBN_LENGTH = 13;

  public static boolean check(String iSBNString) {
    if (iSBNString.length() != SHORT_ISBN_LENGTH)
      throw new NumberFormatException("ISBN Number must be 10 digits long");
    return checkShortISBNNumber(iSBNString);
  }

  private static boolean checkShortISBNNumber(String iSBNString) {
    int total = 0;

    for (int i = 0; i < SHORT_ISBN_LENGTH; i++) {
      char c = iSBNString.charAt(i);
      if (!Character.isDigit(c) && c != 'X')
        throw new NumberFormatException("ISBN Number must be only digits");
      if (c == 'X') {
        total += 10;
      } else {
        total += Integer.parseInt(c + "") * (SHORT_ISBN_LENGTH - i);
      }

    }

    return (total % 11) == 0;
  }

}
