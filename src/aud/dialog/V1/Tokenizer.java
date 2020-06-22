/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aud.dialog.V1;

import aud.dialog.V1.beans.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author stiegerstephan
 */
public class Tokenizer {
    static String fileName;

    public Tokenizer(String fileName) {
        this.fileName = fileName;
    }

    public static boolean CheckifCorrect(String line) throws IOException {

            List<Token> arialTokens = new ArrayList();

            if (line.contains("foo")) {
                arialTokens.add(new Token("foo", "ARIAL"));

                String[] charline = line.replace(" ", "").split("");
                for (int i = 0; i < charline.length; i++) {
                    if (charline[i].equals("(")) {
                        arialTokens.add(new Token("(", "JAVA"));
                    }
                    if (charline[i].equals(";")) {
                        arialTokens.add(new Token(";", "JAVA"));
                    }
                    if (charline[i].equals(")")) {
                        arialTokens.add(new Token(")", "JAVA"));
                    }

                }

                String checkLine = "";
                for (int i = 0; i < arialTokens.size(); i++) {
                    checkLine = checkLine + arialTokens.get(i).getToke();
                }

                if (checkLine.equals("foo(;;)")) {
                    return true;
                } else {
                    return false;
                }
            }



        return true;
    }


}
