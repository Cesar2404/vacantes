package com.vacantes.services;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vacantes.entity.Vacantes;
@Service
public class VacantesServiceimp implements IntVacantesService {
	
		private List<Vacantes> lista= null;
		
		public VacantesServiceimp() {
			lista = new LinkedList<Vacantes>();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {	
			Vacantes v1 = new Vacantes();
			v1.setId(1);
			v1.setNombre("Programador Junior");
			v1.setDescripcion("Desarrollo de aplicacion Rest");
			v1.setSalario(15000.0);
			v1.setEstatus("Creada");
			v1.setFecha(LocalDate.parse("06-02-2024",formato));
			
			Vacantes v2 = new Vacantes();
			v2.setId(2);
			v2.setNombre("Programador Junior");
			v2.setDescripcion("Desarrollo de aplicacion Rest");
			v2.setSalario(15000.0);
			v2.setEstatus("Creada");
			v2.setFecha(LocalDate.parse("06-02-2024",formato));
			
			Vacantes v3 = new Vacantes();
			v3.setId(3);
			v3.setNombre("Programador Junior");
			v3.setDescripcion("Desarrollo de aplicacion Rest");
			v3.setSalario(15000.0);
			v3.setEstatus("Creada");
			v3.setFecha(LocalDate.parse("06-02-2024",formato));
			
			
			lista.add(v1);
			lista.add(v2);
			lista.add(v3);
		}catch(DateTimeException msg){
			System.out.println(msg.getMessage());
		}
		}

	@Override
	public List<Vacantes> listaVacantes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Vacantes vacantes) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vacantes buscar(Integer idVacantes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer idVacantes) {
		// TODO Auto-generated method stub

	}

	@Override
	public int totalRegistros() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Page<Vacantes> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
