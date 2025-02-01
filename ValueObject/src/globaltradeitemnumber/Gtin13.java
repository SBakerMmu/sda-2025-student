package globaltradeitemnumber;

import java.util.Objects;

public final class Gtin13 {

  public static final int LENGTH = CompanyPrefix.LENGTH + ItemReference.LENGTH + 1;
  private final CompanyPrefix prefix;
  private final ItemReference itemReference;
  private final int checksum;

  public Gtin13(CompanyPrefix prefix, ItemReference itemReference) throws InvalidException {
    this.prefix = prefix;
    this.itemReference = itemReference;
    this.checksum = calculateGtinCheckDigit(String.format("%s%s", this.prefix, this.itemReference));
    //post condition is that we have created a valid string representation
    requireValidGlobalTradeIdentifierString(this.toString());
  }

  public static Gtin13 parse(String s) throws InvalidException {

    s = requireValidGlobalTradeIdentifierString(s);
    CompanyPrefix prefix = new CompanyPrefix(
        Integer.parseInt(s.substring(0, CompanyPrefix.LENGTH)));
    ItemReference itemReference = new ItemReference(
        Integer.parseInt(s.substring(CompanyPrefix.LENGTH, LENGTH - 1)));
    return new Gtin13(prefix, itemReference);
  }

  public static Gtin13 tryParse(String s) throws InvalidException {

    if (isValid(s)) {
      return parse(s);
    } else {
      return null;
    }
  }

  static String requireValidGlobalTradeIdentifierString(String s) throws InvalidException {
    if (!isValidLength(s)) {
      throw new InvalidLengthException(s, LENGTH);
    }

    if (!isValidCharacters(s)) {
      throw new InvalidCharacterException(s);
    }

    if (!isValidCheckDigit(s)) {
      throw new InvalidCheckDigitException(s);
    }
    return s;
  }

  public static boolean isValid(String s) {
    return isValidLength(s) && isValidCharacters(s) && isValidCheckDigit(s);
  }

  static boolean isValidLength(String s) {
    return Objects.nonNull(s) && s.length() == LENGTH;
  }

  static boolean isValidCharacters(String s) {
    for (int i = 0; i < LENGTH; i++) {
      if (!Character.isDigit(s.charAt(i))) {
        return false;
      }
    }
    return true;
  }

  static boolean isValidCheckDigit(String s) {
    return calculateGtinCheckDigit(s.substring(0, LENGTH - 1)) == Character.getNumericValue(
        s.charAt(LENGTH - 1));
  }

  //Algorithm from  https://www.gs1.org/services/how-calculate-check-digit-manually
  static int calculateGtinCheckDigit(String gtinWithoutChecksum) {
    // Calculate the checksum
    int sum = 0;
    for (int i = 0; i < gtinWithoutChecksum.length(); i++) {
      int digit = Character.getNumericValue(gtinWithoutChecksum.charAt(i));
      sum += (i % 2 == 0) ? digit : digit * 3;
    }
    return (10 - (sum % 10)) % 10;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Gtin13 that = (Gtin13) obj;
    return prefix.equals(that.prefix) && itemReference.equals(that.itemReference)
        && checksum == that.checksum;
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, itemReference, checksum);
  }

  @Override
  public String toString() {
    return String.format("%s%s%d", prefix, itemReference, checksum);
  }
}
