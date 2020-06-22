package aud.dialog.V2;

import aud.dialog.V2.beans.TokenBean;
import aud.dialog.V2.beans.TokenPart;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lexer {
    BufferedReader br;
    public Lexer(String fileName) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(fileName));
    }

    public List<TokenBean> doSomething() throws IOException {
        List<TokenBean> tokenList=new ArrayList<>();
        List<TokenPart> tokenPartList=new ArrayList<>();
        br.readLine();
        br.readLine();
        br.readLine();
        while(br.ready()){
            String line =br.readLine();
            if(line.contains("foo")){
                line.trim();
                tokenPartList.add(new TokenPart("Arial",line.split(" ")[0]));
                tokenPartList.add(new TokenPart("Java",line.split(" ")[1]));
                tokenPartList.add(new TokenPart("Java",line.split(" ")[2]));
                tokenPartList.add(new TokenPart("Java",line.split(" ")[3]));
                tokenPartList.add(new TokenPart("Java",line.split(" ")[4]));
                tokenPartList.add(new TokenPart("Java",line.split(" ")[5]));

                tokenList.add(new TokenBean(tokenPartList));
                tokenPartList=new ArrayList<>();
            }
            else if(line.contains("doiv")){
                try {
                    line.trim();
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[0]));
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[1]));
                    tokenPartList.add(new TokenPart("Arial", line.split(" ")[2]));
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[3] + " " + line.split(" ")[4]));
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[5]));

                    tokenList.add(new TokenBean(tokenPartList));
                    tokenPartList = new ArrayList<>();
                }
                catch (Exception e){
                    tokenPartList = new ArrayList<>();
                    line.trim();
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[0]));
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[1]));
                    tokenPartList.add(new TokenPart("Arial", line.split(" ")[2]));
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[3]));
                    tokenPartList.add(new TokenPart("Java", line.split(" ")[4]));

                    tokenList.add(new TokenBean(tokenPartList));
                    tokenPartList = new ArrayList<>();
                }
            }
            else if(line.contains("ssalc")){
                line.trim();
                tokenPartList.add(new TokenPart("Java",line.split(" ")[0]));
                tokenPartList.add(new TokenPart("Arial",line.split(" ")[1]));
                tokenPartList.add(new TokenPart("Java",line.split(" ")[2]));
                tokenPartList.add(new TokenPart("Java",line.split(" ")[3]));

                tokenList.add(new TokenBean(tokenPartList));
                tokenPartList=new ArrayList<>();

            }
            else{
                line.trim();
                if(line.equals("")||line.equals("\n")){

                }
                else {
                    tokenList.add(new TokenBean("Java",line));
                }

            }
        }
        return tokenList;
    }
}
