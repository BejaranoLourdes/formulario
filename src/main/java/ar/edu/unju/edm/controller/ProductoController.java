package ar.edu.unju.edm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.edm.model.Producto;
@Controller
public class ProductoController {
	@GetMapping({"/","producto"})
	public ModelAndView solicitarProducto() {
	Producto producto= new Producto();
	ModelAndView mostrar= new ModelAndView("formulario");
	mostrar.addObject("producto", producto);
	return mostrar;
	}
	@PostMapping("/guardarProducto")
	public ModelAndView cargarProducto(@ModelAttribute("producto") Producto nuevoProducto) { 
		
		ModelAndView mv = new ModelAndView("mostrarListado");

		return mv;
	}
}
