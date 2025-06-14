package view.menus;

import controller.BancoController;
import model.Conta;
import view.questions.Tranferencia;

import java.util.Scanner;

public class MenuInicialView {
    public static void interfaceMenuInicialView(Conta conta, BancoController banco) {
        Scanner input = new Scanner(System.in);
        String resp = "0";

        do {
            System.out.println("----------------Menu Inicial----------------");
            System.out.println("Nome: "+conta.getNome());
            System.out.println("Saldo: "+conta.getSaldo());
            System.out.println("""
                    [1] Fazer Tranferencia
                    [2] Solicitar Cartão
                    [3] 
                    """);
            resp = input.nextLine();
            switch (resp) {
                case "1":
                    Tranferencia.perguntar(conta,banco);
            }


        }while (!resp.equals("6"));
    }
}
