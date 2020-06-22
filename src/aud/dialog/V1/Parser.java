/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aud.dialog.V1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stiegerstephan
 */
public class Parser {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<String> s = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("Arial-Input.txt"));
        Tokenizer l = new Tokenizer("d");
        while (br.ready()) {
            s.add(br.readLine());
        }

        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).contains("foo")) {
                if (l.CheckifCorrect(s.get(i))) {
                    s.set(i, s.get(i).replace("foo", "for"));
                }
                else{
                    System.out.println("Syntax of Arial is wrong");
                }
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Arial.java"))) {
            for (String f : s) {
                bw.write(f + "\n");
            }

        }

    }
}
