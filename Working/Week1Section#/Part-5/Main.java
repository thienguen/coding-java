public class main {
    public static void main(String[] args) 
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Thien", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Nguyen", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tram", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Boi", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Marin", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Me", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) 
    {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) 
    {
        int score = 4 ;
        if (playerScore >= 1000) { score = 1; }
        
        else if (playerScore >= 500) { score = 2; } 
        
        else if (playerScore >= 100) { score = 3; } 

        return score;   
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) 
    {
        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
               finalScore += 2000;
            
            return finalScore;
        }
        return -1;
    }

}

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50


    /* Sample Output */
// Your final score was 3300
// Your final score was 13600
// Tim managed to get into position 1 on the high score table
// Bob managed to get into position 2 on the high score table
// Percy managed to get into position 3 on the high score table
// Gilbert managed to get into position 4 on the high score table
// Louise managed to get into position 1 on the high score table
// Carol managed to get into position 2 on the high score table
// Frank managed to get into position 3 on the high score table