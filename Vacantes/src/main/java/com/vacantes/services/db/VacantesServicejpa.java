


	package com.vacantes.services.db;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Primary;
	import org.springframework.data.domain.Page;
	import org.springframework.data.domain.Pageable;
	import org.springframework.stereotype.Service;

	import com.vacantes.entity.Vacantes;
	import com.vacantes.repository.VacantesReposity;
	import com.vacantes.services.IntVacantesService;

	@Primary
	@Service
	public class VacantesServicejpa implements IntVacantesService {
		
		 @Autowired
	 private VacantesReposity repoVacantes;

		
		
		@Override
		public List<Vacantes> listaVacantes() {
			// TODO Auto-generated method stub
			return repoVacantes.findAll();
		}

		@Override
		public void guardar(Vacantes vacantes) {
			// TODO Auto-generated method stub
			repoVacantes.save(vacantes);

		}

		@Override
		public Vacantes buscar(Integer idVacantes) {
			// TODO Auto-generated method stub
			Vacantes vacantes=null;
			Optional<Vacantes> optional= 
					repoVacantes.findById(idVacantes);
			if(optional.isPresent()) {
				vacantes = optional.get();
			}
			return vacantes;
		}

		@Override
		public void eliminar(Integer idVacantes) {
			// TODO Auto-generated method stub
			repoVacantes.deleteById(idVacantes);;

		}

		@Override
		public int totalRegistros() {
			// TODO Auto-generated method stub
			return (int) repoVacantes.count();
		}

		@Override
		public Page<Vacantes> buscarTodas(Pageable page) {
			return repoVacantes.findAll(page);
		}

	}

