package aud.dialog.V2.beans;

import java.util.List;

public class TokenPart {
    String dialekt;
    String token;

    public TokenPart(String dialekt, String token) {
        this.dialekt = dialekt;
        this.token = token;
    }

    public String getDialekt() {
        return dialekt;
    }

    public void setDialekt(String dialekt) {
        this.dialekt = dialekt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
