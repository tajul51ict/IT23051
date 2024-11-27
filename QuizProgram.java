import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        String[] questions = {
            "1. What is the capital of France?",
            "2. Which planet is known as the Red Planet?",
            "3. What is the square root of 64?",
            "4. Who wrote 'Romeo and Juliet'?",
            "5. What is the largest ocean on Earth?"
        };
        
        String[][] options = {
            {"a. London", "b. Paris", "c. Berlin"},
            {"a. Mars", "b. Venus", "c. Jupiter"},
            {"a. 6", "b. 7", "c. 8"},
            {"a. Charles Dickens", "b. William Shakespeare", "c. Mark Twain"},
            {"a. Atlantic Ocean", "b. Indian Ocean", "c. Pacific Ocean"}
        };
        
        char[] answers = {'b', 'a', 'c', 'b', 'c'};
        
        int score = 0;

        System.out.println("Welcome to the Quiz! Answer the following questions:");
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (a/b/c): ");
            char userAnswer = scanner.next().charAt(0);
            
            if (userAnswer == answers[i]) {
                System.out.println("Correct! +5 points");
                score += 5;
            } else {
                System.out.println("Incorrect! -1 point");
                score -= 1;
            }
            System.out.println();
        }
        
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score);
        
        scanner.close();
    }
}
