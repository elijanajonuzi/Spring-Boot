package ch.noseryoung.plj.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Parent Mapping 
@RequestMapping("/product")
public class ProductController {
	@GetMapping()
	
	public @ResponseBody ResponseEntity<Product> getProduct(){
		return new ResponseEntity<Product>(new Product("Product1",75,true),HttpStatus.OK);
	}
	

}
