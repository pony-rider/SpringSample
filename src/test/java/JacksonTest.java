import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.samples.springdata.entity.User;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JacksonTest {

    private static ObjectMapper mapper = new ObjectMapper();
    @BeforeClass
    public static void init() {
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    @Test
    public void jsonTest() throws JsonProcessingException {
        User u = new User(1, "2", LocalDateTime.now());
        String json = mapper.writeValueAsString(u);
        System.out.println(json);

        u = mapper.readValue(json, User.class);
        System.out.println(u);
    }
}
