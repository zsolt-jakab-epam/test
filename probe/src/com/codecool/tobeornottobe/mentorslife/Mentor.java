package com.codecool.tobeornottobe.mentorslife;

public class Mentor extends Person {
    String nickname;

    public Mentor(String fName, String lName, int bYear, String gender, String nickname) {
        super(fName, lName, bYear, gender);
        this.nickname = nickname;
    }

}
    /*
    public void giveClassLecture(String codecoolClass) {
        //Raises knowledge_level of the closen class's students, and decreases energy level of mentor by 10
        if self.is_there_energy():
        self.energy_level -= 10
        for student in to_class.students:
        student.knowledge_level += 5
        return self.full_name + " teached new things to the students and the general knowledge level increased by 5."
        return self.full_name + " is too tired to hold class lecture."
    */
        /*
       def give_private_mentoring(mentor, student):
           '''Raises knowledge_level of a student by 5, and decreases energy_level of student and mentor by 10'''
           if mentor.is_there_energy() and student.is_there_energy():
               mentor.energy -= 10
               student.energy -= 10
               student.knowledge_level += 5

    }*/

    @Override
    public String toString() {
        return "Mentor{" +
                "nickname='" + nickname + '\'' +
                ", moodLevel=" + moodLevel +
                ", energyLevel=" + energyLevel +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", gender='" + gender + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
