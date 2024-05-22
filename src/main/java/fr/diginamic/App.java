package fr.diginamic;

import java.io.IOException;
import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

public class App {
  public static void main(String[] args) throws IOException {
    String title = ResourceBundle.getBundle("application").getString("title");
    String asciiArt = FigletFont.convertOneLine(title);
    System.out.println(asciiArt);
  }
}
