package com.vacantes.services.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vacantes.entity.Categoria;
import com.vacantes.repository.CategoriasRepository;
import com.vacantes.services.IntCategoriaService;

@Primary
@Service
public class CtaegoriasServicejpa implements IntCategoriaService {
	
	 @Autowired
 private CategoriasRepository repoCategorias;

	
	
	@Override
	public List<Categoria> listaCategorias() {
		// TODO Auto-generated method stub
		return repoCategorias.findAll();
	}

	@Override
	public void guardar(Categoria categoria) {
		// TODO Auto-generated method stub
		repoCategorias.save(categoria);

	}

	@Override
	public Categoria buscar(Integer idCategoria) {
		// TODO Auto-generated method stub
		Categoria categoria=null;
		Optional<Categoria> optional= 
				repoCategorias.findById(idCategoria);
		if(optional.isPresent()) {
			categoria = optional.get();
		}
		return categoria;
	}

	@Override
	public void eliminar(Integer idCategoria) {
		// TODO Auto-generated method stub
		repoCategorias.deleteById(idCategoria);;

	}

	@Override
	public int totalRegistros() {
		// TODO Auto-generated method stub
		return (int) repoCategorias.count();
	}

	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		return repoCategorias.findAll(page);
	}

}
