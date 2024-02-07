package com.vacantes.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vacantes.entity.Vacantes;

public interface IntVacantesService {

		
		public List<Vacantes> listaVacantes();
		public void guardar(Vacantes vacantes);
		public Vacantes buscar(Integer idVacantes);
		public void eliminar(Integer idVacantes);
		public int totalRegistros();
		public Page<Vacantes>buscarTodas(Pageable page);

	}


