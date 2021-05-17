package org.japcdev.mockito.services;

import org.japcdev.mockito.models.Exam;

public interface ExamService {
    Exam findExamByName(String name);
}
