package withyeju.adapter.inheritance;

public class PrintBanner extends Banner implements Print {
  public PrintBanner(String string) {
    super(string);
  }
  @Override
  public void printWeak() {
    // super.showWithParen();
    showWithParen();
  };
  @Override
  public void printStrong() {
    // super.showWithAster();
      showWithAster();
  };
}
