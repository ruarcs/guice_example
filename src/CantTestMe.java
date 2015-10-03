/**
 * Created by ruarcs on 03/10/2015.
 */
public class CantTestMe {

    private final IntToString intToString = new IntToString();

    private final int value = 10;

    public String toString() {
        return intToString.intToString(value);
    }
}
