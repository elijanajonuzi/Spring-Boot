package ch.noseryoung.plj.demo.user;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Parent Mapping 
@RequestMapping("/users")
public class UserController {

//General Formula localhost:8080/[parentMapping]/[endpointMapping]	
//Our first Get Mapping
@GetMapping({"/{elijana}",""})
public @ResponseBody ResponseEntity<User> getHelloWorld(@PathVariable("elijana") long id){
	ArrayList<String> collection = new ArrayList<>();
	collection.add("sdsd");
	collection.add("sdsd2");
	return new ResponseEntity<>(new User("Sina","Blattmann",id,collection),HttpStatus.OK);
}





	
}