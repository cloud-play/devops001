package com.devops.project;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AppTest {

    @Test
    public void testInstituteName() {
        App app = new App();
        assertEquals("Kubebytes DevOps Training Institute", app.getInstituteName());
    }

    @Test
    public void testCourseListNotEmpty() {
        App app = new App();
        List<String> courses = app.getAvailableCourses();
        assertFalse(courses.isEmpty());
        assertTrue(courses.contains("DevOps Masterclass"));
    }
}