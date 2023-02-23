package homework19;

public class Teacher {

    String school;
    int age;

    public void teach() {
        System.out.println(" is teaching ");
    }

    public void grade() {
        System.out.println(" is grading papers");
    }

    public void attendMeeting() {
        System.out.println( " is attending a meeting");
    }

    public void planLesson() {
        System.out.println( " is planning a lesson");
    }
}
class MathTeacher extends Teacher {
    String mathSubjects;


     protected void teachMath() {
        System.out.println(" is teaching math");
    }


        public void teachChemistry() {
            System.out.println(" is teaching chemistry");
        }

        public void conductExperiment() {
            System.out.println(" is conducting a chemistry experiment");
        }
    }

    class PianoTeacher extends Teacher{
        // Features
        String[] pianoStyles;

        // Behaviors
        public void teachPiano() {
            System.out.println( " is teaching piano");
        }

        public void playPiano() {
            System.out.println(" is playing the piano");
        }}



