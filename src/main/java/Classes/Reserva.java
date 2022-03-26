package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    
    private ArrayList<Hospede> hospedes = new ArrayList();
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;
    
    Scanner ler = new Scanner(System.in);
    Reserva reserva = new Reserva();

    public Reserva(){
        
    }
    
    public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
        this.suite = suite;
        this.quantidadePessoas = quantidadePessoas;
        this.quantidadeDias = quantidadeDias;
    }
    
    public String verificarCapacidade(Suite suite){
        System.out.println("Digite a quantidade de Hóspedes maiores que 2 anos de idade : ");
        int aux = ler.nextInt();
        
        if(aux<= suite.getCapacidade()){
            System.out.println("Ok, o a suíte atende a necessidade!");
            return "ok";
        }else{
            System.out.println("Que pena a suíte não atende a necessidade, tente novamente!");
            return null;
        }
        
    }
    
    public void calcularDiaria(Suite suite){
        System.out.println("Quantos dias deseja permanecer na suíte? : ");
        int aux = ler.nextInt();
        double total =0;
        if(aux>7){
         total = (aux*suite.getValorDiaria())*0.9;   
        }else{
         total = aux*suite.getValorDiaria();   
        }
        
        System.out.println("O valor final da Diária será de: R$"+total);
        
    }
    
    public void realizarReserva(){
        System.out.println("Digite o número da Suíte : ");
        int aux = ler.nextInt();
        
        int n = suite.listaSuite().size();
        for (int i=0; i<n; i++) {
            if(aux==suite.getListaSuite().get(i).getNumero()){
                reserva.verificarCapacidade(suite.getListaSuite().get(i));
                reserva.calcularDiaria(suite.getListaSuite().get(i));
            }
        }
    }

    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }
    
    public void setHospedes(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public Suite getSuite() {
        return suite;
    }
    
    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
    
    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
}
