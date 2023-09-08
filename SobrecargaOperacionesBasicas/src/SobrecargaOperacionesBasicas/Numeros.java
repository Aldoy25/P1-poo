/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SobrecargaOperacionesBasicas;
import javax.swing.JOptionPane;

public class Numeros {
    
private SobrecargaOperacionesBasicas calculadora;
             
    public Numeros() {
    calculadora = new SobrecargaOperacionesBasicas();
    }
    public void ejecutarPrograma() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                "Menú de Operaciones\n" +
                "1. Suma\n" +
                "2. Resta\n" +
                "3. Multiplicación\n" +
                "4. División\n" +
                "5. Salir\n" +
                "Ingrese la opción:");

            switch (opcion) {
                case "1":
                    String entradaSuma = JOptionPane.showInputDialog("Ingrese números separados por espacios para sumar:");
                    String[] numerosSuma = entradaSuma.split(" ");
                    double[] valoresSuma = new double[numerosSuma.length];
                    for (int i = 0; i < numerosSuma.length; i++) {
                        valoresSuma[i] = Double.parseDouble(numerosSuma[i]);
                    }
                    calculadora.Operaciones(valoresSuma);
                    calculadora.Resultado();
                    break;
                case "2":
                    String entradaResta = JOptionPane.showInputDialog("Ingrese números separados por espacios para restar:");
                    String[] numerosResta = entradaResta.split(" ");
                    double[] valoresResta = new double[numerosResta.length];
                    for (int i = 0; i < numerosResta.length; i++) {
                        valoresResta[i] = Double.parseDouble(numerosResta[i]);
                    }
                    calculadora.OperacionResta(valoresResta);
                    calculadora.Resultado();
                    break;
                case "3":
                    String entradaMultiplicacion = JOptionPane.showInputDialog("Ingrese números separados por espacios para multiplicar:");
                    String[] numerosMultiplicacion = entradaMultiplicacion.split(" ");
                    double[] valoresMultiplicacion = new double[numerosMultiplicacion.length];
                    for (int i = 0; i < numerosMultiplicacion.length; i++) {
                        valoresMultiplicacion[i] = Double.parseDouble(numerosMultiplicacion[i]);
                    }
                    calculadora.OperacionMultiplicacion(valoresMultiplicacion);
                    calculadora.Resultado();
                    break;
                case "4":
                    String entradaDivision = JOptionPane.showInputDialog("Ingrese números separados por espacios para dividir:");
                    String[] numerosDivision = entradaDivision.split(" ");
                    double[] valoresDivision = new double[numerosDivision.length];
                    for (int i = 0; i < numerosDivision.length; i++) {
                        valoresDivision[i] = Double.parseDouble(numerosDivision[i]);
                    }
                    calculadora.OperacionDivision(valoresDivision);
                    calculadora.Resultado();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        numeros.ejecutarPrograma();
    }
}