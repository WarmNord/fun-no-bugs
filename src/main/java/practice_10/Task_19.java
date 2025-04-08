package practice_10;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task_19 {
    public static boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
