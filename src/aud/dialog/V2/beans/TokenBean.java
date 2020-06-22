package aud.dialog.V2.beans;

import java.util.List;

public class TokenBean {
    List<TokenPart> l;
    String Dialekt;
    String Token;

    public TokenBean(List<TokenPart> l) {
        this.l = l;
    }

    public List<TokenPart> getL() {
        return l;
    }

    public void setL(List<TokenPart> l) {
        this.l = l;
    }

    public String getDialekt() {
        return Dialekt;
    }

    public void setDialekt(String dialekt) {
        Dialekt = dialekt;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public TokenBean(String dialekt, String token) {
        Dialekt = dialekt;
        Token = token;
    }
}
