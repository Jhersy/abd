package abd.p1.model;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
@Entity
public class Usuario {
	@Id
	private String correo;
	
	private String nombre;
	private String contrasena;
	
	@Enumerated(EnumType.STRING)	
	private Genero genero;
	
	@Enumerated(EnumType.STRING)	
	private Genero busca;
	
	private Coordenada coordenada;
	private Date fecha_nac;
	private byte[] foto;
	private String descripcion;
	
	@ElementCollection
	private List<String> aficiones;
	
	@ManyToMany
	private List<Usuario> amigos;
	
	@OneToMany (mappedBy = "usuario")
	private List<Completa> completa;
	
	@OneToMany (mappedBy = "receptor")	
	private List<Mensaje> recibidos;
	
	@OneToMany (mappedBy = "emisor")
	private List<Mensaje> enviados;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Genero getBusca() {
		return busca;
	}
	public void setBusca(Genero busca) {
		this.busca = busca;
	}
	public Coordenada getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<String> getAficiones() {
		return aficiones;
	}
	public void setAficiones(List<String> aficiones) {
		this.aficiones = aficiones;
	}
	public List<Usuario> getAmigos() {
		return amigos;
	}
	public void setAmigo(Usuario amigo) {
		this.amigos.add(amigo);
	}
	public List<Completa> getCompleta() {
		return completa;
	}
	public void setCompleta(List<Completa> completa) {
		this.completa = completa;
	}
	public List<Mensaje> getRecibidos() {
		return recibidos;
	}
	public void setRecibidos(List<Mensaje> recibidos) {
		this.recibidos = recibidos;
	}
	public List<Mensaje> getEnviados() {
		return enviados;
	}
	public void setEnviados(List<Mensaje> enviados) {
		this.enviados = enviados;
	}
        
        public boolean findUser(String correo, String password){
            return false;
        }
	
}
