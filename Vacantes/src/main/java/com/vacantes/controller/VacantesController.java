package com.vacantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vacantes.entity.Vacantes;
import com.vacantes.services.IntVacantesService;

@RequestMapping("/vacantes")
@Controller
public class VacantesController {
	
	@Autowired
	private IntVacantesService VacantesService;
	@GetMapping("/buscar")
	public String buscar (@RequestParam("id")int idVacantes,Model model) {
		Vacantes vacantes = VacantesService.buscar(idVacantes);
		model.addAttribute("vacantes", vacantes);
		return "vacantes/formVacante";
	}
	
	@GetMapping("/eliminar")
	public String eliminar(@RequestParam("id")int idVacantes,
			RedirectAttributes attribute) {
		VacantesService.eliminar(idVacantes);
		attribute.addFlashAttribute("msg","Vacante Eliminada");
		return "redirect:/vacantes/indexPaginate";
	} 
	
	
@PostMapping("/guardar")
	public String guardar(Vacantes vacantes, RedirectAttributes model) {
	//categoria.setId(categoriasService.listaCategorias().size()+1);
	VacantesService.guardar(vacantes);
		model.addFlashAttribute("msg","!La Vacante se guardo con exito¡");
		return "redirect:/vacantes/indexPaginate";
	
}

	@GetMapping("/crear")
	public String crear(Vacantes vacantes) {
		return "vacantes/formVacante";
		
	}
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Vacantes> lista= VacantesService.listaVacantes();
		System.out.println(lista);
		model.addAttribute("vacantes", lista);
		
		for(Vacantes v: lista) {
			System.out.println(v.getId());
			System.out.println(v.getNombre());
			System.out.println(v.getDescripcion());
		}
		model.addAttribute("total",lista.size());
		return "vacantes/listVacantes";
	}
	
	@GetMapping(value = "/indexPaginate")
	public String mostrarIndexPaginado(Model model, Pageable page) {
	Page<Vacantes>lista = VacantesService.buscarTodas(page);
	model.addAttribute("vacantes", lista);
	model.addAttribute("total",VacantesService.totalRegistros());
	return "vacantes/listVacantes";
	}

}
