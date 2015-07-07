package com.zyang;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.IOException;
import java.io.StringWriter;

public class Render {

    private final String templateName;
    private final Context context;

    public Render(String templateName, Context context) {
        this.templateName = templateName;
        this.context = context;
    }

    public String rendTemplate() throws IOException {
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(templateName);
        StringWriter writer = new StringWriter();
        mustache.execute(writer, context).flush();
        return writer.toString();
    }
}
