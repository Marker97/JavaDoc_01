/**
 * @author Marcus Marziano
 * This class with main call back the two methods of WordGames class
 */

public class Main {
    public static void main(String[] args){


        /**
         * Using the class "WordGames" , create a new object
         */
        WordGames wordGames = new WordGames();
        /**
         * using the object created, call back the two methods of WordGames
         * change the param input like String
         */
        wordGames.addHelloWord("Hello Word");
        wordGames.getFullName("Marcus", "Marziano");

    }
}