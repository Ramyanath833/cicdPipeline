package com.student.demo.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;

public class Student {

    private int sId;
    private String name;
    private String section;
    private String subject;
    private String marksStatus;

    public Student(int sId, String name, String section, String subject, String marksStatus) {
        this.sId = sId;
        this.name = name;
        this.section = section;
        this.subject = subject;
        this.marksStatus = marksStatus;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMarksStatus() {
        return marksStatus;
    }

    public void setMarksStatus(String marksStatus) {
        this.marksStatus = marksStatus;
    }
}
