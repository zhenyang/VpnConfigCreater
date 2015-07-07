package com.zyang;

import org.junit.Test;

public class RenderTest {

    @Test
    public void testName() throws Exception {
        String s = new Render("src/test/resource/template.mustache", Context.parse("src/test/resource/source.json")).rendTemplate();
        System.out.println(s);
    }
}