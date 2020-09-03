/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzonasulmanha20202.controle;

import backendzonasulmanha20202.modelo.bean.UsuarioBean;
import backendzonasulmanha20202.modelo.dao.UsuarioDao;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class UsuarioControle {
    
    UsuarioDao usuDao = new UsuarioDao();
    
    public UsuarioBean valida (UsuarioBean usu) {
        return  usuDao.valida(usu);
    }

    public UsuarioBean busca (UsuarioBean usu) {
        return  usuDao.busca(usu);
    }
    
    public UsuarioBean inseri (UsuarioBean usu) {
        return  usuDao.inseri(usu);
    }

    public UsuarioBean altera (UsuarioBean usu) {
        return  usuDao.altera(usu);
    }

    public UsuarioBean exclui (UsuarioBean usu) {
        return  usuDao.exclui(usu);
    }

    public List<UsuarioBean> lista (UsuarioBean usu) {
        return  usuDao.lista(usu);
    }
}
