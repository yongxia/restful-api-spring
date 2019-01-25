package com.springboot.courseapidata.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourseByTopic(String id) {
        return courseRepository.findByTopicId(id);
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);

    }

    public void updateCourse(String id, Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}