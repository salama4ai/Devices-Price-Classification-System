package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        p();
    }

    private static void p() {
        String cwd = System.getProperty("user.dir");
        // get the python directory
        Path pp = Paths.get(cwd).getParent();
        // initialize builder
        System.out.print(pp+"\\scripts\\");
    }

    ;
}