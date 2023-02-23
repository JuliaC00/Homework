package homework19;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.school="Syntax";
        teacher.age=30;
        teacher.grade();
        teacher.teach();


        System.out.println("New Teacher");

        MathTeacher math=new MathTeacher();
        math.age=35;
        math.mathSubjects="algebra";
        math.grade();
        math.teachMath();
    }
}
