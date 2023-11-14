package service;

import model.Breweries;
import repository.BreweriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreweriesService {
    BreweriesRepository breweriesRepository;
    @Autowired
    public BreweriesService(BreweriesRepository breweriesRepository) {
        this.breweriesRepository = breweriesRepository;
    }
    public List<Breweries> getAllBreweries() {
        return breweriesRepository.findAll();
    }
    public Breweries getBrewery(int id) {
        return breweriesRepository.findById(id).orElse(null);
    }
}
