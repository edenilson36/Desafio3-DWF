package sv.edu.udb.service;

import sv.edu.udb.model.Alumno;
import java.util.List;

public interface AlumnoService {
    List<Alumno> findAll();
    Alumno findById(Long id);
    Alumno save(Alumno alumno);
    Alumno update(Long id, Alumno alumno);
    void delete(Long id);
}
