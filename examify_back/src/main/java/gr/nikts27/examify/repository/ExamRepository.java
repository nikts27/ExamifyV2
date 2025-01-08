package gr.nikts27.examify.repository;

import gr.nikts27.examify.entity.Exam;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Cleavest on 3/1/2025
 */
public interface ExamRepository extends MongoRepository<Exam, String> {

    List<Exam> findByCourseId(String course);

    Exam findExamById(String id);

    void deleteByExamId(String examId);

    Exam findExamByExamId(String id);
}