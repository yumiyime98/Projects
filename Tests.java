public class Tests {

    public static void main(String[] args) {

        // Declare and initialize test score variables
        double testScore1 = 96.7;
        double testScore2 = 84.2;
        double testScore3 = 88.8;

        // Calculate the average
        double average = (testScore1 + testScore2 + testScore3) / 3;

        // Display the test scores and the average
        System.out.println("Test Score 1:   " + testScore1);
        System.out.println("Test Score 2:  " + testScore2);
        System.out.println("Test Score 3:  " + testScore3);
        System.out.printf("The Average of the 3 Test Scores is:  %.2f%n", average);
    }
}