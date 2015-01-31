package net.mr_faton.Test;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new BufferedReader(new FileReader("C:/qwe.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        while (in.hasNext()) {
            String word = in.next();
            String newWord1 = word.replaceAll("[^а-яА-Я 0-9]", "");// ^ - этот символ указывает, что нужно оставить только эти символы, если убрать этот оператот, то будет наоборот, удалятся только введенные символы, а все остальные остануться
            System.out.println(newWord1);
        }
    }
}