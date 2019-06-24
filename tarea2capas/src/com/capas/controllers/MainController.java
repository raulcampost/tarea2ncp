package com.capas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capas.domain.Empleado;
import com.capas.domain.Sucursal;
import com.capas.services.UsuarioService;

@Controller
public class MainController {

	@Autowired(required=true)
	private UsuarioService us;
	
	
	@RequestMapping("/")
	public String log() {	
		
		return "login";
	}
	
	
	
	
	
	
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
		Sucursal b = us.findsucursalone(id);
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
	
	
	
	
	@RequestMapping("/nuevasucursal")
	public ModelAndView savesucursal(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal", new Sucursal());
		mav.setViewName("editsucursal");
		return mav;
	}
	
	
	@RequestMapping(value="/savesucursal", method = RequestMethod.POST)
	public ModelAndView savesucursale(@Valid @ModelAttribute("sucursal") Sucursal s,BindingResult r ){
		ModelAndView mav = new ModelAndView();
		
		if(r.hasErrors()){
			mav.addObject("resultado", 0);
			mav.setViewName("editsucursal");
		}
		else{
			us.savesucursal(s);
			List<Sucursal> b = us.findsucursal();
			mav.addObject("sucursal",b);
			mav.setViewName("index");
		}
		return mav;
	}
	
	
	@RequestMapping("/editarsucursal")
	public ModelAndView editarsucursal(@RequestParam("sucursal") Integer sucursal){
		ModelAndView mav = new ModelAndView();
		Sucursal b = us.findsucursalone(sucursal);
		mav.addObject("sucursal", b);
		mav.setViewName("editsucursal");
		return mav;
	}
	
	
	
	
	
	
	@RequestMapping("/nuevoempleado")
	public ModelAndView nuevoempleado(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("empleado", new Empleado());
		mav.setViewName("editempleado");
		return mav;
	}
	
	
	@RequestMapping(value="/savempleado", method = RequestMethod.POST)
	public ModelAndView savempleado(@Valid @ModelAttribute("Empleado") Empleado s, BindingResult r ){
		ModelAndView mav = new ModelAndView();
		
		if(r.hasErrors()){
			mav.addObject("resultado", 0);
			mav.setViewName("editsucursal");
		}
		else{
			us.savempleado(s);
			List<Sucursal> b = us.findsucursal();
			mav.addObject("sucursal",b);
			mav.setViewName("index");
		}
		return mav;
	}
	
	
	@RequestMapping("/editarempleado")
	public ModelAndView editarempleado(@RequestParam("sucursal") Integer sucursal){
		ModelAndView mav = new ModelAndView();
		Sucursal b = us.findsucursalone(sucursal);
		mav.addObject("sucursal", b);
		mav.setViewName("editsucursal");
		return mav;
	}
	
	
	
	
	
	
	
}
