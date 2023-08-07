package mypackage;

public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta minhaCaneta = new Caneta();
        

        minhaCaneta.modelo = "Bic Cristal";
        minhaCaneta.cor = "azul";
        minhaCaneta.carga = 89;
        minhaCaneta.destampar();
        minhaCaneta.staus();

        
    }
}
