package aula4;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    //Constructor method
    public Caneta(String modelo, String cor, float ponta) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.tampar();

    }

    public String getModelo() {
        return this.modelo;
    }

    public float getPonta() {
        return this.ponta;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public Boolean getTamapada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void tampar() {
        this.tampada = true;

    }public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a canet: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
    }
}
