package april.day12;

public class SystemExam {
    public static void main(String[] args) {
        String pathVariable = System.getenv("PATH");
        System.out.println("Path Variable: " + pathVariable);
    }
}