package org.japcdev.mockito.services;

import org.japcdev.mockito.models.Exam;
import org.japcdev.mockito.repositories.ExamRepository;
import org.japcdev.mockito.repositories.ExamRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamServiceImplTest {

    @Test
    void findExamByName() {
        ExamRepository repository = new ExamRepositoryImpl();
        ExamService service = new ExamServiceImpl(repository);

        Exam exam = service.findExamByName("Mathematics");

        assertNotNull(exam);
        assertEquals(5L, exam.getId());
        assertEquals("Mathematics", exam.getName());
    }
}