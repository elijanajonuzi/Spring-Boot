package ch.noseryoung.plj.demo.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
//Parent Mapping 
@RestController
@RequestMapping("/product")
@Api(value="/pet", produces=MediaType.APPLICATION_JSON_VALUE)


public class ProductController {
	@GetMapping("/{id}")
	@ApiOperation("Gets the Product with specific id")
	public @ResponseBody ResponseEntity<Product> getProduct(@PathVariable long id){
		return new ResponseEntity<Product>(new Product("Product1",id,true),HttpStatus.OK);
	}
	
	@PostMapping("/giveproduct")
	
	public @ResponseBody ResponseEntity<String> addProduct(@RequestBody Product product){ //annotation
		return new ResponseEntity<String>(product.getProductName(),HttpStatus.OK);
	}
	

	
	

}
