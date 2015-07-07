package com.zyang;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class Context {

    private String password;
    private String username;
    private List<Server> servers;

    public Context() {
        password = "password";
        username = "username";
        servers = Arrays.asList(
                new Server("US1", "1.1.1.1"),
                new Server("US2", "1.1.1.1"));
    }

    List<Server> servers() {
        return servers;
    }

    String username() {
        return username;
    }

    String password() {
        return password;
    }


    public static Context parse(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fileName), Context.class);
    }
}

