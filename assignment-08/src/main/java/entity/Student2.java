package entity;

import java.time.LocalDate;

public class Student2 {
    private int id;
    private String name;
    private LocalDate birthDate;
    private double score;

    public Student2(int id, String name, LocalDate birthDate, double score) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", score=" + score +
                '}';
    }
}
