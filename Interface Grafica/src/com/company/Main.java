package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       String a=  JOptionPane.showInputDialog(null, "Digite o texto", JOptionPane.PLAIN_MESSAGE);
       JOptionPane.showMessageDialog(null, "Texto Digitado: "+ a, "Mensagem", JOptionPane.PLAIN_MESSAGE);
        int b= JOptionPane.showConfirmDialog(null, "Confirma o texto digitado", "Janela", JOptionPane.YES_NO_CANCEL_OPTION);
        if(b==0){
            JOptionPane.showMessageDialog(null, "CONFIRMADO" , "Mensagem de confirmação", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
