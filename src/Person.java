import javax.inject.Inject;

/**
 * Created by ruarcs on 14/09/2015.
 */
public class Person {

    private final IntToString intToString;

    //Hardcoded to 1.
    private final int age = 1;

    @Inject
    Person(IntToString intToString) {
        this.intToString = intToString;
    }

    public String getAgeAsString() {
        return intToString.intToString(age);
    }
}
