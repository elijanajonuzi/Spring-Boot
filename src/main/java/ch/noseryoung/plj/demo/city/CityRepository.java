package ch.noseryoung.plj.demo.city;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.jboss.logging.Param;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
	@Query(value="Select * from city where city.population>= ?1",nativeQuery=true)
	public List<City> selectCityWithPopulation(int population);

}
