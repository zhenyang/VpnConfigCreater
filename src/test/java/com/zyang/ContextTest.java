package com.zyang;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContextTest {
    @Test
    public void parseFromFile() throws Exception {
        Context context = Context.parse("src/test/resource/source.json");
        assertThat(context.username(), is("username1"));
        assertThat(context.password(), is("password1"));
        assertThat(context.servers().get(0).getName(), is("US1"));
        assertThat(context.servers().get(0).getIp(), is("123.123.123.123"));
        assertThat(context.servers().get(1).getName(), is("US2"));
        assertThat(context.servers().get(1).getIp(), is("12.12.12.12"));
    }
}