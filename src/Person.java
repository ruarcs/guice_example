import javax.inject.Inject;

/**
 * Created by ruarcs on 14/09/2015.
 */
public class Person {

    private final IntToString intToString;

    @Inject
    Person(IntToString intToString) {
        this.intToString = intToString;
    }

    public int getAge() {
        //Hardcode to 1.
        return 1;
    }

    public String getAgeAsString() {
        return intToString.intToString(getAge());
    }
}
