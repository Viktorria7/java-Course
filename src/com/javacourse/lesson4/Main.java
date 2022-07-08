package com.javacourse.lesson4;

import java.io.IOException;
//угадай букву
public class Main {
        public static void main (String[]args) throws IOException {
            char ch, answer = 'N';
            System.out.println("Задумана буква от A до Z");
            while ((ch = (char) System.in.read()) != answer) {
                if (ch > answer) System.out.println("COLD");
               else System.out.println("HOT");
                System.in.read();
            }
            System.out.print(" Правильно! ");
        }
    }
// Подсчитать слова
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        String text = "И очень многим кажется, что логотип – это просто символ, который можно нарисовать самостоятельно.  ";
        String[] words = text.toLowerCase().replaceAll("[,.!:?]", "").split("\\s");
        Arrays.sort(words);
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(words[i - 1])) {
                do {
                    count++;
                    i++;}
                while(i < words.length && words[i].equals(words[i - 1]));
            }
            System.out.println("Слово \"" + words[i - 1] + "\" встречается в тексте: " + count + " раз.");
            count = 1;
        }
    }
}