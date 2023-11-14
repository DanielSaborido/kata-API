package service;

import model.Styles;
import repository.StyleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StylesService {
    StyleRepository styleRepository;
    @Autowired
    public StylesService(StyleRepository styleRepository) {
        this.styleRepository = styleRepository;
    }
    public List<Styles> getAllStyles() {
        return styleRepository.findAll();
    }
    public Styles getStyle(int id) {
        return styleRepository.findById(id).orElse(null);
    }
}
