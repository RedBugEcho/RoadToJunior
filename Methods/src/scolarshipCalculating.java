public class scolarshipCalculating {
    public static void main(String[] args) {
        int[] semesterGrades = new int[5];

        semesterGrades[0] = 3;
        semesterGrades[1] = 3;
        semesterGrades[2] = 3;
        semesterGrades[3] = 3;
        semesterGrades[4] = 3;

        int sum = 0;

        for (int i = 0 ; i < semesterGrades.length ; i++){
            sum += semesterGrades[i];
        }

        double avg = (double) sum / semesterGrades.length;

        System.out.println("Your sum of 5 grades: " + sum);
        System.out.println("Your average grade: " + avg);

    }
}