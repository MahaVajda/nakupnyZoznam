package sk.maha.nakupnyZoznam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sk.maha.nakupnyZoznam.model.Tovar;
import sk.maha.nakupnyZoznam.model.TovarRepository;


@RestController
public class TovarController {
	
	private TovarRepository tovarRepository;
	
	public TovarController(sk.maha.nakupnyZoznam.model.TovarRepository tovarRepository) {
		super();
		this.tovarRepository = tovarRepository;
	}

	@RequestMapping("/hello")
	String hello(@RequestParam(value = "name", defaultValue = "worlddd") String name){
		return "hello " + name;
	}
	
	
	@PostMapping("/tovar")
	Tovar saveTovar(@RequestBody Tovar tovar) {
		return tovarRepository.save(tovar);
	}
	
	@GetMapping("/tovar")
	List<Tovar> all(){
		return tovarRepository.findAll();
	}
	
	@DeleteMapping("/tovar/{id}")
	void delete(@PathVariable Long id) {
		tovarRepository.deleteById(id);
	}
}
