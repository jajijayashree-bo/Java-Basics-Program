public class Student {

    public static void main(String[] args) {

        String[] names = {"Ram", "Sita", "Ravi", "Anu", "Kiran"};

        int[] marks = {85, 72, 90, 66, 58};

        System.out.println("Student Details:");
        System.out.println("---------------------------");

        for (int i = 0; i < names.length; i++) {

            char grade;

            if (marks[i] >= 80)
                grade = 'A';
            else if (marks[i] >= 60)
                grade = 'B';
            else if (marks[i] >= 50)
                grade = 'C';
            else
                grade = 'F';

            System.out.println("Name  : " + names[i]);
            System.out.println("Marks : " + marks[i]);
            System.out.println("Grade : " + grade);
            System.out.println("---------------------------");
        }
    }
}
