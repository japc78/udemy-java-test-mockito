package org.japcdev.mockito.repositories;

import org.japcdev.mockito.models.Exam;

import java.util.List;

public interface ExamRepository {
    List<Exam> findAll();
}
