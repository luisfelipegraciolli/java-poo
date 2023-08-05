import java.util.Date;
import java.util.Locale;
import java.awt.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Date data = new Date();
        System.out.println(data.toString());

        // Desafio harware
        Locale idioma = Locale.getDefault();
        System.out.println("Seu sistema esta em " + idioma.getDisplayLanguage());

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        int width = (int) size.getWidth();
        int height = (int) size.getHeight();
        
        System.out.println("Sua resolucao e " + width + " x " + height);
    }
}
