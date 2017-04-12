package com.codecool.tobeornottobe.mentorslife;

public class Student extends Person {

    int knowledgeLevel;

    //TOO MANY PARAM, -> BUILDER PATTERN
    public Student(String fName, String lName, int bYear, String gender) {
        super(fName, lName, bYear, gender);
        this.knowledgeLevel = 50;
    }

    //this should be PRIVATE !!!
    public void setKnowledgeLevel(int knowledge) {

        this.knowledgeLevel += knowledge;
    }

    public void havePrivateMentoring() {

        this.setKnowledgeLevel(30);
    }
}


