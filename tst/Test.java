import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

public class Test {

    @org.junit.Test
    public void test() {
        IntToString intToString = mock(IntToString.class);
        when(intToString.intToString(anyInt())).thenReturn("99");
        Person person = new Person(intToString);
        assertThat(person.getAgeAsString(), is("99"));
    }
}
