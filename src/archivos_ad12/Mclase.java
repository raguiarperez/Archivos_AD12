package archivos_ad12;

import java.io.Serializable;

/**
 *
 * @author dam2
 */
public class Mclase implements Serializable{
    private String nome;
    private transient int numero1; //al ser transient va devolver 0, si se hace en String da un nulo
    private double numero2;

    public Mclase(String nome, int numero1, double numero2) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    Mclase() {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Mclase{" + "nome=" + nome + ", numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
    
}