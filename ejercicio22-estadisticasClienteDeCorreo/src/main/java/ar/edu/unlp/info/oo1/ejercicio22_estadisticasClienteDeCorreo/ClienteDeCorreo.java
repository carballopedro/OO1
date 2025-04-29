package ar.edu.unlp.info.oo1.ejercicio22_estadisticasClienteDeCorreo;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;

public class ClienteDeCorreo {
	
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new ArrayList<Carpeta>();
		this.addCarpeta(inbox);
	}
	
	public void addCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
;	}
	
	public void deleteCarpeta(Carpeta carpeta) {
		this.carpetas.remove(carpeta);
	}
	
	
	// almacena en el inbox (una de las carpetas) el email que recibe como parámetro.
	public void recibir (Email email) {
		this.inbox.addEmail(email);
	}
	
	// retorna el primer email en el Cliente de Correo cuyo título o cuerpo contienen
	// el texto indicado como parámetro. Busca en todas las carpetas. 
	public Email buscar(String texto) {
		
		// filtro .filter(Objects::nonNull) para descartar las primeras carpetas procesadas si me devolvieran null
		return this.carpetas.stream()
				.map(carpeta -> carpeta.buscarEmail(texto))
				.filter(Objects::nonNull)
				.findFirst()
				.orElse(null);
		
	}
	
	// retorna la suma del espacio ocupado por todos los emails de todas las carpetas.
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(Carpeta::espacioCarpeta).sum();
	}
	
	// cantidad total de emails en el cliente de correo: considerando todas las carpetas existentes.
	public int cantidadDeEmailsEnCorreo() {
		return this.carpetas.stream().mapToInt(c -> c.cantidadDeEmailsEnCarpeta()).sum();
	}
}
