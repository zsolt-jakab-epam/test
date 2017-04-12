package com.codecool.tobeornottobe.mentorslife;

/**
 * Created by joker on 2017.04.11..
 */
public class Person {

    int moodLevel;
    int energyLevel;
    String firstName;
    String lastName;
    int birthYear;
    String gender;
    String fullName;


    Person(String fName, String lName, int bYear, String gender){
        this.firstName = fName;
        this.lastName = lName;
        this.birthYear = bYear;
        this.gender = gender;
        this.moodLevel = 70;
        this.energyLevel = 100;
        this.fullName = fName + ' ' + lName;
    }


    // Setters
    public void setMoodLevel(int mood) {
        this.moodLevel += mood;
    }

    public void setEnergyLevel(int energy){
        this.energyLevel += energy;
    }

    // Methods
    public void motivate(){
        setMoodLevel(20);
    }

    public void demotivate(){
        setMoodLevel(-20);
    }

    public void eat(){
        setEnergyLevel(20);
        setMoodLevel(20);
    }

    public void drinkCoffee(){
        setEnergyLevel(30);
    }

    public boolean isThereEnergy(){
        if (this.energyLevel < 10){
            System.out.println(this.fullName + "energy level is too low, have some food or coffee :D");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "moodLevel=" + moodLevel +
                ", energyLevel=" + energyLevel +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", gender='" + gender + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
