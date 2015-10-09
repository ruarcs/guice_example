import com.google.inject.AbstractModule;

public class PersonModule extends AbstractModule {
    @Override
    public void configure() {
        // Bind class to itself for documentation.
        bind(IntToString.class);
    }
}
