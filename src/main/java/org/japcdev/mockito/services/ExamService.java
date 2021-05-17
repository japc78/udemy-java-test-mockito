package org.japcdev.mockito.services;

import org.japcdev.mockito.models.Exam;

import java.util.Optional;

public interface ExamService {
    Optional<Exam> findExamByName(String name);
}
