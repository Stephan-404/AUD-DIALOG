package aud.dialog.V2;

import aud.dialog.V2.Parser;

import aud.dialog.V2.beans.TokenBean;
import aud.dialog.V2.beans.TokenPart;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String fileName = "Arial-Input.txt";
    static BufferedReader br;
    static List<TokenBean> trueTokenBeans;

    public static void main(String[] args) throws IOException {
        trueTokenBeans = new ArrayList<>();
        Lexer l = new Lexer(fileName);
        List<TokenBean> tl = l.doSomething();

        for (TokenBean b : tl) {
            if (b.getDialekt() == null || b.getToken() == null) {
                List<TokenPart> tokenParts = b.getL();
                for (TokenPart tp : tokenParts) {
                    trueTokenBeans.add(new TokenBean(tp.getDialekt(), tp.getToken()));
                }
            } else {
                trueTokenBeans.add(new TokenBean(b.getDialekt(), b.getToken()));
            }
        }

        Compiler c = new Compiler();
        c.compile(trueTokenBeans,tl);

//        for(TokenBean g:trueTokenBeans){
//            System.out.println(g.getDialekt()+" | "+g.getToken());
//        }


//Print Tokens

    }
}
