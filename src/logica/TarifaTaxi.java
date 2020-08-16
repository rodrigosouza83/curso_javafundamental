package logica;

import java.util.Scanner;

public class TarifaTaxi {


    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("Digite quantos KM o táxi rodou: ");

        double bandeira = 8.50;
        double taximetro = 2.50;
        double km;
        km = calc.nextDouble();

        double corrida = bandeira+(taximetro*km ); // corrida =  {y = 4,50 + 0,50 * y} <-- equação primeiro grau
        System.out.println("Valor da Bandeira: R$ " +bandeira+ "\nTaxa por km:  R$ " +taximetro+  "\nValor da corrida foi: R$ " +corrida);

        calc.close();

    }
}
