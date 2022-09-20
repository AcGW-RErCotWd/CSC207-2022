public class Student extends Person {
    private String studentNumber;

    public Student(String stuNum, String name){
        super(name);
        studentNumber = stuNum;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
}
