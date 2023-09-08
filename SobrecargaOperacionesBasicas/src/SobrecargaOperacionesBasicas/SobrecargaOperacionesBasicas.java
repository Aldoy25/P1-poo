/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SobrecargaOperacionesBasicas;

public class SobrecargaOperacionesBasicas {
    private double resultado; 

    public SobrecargaOperacionesBasicas() {
        resultado = 0.0;
    }

    private void OperacionSuma(double... numeros) {
        for (double numero : numeros) {
            resultado += numero;
        }
    }
    void OperacionResta(double... numeros) {
        if (numeros.length > 0) {
            resultado = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                resultado -= numeros[i];
            }
        }
    }
    void OperacionMultiplicacion(double... numeros) {
        resultado = 1.0;
        for (double numero : numeros) {
            resultado *= numero;
        }
    }
    void OperacionDivision(double... numeros) {
        if (numeros.length > 0) {
            resultado = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] != 0) {
                    resultado /= numeros[i];
                } else {
                    System.out.println("Error: División por cero detectada.");
                    return;
                }
            }
        }
    }

    public void Resultado() {
        System.out.printf("El resultado es: ", resultado);
    }
    void Operaciones(double[] valoresSuma) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}