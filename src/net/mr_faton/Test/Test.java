package net.mr_faton.Test;

import java.io.File;
import java.net.URISyntaxException;

public class Test {
    public static void main(String[] args) throws URISyntaxException {
        System.out.println(new File(Test.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()));
    }
}
/*
Узнать корневую рабочую папку для проекта или jar файла
 */