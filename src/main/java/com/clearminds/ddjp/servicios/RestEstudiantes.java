package com.clearminds.ddjp.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.clearminds.ddjp.dtos.Estudiante;
import com.clearminds.ddjp.excepciones.BDDException;
@Path("/estudiantes")	
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	
	
	public void insertar(Estudiante estudiante){
		
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		
		try {
			srvEstudiante.insertarEstudiante(estudiante);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(estudiante.toString());
	}
	
	@Path("/actualizar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante){
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(estudiante);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(estudiante.toString());
		
	}

}

