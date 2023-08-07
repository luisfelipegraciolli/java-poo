package mypackage;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Caneta minhaCaneta = new Caneta();
        minhaCaneta.carga = 86;
        minhaCaneta.ponta = 0.7f;
        minhaCaneta.cor = "Azul";
        minhaCaneta.modelo = "Bic";

        minhaCaneta.tampar();
        minhaCaneta.status();
        minhaCaneta.destampar();
        minhaCaneta.rabiscar();

        Caneta canetaDele = new Caneta();
        canetaDele.cor = "Vermelha";
        canetaDele.status();


    }
}
