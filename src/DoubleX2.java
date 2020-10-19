public class DoubleX2 {
  boolean doubleX(String str) {
    int firstX = str.indexOf('x');

    if (firstX < str.length() - 1) {
      return (str.charAt(firstX + 1) == 'x');
    }
    return false;
  }
}
