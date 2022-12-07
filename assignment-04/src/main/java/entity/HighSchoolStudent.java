package entity;

public class HighSchoolStudent extends Student3 {
    private String clazz;
    private String desiredUniversity;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
        super(id, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }
}
