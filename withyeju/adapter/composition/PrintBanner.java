package withyeju.adapter.composition;

public class PrintBanner extends Print {
  
  private Banner _banner;
  public PrintBanner(String string) {
    _banner = new Banner(string);
  }

  // request A
  public void printWeak() {
    _banner.showWithParen();
  };

  // request B
  public void printStrong() {
    // call specificRequest in Adaptee (경유, 위임)
    _banner.showWithAster();
  };
}
