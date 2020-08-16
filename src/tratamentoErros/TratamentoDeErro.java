package tratamentoErros;

import java.util.Scanner;

public class TratamentoDeErro {

    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
  try {
        System.out.println("Digite PRIMEIRO número inteiro: ");

      dados.nextInt();

      System.out.println("Digite SEGUNDO número inteiro> ");

      System.out.println("Número digitado foi: " +dados.nextInt());
  }
catch (Exception e) {

    System.out.println("Esse programa só aceita números inteiros");

}
        dados.close();

    }
}
