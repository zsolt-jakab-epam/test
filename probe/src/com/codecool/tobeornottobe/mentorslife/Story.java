package com.codecool.tobeornottobe.mentorslife;

import java.io.FileNotFoundException;

// This is our Mentor life simulator.
public class Story {
//  FileNotFoundException has to be deleted later
    public static void main(String[] args) throws FileNotFoundException {
        /*Student p1 = new Student("Laci","Molnár", 1990, "male");
        System.out.println(p1.lastName);
        System.out.println(p1.moodLevel);
        p1.motivate();
        System.out.println(p1.moodLevel);
        System.out.println(p1.knowledgeLevel);
        p1.havePrivateMentoring();
        System.out.println(p1.knowledgeLevel);
        Mentor m1 = new Mentor ("Bla", "Bla", 1980, "male", "Laci");*/
//        PersonReader.readPersonFromFile("resources/students.csv");
        PersonReader.readPersonFromFile("resources/mentors.csv");
    }


}
