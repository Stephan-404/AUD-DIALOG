/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aud.dialog.V1.beans;

/**
 *
 * @author stiegerstephan
 */
public class Token {
    String toke;
    String dialekt;

    public Token(String toke, String dialekt) {
        this.toke = toke;
        this.dialekt = dialekt;
    }

    public String getToke() {
        return toke;
    }

    public void setToke(String toke) {
        this.toke = toke;
    }

    public String getDialekt() {
        return dialekt;
    }

    public void setDialekt(String dialekt) {
        this.dialekt = dialekt;
    }
    
    
    
}
