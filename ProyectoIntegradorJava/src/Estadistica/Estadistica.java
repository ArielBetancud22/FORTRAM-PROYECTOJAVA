
package Estadistica;

public class Estadistica {
    //Atributos 
      int n;
      int sueldo;
      int resultado;
      //Metodos y constructores( acciones)

    public Estadistica(int n, int sueldo, int resultado) {
        this.n = n;
        this.sueldo = sueldo;
        this.resultado = resultado;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
      
}
