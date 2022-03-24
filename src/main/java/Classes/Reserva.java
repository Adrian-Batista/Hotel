package Classes;

import Classes.Hospede;
import Classes.Suite;
import java.util.ArrayList;

public class Reserva {
    
    private ArrayList<Hospede> hospedes = new ArrayList();
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;

    public Reserva(){
        
    }
    
    public Reserva(Suite suite, int quantidadePessoas, int quantidadeDias) {
        this.suite = suite;
        this.quantidadePessoas = quantidadePessoas;
        this.quantidadeDias = quantidadeDias;
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
