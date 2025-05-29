package sv.edu.udb.service;

import sv.edu.udb.model.Materia;
import java.util.List;

public interface MateriaService {
    List<Materia> findAll();
    Materia findById(Long id);
    Materia save(Materia materia);
    Materia update(Long id, Materia materia);
    void delete(Long id);
}
