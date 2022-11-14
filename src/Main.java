/**
 * @author Marcus Marziano
 * This class with main call back the two methods of WordGames class
 */

public class Main {
    public static void main(String[] args){
        WordGames wordGames = new WordGames();
        /**
         * assign values to the param and print the two method of WordGames class
         */
        System.out.println(wordGames.addHelloWord("Marcus"));
        System.out.println(wordGames.getFullName("Marcus", "Marziano"));

    }
}