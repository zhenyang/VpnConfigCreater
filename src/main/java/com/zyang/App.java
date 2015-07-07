package com.zyang;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.IOException;
import java.io.PrintWriter;

public class App
{

    @Parameter(names = "-t", description = "template file")
    private String templateFile = "src/main/resource/template.mustache";
    @Parameter(names = "-s", description = "source file")
    private String sourceFile = "src/main/resource/source.json";

    public static void main(String[] args) throws IOException {
        App app = new App();
        new JCommander(app, args);
        MustacheFactory mf = new DefaultMustacheFactory();
        Mustache mustache = mf.compile(app.templateFile);
        Context context = Context.parse(app.sourceFile);
        PrintWriter writer = new PrintWriter("vpn.mobileconfig", "UTF-8");
        mustache.execute(writer, context).flush();
    }

}
