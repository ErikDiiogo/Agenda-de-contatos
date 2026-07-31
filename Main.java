package Java.Projetos.AgendadeContatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Agenda de Contatos ===");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Listar Contato");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("0 - Sair");

            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();


            if(opcao == 1){
                System.out.println("Nome so contato: ");
                String nome = scanner.next();
                System.out.println("Qual numero: ");
                String numero = scanner.next();

                Contato contato = new Contato(nome, numero);
                agenda.adicionarContato(contato);

            } else if (opcao == 2){
                System.out.println("=== Lista de Contato === ");
                agenda.listarContato();
            } else if (opcao == 3){
                System.out.println("Buscar Contato: ");
                String buscarContato = scanner.next();
                agenda.buscarContato(buscarContato);
            } else if( opcao == 4 ) {
                System.out.println("Remover Contato: ");
                String removerContato = scanner.next();
                agenda.removerContato(removerContato);
            } else {
                 System.out.println("Obrigado por usar nosso sistema!!");
            }

        } while( opcao != 0);

        scanner.close();
    }
}
