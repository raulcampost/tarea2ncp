package com.capas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.capas.domain.Empleado;
import com.capas.domain.Sucursal;
import com.capas.domain.Usuario;
import com.capas.repositories.UsuarioRepositorio;
import com.capas.services.UsuarioService;

@Controller
public class MainController {

	@Autowired(required=true)
	private UsuarioService us;
	
	
	
	@RequestMapping("/sucursal")
	public ModelAndView sucursales() {
		ModelAndView mav = new ModelAndView();
		List<Sucursal> b = us.findsucursal();
		mav.addObject("sucursal",b);
		mav.setViewName("index");
		
		
		return mav;
	}
	
	@RequestMapping("/sucursalxempleado")
	public ModelAndView sucursalxempleado(@ModelAttribute(value = "id") Integer id) {
		ModelAndView mav = new ModelAndView();
		List<Sucursal> b = us.findsucursalone(id);
		List<Empleado> d = us.find(id);
		mav.addObject("sucursal",b);
		mav.addObject("empleado",d);
		mav.setViewName("single");
		
		
		return mav;
	}
	
	
	
	@RequestMapping("/deletesucursal")
	public ModelAndView deletempleadossss(@ModelAttribute(value = "id") Integer id) {
		ModelAndView mav = new ModelAndView();
		Integer l = us.deletempleados(id);
		Sucursal s = us.findone(id);
		us.deletempleado(s);
		List<Sucursal> b = us.findsucursal();
		mav.addObject("sucursal",b);
		mav.setViewName("index");
		return mav;
	}
	
	
	
	
	
	@RequestMapping("/usuario")
	public ModelAndView usuario(@ModelAttribute(value = "email") String email,@ModelAttribute(value = "password") String password) {
		ModelAndView mav = new ModelAndView();
		/*List<Usuario> b = us.find(email);
		if(password.equals(b.get(0).getSclave())) {
			mav.setViewName("index");
		}
		else {
			mav.setViewName("login");
		}*/
		return mav;
	}
	
}
