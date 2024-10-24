package Usuarios;

import java.util.ArrayList;
import Logica.actividad;
import Logica.learningPath;

public class Estudiante extends usuario{

	private ArrayList<String> logros = new ArrayList<>();
	private ArrayList<String> avances = new ArrayList<String>();
	private boolean actividadEnProgreso;
	private ArrayList<actividad> actividadesNoExitosas = new ArrayList<>();
	private ArrayList<actividad> actividadesTerminadas = new ArrayList<actividad>();
	private boolean learningPathInProgress;
	private learningPath learningPath = new learningPath();
	private ArrayList<learningPath> pathsTerminados = new ArrayList<learningPath>();
	private ArrayList<learningPath> pathsNoExitosos = new ArrayList<learningPath>();
	
	public Estudiante(String login, String contrasena, String rol, ArrayList<String> logros, ArrayList<String> avances, boolean actividadEnProgreso, ArrayList<actividad> actividadesExitosas,
			ArrayList<actividad> actividadesNoExitosas, learningPath learningPath, ArrayList<learningPath> pathsTerminados, ArrayList<learningPath> pathsNoExitosos) {
		super(login, contrasena, rol);
		this.logros = logros;
		this.avances = avances;
		this.actividadEnProgreso = actividadEnProgreso;
		this.actividadesTerminadas = actividadesExitosas;
		this.actividadesNoExitosas = actividadesNoExitosas;
		this.learningPath = learningPath;
		this.pathsTerminados = pathsTerminados;
		this.pathsNoExitosos = pathsNoExitosos;
	}

	public ArrayList<String> getLogros() {
		return logros;
	}

	public void setLogros(ArrayList<String> logros) {
		this.logros = logros;
	}

	public ArrayList<String> getAvances() {
		return avances;
	}

	public void setAvances(ArrayList<String> avances) {
		this.avances = avances;
	}

	public boolean isActividadEnProgreso() {
		return actividadEnProgreso;
	}

	public void setActividadEnProgreso(boolean actividadEnProgreso) {
		this.actividadEnProgreso = actividadEnProgreso;
	}

	public ArrayList<actividad> getActividadesNoExitosas() {
		return actividadesNoExitosas;
	}

	public void setActividadesNoExitosas(ArrayList<actividad> actividadesNoExitosas) {
		this.actividadesNoExitosas = actividadesNoExitosas;
	}

	public ArrayList<actividad> getActividadesTerminadas() {
		return actividadesTerminadas;
	}

	public void setActividadesTerminadas(ArrayList<actividad> actividadesTerminadas) {
		this.actividadesTerminadas = actividadesTerminadas;
	}

	public boolean isLearningPathInProgress() {
		return learningPathInProgress;
	}

	public void setLearningPathInProgress(boolean learningPathInProgress) {
		this.learningPathInProgress = learningPathInProgress;
	}

	public learningPath getLearningPath() {
		return learningPath;
	}

	public void setLearningPath(learningPath learningPath) {
		this.learningPath = learningPath;
	}

	public ArrayList<learningPath> getPathsTerminados() {
		return pathsTerminados;
	}

	public void setPathsTerminados(ArrayList<learningPath> pathsTerminados) {
		this.pathsTerminados = pathsTerminados;
	}

	public ArrayList<learningPath> getPathsNoExitosos() {
		return pathsNoExitosos;
	}

	public void setPathsNoExitosos(ArrayList<learningPath> pathsNoExitosos) {
		this.pathsNoExitosos = pathsNoExitosos;
	}
	
	

	
	
	
}
