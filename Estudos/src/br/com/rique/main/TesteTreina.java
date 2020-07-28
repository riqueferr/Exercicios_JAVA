package br.com.rique.main;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteTreina {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    
        ArrayList<String> palavras = new ArrayList<String>();
        
        while(scanner.hasNext())
        {
            palavras.add(scanner.next());
        }
    }

}
