import org.junit.Test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

public class GuiceTest {

    @Test
    public void test() {
        IntToString intToString = mock(IntToString.class);
        when(intToString.intToString(anyInt())).thenReturn("99");
        Person person = new Person(intToString);
        assertThat(person.toString(), is("99"));
    }

    @Test(expected=AssertionError.class)
    public void testCantTestMe() {
        CantTestMe cantTestMe = new CantTestMe();
        // No control over internals!!!
        assertThat(cantTestMe.toString(), is("99"));
    }
}
