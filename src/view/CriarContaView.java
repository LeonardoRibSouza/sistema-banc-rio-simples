package view;

import controller.BancoController;

import java.util.Scanner;

public class CriarContaView {
   public static void interfaceCriarConta(BancoController banco) {
       Scanner input = new Scanner(System.in);

       System.out.println("---------------Criar-Conta------------");
       System.out.println("Nome completo: ");
       String nome = input.nextLine();
       System.out.println("Senha: ");
       String senha = input.nextLine();
       System.out.println("Idade: ");
       int idade = input.nextInt();
       System.out.println("CPF: ");
        String cpf = input.nextLine();
        System.out.println("CEP: ");
        String cep = input.nextLine();
        System.out.println("Telefone: ");
        String telefone = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();

       banco.cadastrarConta(nome,senha,idade,cpf,cep,telefone,email);

   }
}
