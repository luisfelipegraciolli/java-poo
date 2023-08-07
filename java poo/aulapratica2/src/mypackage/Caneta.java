package mypackage;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
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
 
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não possi rabiscar");
        }
        else{
            System.out.println("Rabiscando!!");
        }
    }

    void tampar() {
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
