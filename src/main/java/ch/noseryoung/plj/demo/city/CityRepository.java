package ch.noseryoung.plj.demo.city;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	
	@Query("SELECT * FROM city")
	ArrayList<City> findAllCities();

}
