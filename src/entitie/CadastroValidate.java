package entitie;

import java.util.Scanner;

public class CadastroValidate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome1;
        System.out.println("Digite o nome do usuário: ");
        nome1 = sc.next();
        System.out.println("Você digitou o nome do usuário: " +nome1);

        String cpf1;
        System.out.println("Digite o CPF: ");
        cpf1 = sc.next();
        System.out.println("Usuário chama: "+nome1+ "\nE possui CPF: "+cpf1);

        String nome2;
        System.out.println("Digite o nome do usuário: ");
        nome2 = sc.next();
        System.out.println("Você digitou o nome do usuário: " +nome2);

        String cpf2;
        System.out.println("Digite o CPF: ");
        cpf2 = sc.next();
        System.out.println("Usuário chama: "+nome2+ "\nE possui CPF: "+cpf2);

        if(cpf1.equals(cpf2))

            System.out.println("CPF já Cadastrado");

        else

            System.out.println("CPF liberado para cadastro");


        sc.close();

    }
}
