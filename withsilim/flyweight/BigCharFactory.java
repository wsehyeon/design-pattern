package withsilim.flyweight;
import java.util.HashMap;

public class BigCharFactory {
  private HashMap<Character, BigChar> BigCharPool = new HashMap<>();
  private static BigCharFactory singleton = new BigCharFactory();
  private BigCharFactory() {}

  public static BigCharFactory getInstance() {
    return singleton;
  }

  public BigChar getBigChar(char charAt) {
    BigChar bigChar = BigCharPool.get(charAt);
    if (bigChar == null) {
      bigChar = new BigChar(charAt);
      BigCharPool.put(charAt, bigChar);
    }
    return bigChar;
  }

}
