/**
 * @author Marcus Marziano
 * This class rappresent the concatenation of param input of two methods
 */

public class WordGames {
    /**
     * This method returns the concatenation of one strings as a parameter
     * @param word param to concat
     * @return concat word + hello
     */
    public String addHelloWord(String word){
        return "Hello " + word;
    }

    /**
     * This method returns the concatenation of two strings as a parameter
     * @param name first param to concat
     * @param surname second param to concat
     * @return concat name + surname
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }


}
