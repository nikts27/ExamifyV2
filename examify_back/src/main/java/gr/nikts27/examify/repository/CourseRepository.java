package gr.nikts27.examify.repository;

import gr.nikts27.examify.entity.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Cleavest on 3/1/2025
 */
public interface CourseRepository extends MongoRepository<Course, String> {

    List<Course> findByProfessorsContaining(String professorId);

    List<Course> findByStudentsContaining(String studentId);
}