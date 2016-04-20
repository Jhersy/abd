/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abd.p1.bd;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import abd.p1.model.Usuario;
import java.util.List;

/**
 *
 * @author Rober y Jhersy
 */
public class UsuarioDAO {
    private SessionFactory sf;
    private Session s;
    public UsuarioDAO(SessionFactory sf){
        this.sf = sf;
    }    
    
    public boolean comprobarUsuario(String user, String password){
        String sql = "SELECT * FROM usuarios WHERE correo = " + user + " AND contrasena = " + password;
        Session session = sf.openSession();
        Query query = session.createQuery("FROM usuarios");
        List<Usuario> users = (List<Usuario>) query.list();
        if(users.isEmpty())
            return false;
        else return true;
    }
}
