package service;

import model.Categories;
import repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoriesService {
    CategoriesRepository categoriesRepository;
    @Autowired
    public CategoriesService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }
    public List<Categories> getAllCategories() {
        return categoriesRepository.findAll();
    }
    public Categories getCategory(int id) {
        return categoriesRepository.findById(id).orElse(null);
    }
}