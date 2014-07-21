package nz.ac.auckland.grades.domain;

public class Grade {
	private int studentId;
	private String courseName;
	private String grade;

    protected Grade() { }

    public Grade(int studentId, String courseName, String grade) {
        this.studentId = studentId;
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getGrade() {
        return grade;
    }

    public int getStudentId() {
        return studentId;
    }
}
