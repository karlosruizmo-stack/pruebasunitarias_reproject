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
            return "SIN_INTENTOS";
        }

        intentos++;

        if (intento == numeroSecreto) {
            ganado = true;
            return "CORRECTO";
        } else if (intento < numeroSecreto) {
            return "MAYOR";
        } else {
            return "MENOR";
        }
    }

    public boolean isGanado()        { return ganado; }
    public int getIntentos()         { return intentos; }
    public int getMaxIntentos()      { return maxIntentos; }
    public int getNumeroSecreto()    { return numeroSecreto; }
    public boolean quedanIntentos()  { return intentos < maxIntentos; }
}