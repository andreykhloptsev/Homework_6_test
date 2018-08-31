package ru.geekbrains.level_3.hw_6;

public class Student {

    private     int id;
    private     String surname;
    private     int ball;

    public Student(int id, String surname, int ball) {
        this.id = id;
        this.surname = surname;
        this.ball = ball;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", ball=" + ball +
                '}';
    }
}
