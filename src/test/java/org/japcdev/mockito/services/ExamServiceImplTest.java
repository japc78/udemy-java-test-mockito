package org.japcdev.mockito.services;

import org.japcdev.mockito.models.Exam;
import org.japcdev.mockito.repositories.ExamRepository;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ExamServiceImplTest {

    @Test
    void findExamByName() {
        ExamRepository repository = mock(ExamRepository.class);
        ExamService service = new ExamServiceImpl(repository);
        List<Exam> data = Arrays.asList(new Exam(5L, "Mathematics"), new Exam(6L, "Language"),
                new Exam(7L, "History"));

        when(repository.findAll()).thenReturn(data);
        Optional<Exam> exam = service.findExamByName("Mathematics");

        assertTrue(exam.isPresent());
        assertEquals(5L, exam.orElseThrow().getId());
        assertEquals("Mathematics", exam.orElseThrow().getName());
    }

    @Test
    void findExamInEmptyList() {
        ExamRepository repository = mock(ExamRepository.class);
        ExamService service = new ExamServiceImpl(repository);
        List<Exam> data = Collections.emptyList();

        when(repository.findAll()).thenReturn(data);
        Optional<Exam> exam = service.findExamByName("Mathematics");

        assertFalse(exam.isPresent());
    }
}