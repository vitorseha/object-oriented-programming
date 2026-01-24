/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaacademico;

/**
 *
 * @author vitor
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        javax.swing.SwingUtilities.invokeLater(() -> {
           LoginScreen tela = new LoginScreen();
           tela.setVisible(true);
       });
    }
}
