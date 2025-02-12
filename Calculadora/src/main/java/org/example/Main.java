package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 3, "/");
        System.out.println("Resultado: " + calc.calcular());
    }
}