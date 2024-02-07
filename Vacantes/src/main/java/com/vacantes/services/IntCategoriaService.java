package com.vacantes.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vacantes.entity.Categoria;

public interface IntCategoriaService {
	
	public List<Categoria> listaCategorias();
	public void guardar(Categoria categoria);
	public Categoria buscar(Integer idCategoria);
	public void eliminar(Integer idCategoria);
	public int totalRegistros();
	public Page<Categoria>buscarTodas(Pageable page);

}
