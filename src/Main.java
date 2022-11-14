/**
 * @author Marcus Marziano
 * This class test WordGames'class
 */

public class Main {
    /**
     * This method run the program
     * @param args pass information to the program
     */
    public static void main(String[] args){
        WordGames wordGames = new WordGames();

        System.out.println(wordGames.addHelloWord("Marcus"));
        System.out.println(wordGames.getFullName("Marcus", "Marziano"));

    }
}