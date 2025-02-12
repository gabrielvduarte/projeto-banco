package org.example;

public class Calculadora {
    private int num1;
    private int num2;
    private String operador;

    public Calculadora(int num1, int num2, String operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
    }

    public String calcular() {
        switch (operador) {
            case "+":
                return String.valueOf(somar());
            case "-":
                return String.valueOf(subtrair());
            case "*":
                return String.valueOf(multiplicar());
            case "/":
                return dividir();
            default:
                return "Operador inválido: " + operador;
        }
    }

    private int somar() {
        return num1 + num2;
    }

    private int subtrair() {
        return num1 - num2;
    }

    private int multiplicar() {
        return num1 * num2;
    }

    private String dividir() {
        if (num2 != 0) {
            return String.valueOf(num1 / num2);
        } else {
            return "Erro: Divisão por zero não permitida";
        }
    }
}
