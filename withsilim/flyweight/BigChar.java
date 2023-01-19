package withsilim.flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private String font;

  public BigChar(char charAt) {
    System.out.println("bigchar " + charAt + " construct called... ");
    try {
      // 파일 경로는 root 기준
      String rootPath = "withsilim/flyweight/";
      String filename =  rootPath + "big" + charAt + ".txt";
      StringBuilder sb = new StringBuilder();
      for (String line : Files.readAllLines(Path.of(filename)))
      {
        sb.append(line);
        sb.append("\n");
      }
        this.font = sb.toString();
    } catch (IOException e){
      font = charAt + "?";
    }
  }

	public void print() {
        System.out.println(font);
  }

}

