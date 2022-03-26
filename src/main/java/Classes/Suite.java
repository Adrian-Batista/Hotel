package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Suite {
    
    private int numero;
    private String tipo;
    private int capacidade;
    private double valorDiaria;
    
    private ArrayList<Suite> listaSuite = new ArrayList();
    Scanner ler = new Scanner(System.in);
    
    public Suite(){
        
    }

    public Suite(int numero, String tipo, int capacidade, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valorDiaria = valorDiaria;
    }
    
    public void addSuite(){
        Suite suite = new Suite();
        System.out.println("Digite o númerio da nova suite : ");
        suite.numero = ler.nextInt();
        System.out.println("Digite o tipo da suite (COMFORT, FLEX, PLUS : ");
        suite.tipo = ler.next();
        System.out.println("Digite a capacidade da suite : ");
        suite.capacidade = ler.nextInt();
        System.out.println("Digite o valor da diaria a ser cobrado : ");
        suite.valorDiaria = Double.parseDouble(ler.next());
        
        listaSuite.add(suite);
    }
    
    public void listSuite(){
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = getListaSuite().size();
        for (int i=0; i<n; i++) {
            System.out.printf("- Suite n° " + getListaSuite().get(i).getNumero());
            System.out.printf("\n- Tipo : " + getListaSuite().get(i).getTipo());
            System.out.printf("\n- Capacidade : " + getListaSuite().get(i).getCapacidade());
            System.out.printf("\n- Valor Diária por pessoa : R$" + getListaSuite().get(i).getValorDiaria());
        }
    }
    
    public ArrayList listaSuite(){
        return listaSuite;
    }
   
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
    
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public ArrayList<Suite> getListaSuite() {
        return listaSuite;
    }

    public void setListaSuite(ArrayList<Suite> listaSuite) {
        this.listaSuite = listaSuite;
    }
    
    
}
