package mypackage;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void staus() {
        System.out.println("Uma caneta de modelo: " + modelo);
        System.out.println("De cor " + this.cor);
        System.out.println("Ela tem ponta: " + ponta);
        if (this.tampada) {
            System.out.println("esta tampada? Sim");
        } else {
            System.out.println("esta tampada? Não");
        }
        
        System.out.println("Ela tem carga: " + carga + "%");
    }
 
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não possi rabiscar");
        }
        else{
            System.out.println("Rabiscando!!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
