/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.controller;

import abd.p1.bd.UsuarioDAO;
import abd.p1.model.Usuario;
import abd.p1.view.ModificarPerfilUsuario;
import org.hibernate.SessionFactory;

/**
 *
 * @author Jhersy Nolasco y Roberto Barrasus
 */
public class Controlador {
    
    private SessionFactory sf;
    public Controlador(SessionFactory sf) {
        this.sf = sf;
    }   
    
    public boolean busquedaUsuario(Usuario usuario){
        boolean encontrado = false;
        UsuarioDAO ud = new UsuarioDAO(sf);
        //consultar usuario
        // si el usuario inserta mal la contraseña, ventana con mensahje de error
        ud.comprobarUsuario(usuario.getCorreo(), usuario.getContrasena());               
        
        return encontrado;
    }
    
    public void nuevoUsuario(Usuario usuario){
        UsuarioDAO ud = new UsuarioDAO(sf);
        ModificarPerfilUsuario editarPerfil = new ModificarPerfilUsuario(this, true, usuario);


        
        
        
    }
    
}
