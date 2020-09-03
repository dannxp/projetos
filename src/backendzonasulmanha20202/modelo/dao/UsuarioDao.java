/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzonasulmanha20202.modelo.dao;

import backendzonasulmanha20202.modelo.bean.UsuarioBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class UsuarioDao {
    
    public UsuarioBean valida (UsuarioBean usu) {

        System.out.println(usu.getLogin());
        System.out.println(usu.getSenha());

        UsuarioBean usuSaida = new UsuarioBean(usu.getId()+1,usu.getLogin(),usu.getSenha(),"ATIVO","ADM");

        /*        
        usu.setId(10);
        usu.setLogin("BITTENCOURT");
        usu.setSenha("ABFABF010101");
        usu.setStatus("ATIVO");
        usu.setTipo("ADM");
        */
        
        return usuSaida;
    }    
        
        
    public UsuarioBean busca (UsuarioBean usu) {
         System.out.println(usu.getId());
         System.out.println(usu.getLogin());
         System.out.println(usu.getSenha());
         System.out.println(usu.getTipo());
         
         UsuarioBean usuBusca = new UsuarioBean(usu.getId(),usu.getLogin(),usu.getSenha(),"ATIVO",usu.getTipo());
        
        return usuBusca;
    }
    public UsuarioBean inseri (UsuarioBean usu) {
        
        usu.setId(0);
        usu.setLogin(login);
        usu.setSenha(senha);
        usu.setStatus(status);
        usu.setTipo(tipo);
        
        return usu;
    }    
    public UsuarioBean altera (UsuarioBean usu) {
        return usu;
    }    
    public UsuarioBean exclui (UsuarioBean usu) {
        return usu;
    }    
    public List<UsuarioBean> lista (UsuarioBean usu) {
        List<UsuarioBean> usus = new ArrayList<>();
        return usus;
    }    

}
