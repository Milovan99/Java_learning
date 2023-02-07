public class Class_Variables {
    public static void main(String[] args){
        Student milovan = new Student(101,"Milovan");
        Student zoran = new Student(202,"Zoran");

        System.out.println(Student.getStudentCount());
    }
}
class Student {
    static int count = 0;
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        count++;
    }

    public static int getStudentCount() {
        return count;
    }
}