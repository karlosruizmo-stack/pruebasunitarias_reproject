package org.example;

public class Juego {

    private int numeroSecreto;
    private int intentos;
    private int maxIntentos;
    private boolean ganado;

    public Juego(int numeroSecreto, int maxIntentos) {
        this.numeroSecreto = numeroSecreto;
        this.maxIntentos   = maxIntentos;
        this.intentos      = 0;
        this.ganado        = false;
    }

    public String adivinar(int intento) {
        if (intentos >= maxIntentos) {
            return "Sin intentos";
        }

        intentos++;

        if (intento == numeroSecreto) {
            ganado = true;
            return "Correcto";
        } else if (intento < numeroSecreto) {
            return "Mayor";
        } else {
            return "Menor";
        }
    }

    public boolean isGanado()        { return ganado; }
    public int getIntentos()         { return intentos; }
    public int getMaxIntentos()      { return maxIntentos; }
    public int getNumeroSecreto()    { return numeroSecreto; }
    public boolean quedanIntentos()  { return intentos < maxIntentos; }
}