package aud.dialog.V2;

import aud.dialog.V2.beans.TokenBean;
import aud.dialog.V2.beans.TokenPart;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    List<TokenBean> tokenList;
    boolean fail=true;

    public boolean parse(List<TokenBean> tokenList){
        this.tokenList=tokenList;
        for(int i=0;i<tokenList.size();i++){
            TokenBean tb=tokenList.get(i);
            if(tb.getDialekt()==null){
                List<TokenPart> tpList=tb.getL();
                for(TokenPart tp:tpList){
                    Check(new TokenBean(tp.getDialekt(),tp.getToken()),i);
                }
            }
            else {
                Check(tb, i);
            }
        }
        if(fail==true){
            return true;
        }
        else{
            return false;
        }
    }

    public void Check(TokenBean tb, int i){
        if(tb.getDialekt().equals("Arial")){
            if(tb.getToken().contains("foo")){
                if(tokenList.get(i+1).getToken().contains("(")){
                    if(tokenList.get(i+2).getToken().contains(";") && tokenList.get(i+3).getToken().contains(";")){
                        if(tokenList.get(i+4).getToken().contains(")")){
                            System.out.println("foo is correct");
                        }
                        else {
                            System.out.println("#ARIAL#|nach foo Fehlt in der Java Syntax die Zweite Klammer");
                            fail=false;
                        }
                    }
                    else {
                        System.out.println("#ARIAL#|nach foo Fehlt in der Java Syntax ein Semicolon -> (;)");
                        fail=false;
                    }
                }
                else {
                    System.out.println("#ARIAL#|nach foo Fehlt in der Java Syntax die erste Klammer");
                    fail=false;
                }
            }

            else if(tb.getToken().contains("doiv")){
                if(tokenList.get(i-2).getToken().contains("public")){
                    if(tokenList.get(i+1).getToken().contains("(") && tokenList.get(i+1).getToken().contains(")")){
                        if(tokenList.get(i+2).getToken().contains("{")){
                            System.out.println("doiv is correct");
                        }
                        else{
                            System.out.println("Missing Colum after doiv");
                            fail=false;
                        }
                    }
                    else {
                        System.out.println("Failed Methode Name after doiv");
                        fail=false;
                    }
                }
                else{
                    System.out.println("Missing public infront of doiv");
                    fail=false;
                }
            }

            else if(tb.getToken().contains("ssalc")){
                if(tokenList.get(i-1).getToken().contains("public")||tokenList.get(i-1).getToken().contains("private")){
                    if(tokenList.get(i+1).getToken().length()>0){
                        if(tokenList.get(i+2).getToken().contains("{")){
                            System.out.println("ssalc is correct");
                        }
                        else{
                            System.out.println("Missing Colum after ssalc");
                            fail=false;
                        }
                    }
                    else{
                        System.out.println("Missing Class Name");
                        fail=false;
                    }
                }
                else {
                    System.out.println("Missing public or private infront of ssalc");
                    fail=false;
                }
            }
        }
    }
}
