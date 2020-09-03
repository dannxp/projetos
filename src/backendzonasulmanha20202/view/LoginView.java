/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzonasulmanha20202.view;

import backendzonasulmanha20202.controle.UsuarioControle;
import backendzonasulmanha20202.modelo.bean.UsuarioBean;
import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class LoginView {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String opmenu;
        String login  = "";
        String senha  = "";
        String id = "";
        String tipo = "";
        
       
        login = JOptionPane.showInputDialog("Entre com o Login");
        senha = JOptionPane.showInputDialog("Entre com a Senha");
        UsuarioBean usu = new UsuarioBean (login,senha);
        UsuarioControle contUsu = new UsuarioControle();
        usu = contUsu.valida(usu);
        JOptionPane.showMessageDialog(null,usu.toString());
        opmenu = JOptionPane.showInputDialog(null,"Selecione uma das opções a seguir: " + "\n" + "1 - Alterar" + "\n" + "2 - Excluir" + "\n" + "3 - Buscar" + "\n "+ "4 - Listar" + "\n "+ "5 - Incluir");
        
        int convert = Integer.parseInt(opmenu);
        
        if (convert == 1){
            login = JOptionPane.showInputDialog("Digite o nome do usuário para poder fazer a alteração");
            contUsu.valida(usu);
        }else{
            JOptionPane.showMessageDialog(null, "OUTRO TESTE");
        }
        

    }
    
}
