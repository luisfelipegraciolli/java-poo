package aula5;

import java.util.Scanner;
import java.lang.Math;
public class ContaBanco {
    Scanner input = new Scanner(System.in);

    public int numConta;
    protected String tipo;// CC ou CP
    private String dono;
    private float saldo;
    
    private boolean status;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0.0f);
        
    }
    // metodos publicos
    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        if (this.getStatus()) {
            System.out.println("Esta conta ja esta aberta");
        } else {
            this.setStatus(true);
            System.out.print("Digite seu nome: ");
            this.setDono(input.nextLine());
            this.setTipo(this.getTipo().toUpperCase());

            if (this.getTipo().equals("CC")) {
                this.setSaldo(50.0f);
                System.out.println("Conta criada com sucesso!");
                
            } else {
                this.setSaldo(150.0f);
                System.out.println("Conta criada com sucesso!");
            }

            int max = 9999;
            int min = 1000;
            int range = max-min;

            double rand = Math.random();
            this.setNumConta((int) (rand * range) + min);
        }
        
    }

    public void fecharConta() {
        // CHECHAR SE TEM DINHEIRO OU DEBITO
        if (this.getStatus()) {
            if (this.getSaldo() > 0.0f) {
                System.out.println("Voce ainda possui dinheiro na sua conta.\nAntes de fechar-la saque seu dinheiro");
            } else if (this.getSaldo() < 0.0f) {
                System.out.println(
                        "Voce possui dividas a serem pagas na sua conta.\nAntes de fechar-la pague sua divida com seu dinheiro");
            } else {
                this.setStatus(false);
                this.setDono(null);
                this.setTipo(null);
                this.setNumConta(0000);
                System.out.println("Conta fechada com sucesso!");
            }
        }
        else {
            System.out.println("Impossivel fechar uma conta que não existe");
        }


    }
    
    public void depositar(float deposito) {
        // Chechar se esta aberta
        if (this.getStatus()) {
            this.setSaldo(getSaldo() + deposito);
            System.out.println("Saldo realizado com sucesso!\nSaldo atual: " + this.getSaldo());
        } else {
            System.out.println("Voce nao possui conta em nosso banco! ");
        }
    }
    
    public void sacar(float saque) {
        
        // Chechar se esta aberta e ver se tem saldo para o saldo
        if (this.getStatus()) {
            if (this.getTipo().equals("CP")) {
                if (saque > this.getSaldo()) {
                    System.out.println("Voce nao possui dinheiro suficiente para sacar");
                } else {
                    setSaldo(this.getSaldo() - saque);
                    System.out.println("Saldo realizado com sucesso!\nSaldo atual: " + this.getSaldo());
                }
            } else {
                setSaldo(this.getSaldo() - saque);
                System.out.println("Saldo realizado com sucesso!\nSaldo atual: " + this.getSaldo());
            }
        }
        else {
            System.out.println("Impossivel sacar de uma conta que nao existe");
        }
        
    }
    
    public void pagarMensailida() {
        // CC tira da saldo R$12
        if (this.getStatus()) {
            if (this.getTipo().equals("CC")) {
                this.setSaldo(this.getSaldo() - 12.0f);
                System.out.println("Mensalidade paga com sucesso!");
            }
            // Cp tira da saldo R$20
            else {
                if (this.getSaldo() < 20.0f) {
                    System.out.println("Sem saldo para pagar mensalidade!");
                } else {
                    this.setSaldo(this.getSaldo() - 20.0f);
                    System.out.println("Mensalidade paga com sucesso!");
                }
            }
        }
        else {
            System.out.println("Impossivel pagar! a conta não exite");
        }
    }

    public void infoConta() {

        if (this.getStatus()) {
            System.out.println("Ola " + this.getDono() + "!");
            System.out.println("O numero da sua conta e: " + this.getNumConta());
            System.out.println("Sua conta é de tipo: " + this.getTipo());
            System.out.println("Saldo: R$" + this.getSaldo());
            System.out.println("Status da conta: " + this.getStatus());
        } else {
            System.out.println("Voce nao possui conta em nosso banco!");
        }

    }
    
    //Setter e Getters

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return this.dono;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}
