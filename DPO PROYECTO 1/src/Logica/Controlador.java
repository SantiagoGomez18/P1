package Logica;

import Usuarios.usuario;

import java.util.HashMap;
import Usuarios.Estudiante;
import Usuarios.Profesor;
import java.util.ArrayList;

public class Controlador {
	HashMap<Integer, usuario> usuarios;
	
	public Controlador(HashMap<Integer,usuario> usuarios){
		this.usuarios = new HashMap<Integer,usuario>();
	}

	public HashMap<Integer, usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashMap<Integer, usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
    public boolean existeUsuario(String id) {
    	if (usuarios.keySet().contains(id)) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
	public void crearUsuario(String login, String contrasena, String rol) throws Exception {
		if(!existeUsuario(login)) {
			throw new Exception("El usuario con el login dado ya existe");
		}else {
			usuario u;
			
			if (rol.equals("Profesor")) {
				u = new Profesor(login, contrasena, rol, new ArrayList<>());
			}else if(rol.equals("Estudiante")) {
				u = new Estudiante(login, contrasena, rol, null, null, false, null, null, null, null, null)
			}
		}
	}
}
