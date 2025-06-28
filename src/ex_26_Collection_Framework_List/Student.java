package ex_26_Collection_Framework_List;

public class Student {
    private String name;
    private String rollno;

    public Student(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void printDetails(){
        System.out.println("Student name : " + this.name);
        System.out.println("Student Roll No : " + this.rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollno + '\'' +
                '}';
    }
}
