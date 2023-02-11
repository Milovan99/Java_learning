package methods;

public class ModifierMethods {
    public static void main(String[] args) {
        Student milovan = new Student("Milovan",7.85);
        milovan.setStudId(1007);
        System.out.println("Student :"+milovan.ime);
        System.out.println("Ocena :"+milovan.ocena);
        System.out.println("ID :"+milovan.getStudId());
    }

}
class Student{
    private int studId;
    String ime;
    double ocena;

    public Student(String ime, double ocena) {
        this.ime = ime;
        this.ocena = ocena;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public int getStudId(){
        return studId;
    }
}
