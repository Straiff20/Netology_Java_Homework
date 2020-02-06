package com.company.HomeWork.HomeWork_4_1_2;

public class Employee {
    private String surName;
    private String name;
    private int yearOfBirth;
    private String sex;
    private String education;
    private String position;
    private String division;

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s", surName, name, yearOfBirth, sex, education, position, division);
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public String getEducation() {
        return education;
    }

    public String getPosition() {
        return position;
    }

    public String getDivision() {
        return division;
    }

    public Employee(String lastName, String name, int yearOfBirth, String sex, String education, String position, String division) {
        this.surName = lastName;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.sex = sex;
        this.education = education;
        this.position = position;
        this.division = division;
    }
}
