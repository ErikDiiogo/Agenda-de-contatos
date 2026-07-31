package Java.Projetos.AgendadeContatos;

import java.util.ArrayList;
import java.util.Comparator;

public class Agenda {
    
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato){
    contatos.add(contato);
    }
    public void listarContato(){
        contatos.sort(Comparator.comparing(Contato::getNome));
        for (Contato c :contatos) {

            System.out.println(c.getNome() + " | " + c.getNumero()); 
        }
    }
    public void buscarContato(String nome){
        for (Contato c : contatos) {
            if(c.getNome().equalsIgnoreCase(nome)){
               System.out.println("Contados encontrado: " + c.getNome());  
            }
        }
    }
    public void removerContato(String nome){
        Contato paraRemover = null;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                paraRemover = c;
            }
        }

        if ( paraRemover != null) {
            contatos.remove(paraRemover);
            System.out.println("O contato " + paraRemover.getNome() + " foi removido");
        } else {
            System.out.println("Contato não encontrado");
        }
    }
}
