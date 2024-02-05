public class Student implements Cloneable {
    private Long redId;
    private String name;
    private Double gpa;

    public Student(Long redId, String name, Double gpa) {
        this.redId = redId;
        this.name = name;
        this.gpa = gpa;
    }

    public Long getRedId() {
        return redId;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setRedId(Long redId) {
        this.redId = redId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "redId=" + redId +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.gpa = this.gpa;
            clone.name = this.name;
            clone.redId = this.redId;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
