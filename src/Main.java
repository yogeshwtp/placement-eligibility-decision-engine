import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate c = new Candidate(name, percentage, backlogs, graduationYear);

        System.out.println("Candidate: " + c.getName());
        System.out.println("Percentage: " + c.getPercentage());
        System.out.println("Backlogs: " + c.getBacklogs());
        System.out.println("Graduation Year: " + c.getGraduationYear());

        scanner.close();
    }
}