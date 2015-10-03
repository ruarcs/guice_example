import com.google.inject.Singleton;

@Singleton
public class IntToString {
    public String intToString(int i) {
        return Integer.toString(i);
    }
}
