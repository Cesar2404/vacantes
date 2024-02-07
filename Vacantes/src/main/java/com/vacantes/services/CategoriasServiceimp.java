package com.vacantes.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vacantes.entity.Categoria;

@Service
public class CategoriasServiceimp implements IntCategoriaService {
	
	private List<Categoria> lista;
	
	public  CategoriasServiceimp() {
		lista = new LinkedList<Categoria>();
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setNombre("Contabilidad");
		c1.setDescripcion("Relacionado con finanzas");
		
		Categoria c2 = new Categoria();
		c2.setId(2);
		c2.setNombre("Desarrollo de Software");
		c2.setDescripcion("Desarrollo de aplicaciones moviles y web");
		
		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setNombre("Produccion");
		c3.setDescripcion("Desarrollo de aplicaciones moviles y web");
		
		Categoria c4 = new Categoria();
		c4.setId(4);
		c4.setNombre("Desarrollo de Software");
		c4.setDescripcion("Desarrollo de aplicaciones moviles y web");
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
	}

	@Override
	public List<Categoria> listaCategorias() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void guardar(Categoria categoria) {
		lista.add(categoria);

	}

	@Override
	public Categoria buscar(Integer idCategoria) {
		
		
		Categoria categoria = null;
		for(Categoria c : lista) {
			if(c.getId()== idCategoria) {
				categoria=c;
				break;
				
			}
		}
		return categoria;
	}

	@Override
	public void eliminar(Integer idCategoria) {
		lista.remove(buscar(idCategoria));

	}

	@Override
	public int totalRegistros() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Page<Categoria> buscarTodas(Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

}
