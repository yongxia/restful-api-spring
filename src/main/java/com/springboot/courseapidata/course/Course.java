package com.springboot.courseapidata.course;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springboot.courseapidata.topic.Topic;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;

    public Course() {
    }

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public Topic getTopic() {
        return this.topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Course)) {
            return false;
        }
        Course topic = (Course) o;
        return Objects.equals(id, topic.id) && Objects.equals(name, topic.name)
                && Objects.equals(description, topic.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", description='" + getDescription() + "'"
                + "}";
    }
}