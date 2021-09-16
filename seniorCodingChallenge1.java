import java.util.Scanner;

class seniorCodingChallenge1 {
  static int octToDec(int x) {
    int i = 0;
    int bx=0;
    while( i<2) {
      // System.out.print(i+ ": ");
      int pow10 = (int)Math.pow(10,i);
      bx += (int)Math.pow(8,i)*((x/pow10)%10);
      // System.out.println(bx);
      i++;
    }
    return bx;
  }
  static int decToHex(int p) {
    int i = 0;
    int dx=0;
    String dp = Integer.toString(p);
    int l= dp.length();
    while( i<l) {
      // System.out.print(i+ ": ");
      int pow10 = (int)Math.pow(16,i);
      dx += (int)Math.pow(10,i)*((p/pow10)%16);
      i++;
    }
    return dx;
  }
  public static void main(String[] args) {
    
    // Ox42 * Ox42
    int x = 42;
    int y = 42;
    int ans = octToDec(x)*octToDec(y);
    System.out.println(decToHex(ans));

    
  }
  

}

