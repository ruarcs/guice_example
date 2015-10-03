import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector();
        Person p = injector.getInstance(Person.class);
        System.out.println(String.format("I created a %s with age %s!!!", p.getClass().getSimpleName(), p.toString()));

        CantTestMe t = new CantTestMe();
        System.out.println(String.format("I created a %s with value %s!!!", t.getClass().getSimpleName(), t.toString()));
    }
}
