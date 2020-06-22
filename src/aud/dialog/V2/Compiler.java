package aud.dialog.V2;

import aud.dialog.V2.beans.TokenBean;
import aud.dialog.V2.beans.TokenPart;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Compiler {

    public void compile(List<TokenBean> trueTokenBeans,List<TokenBean> layoutBeans) throws IOException {
        Parser p=new Parser();
        if(p.parse(trueTokenBeans)==true){
            BufferedWriter br=new BufferedWriter(new FileWriter("Arial-Output.java"));


                for (TokenBean b : layoutBeans) {
                    if (b.getDialekt() == null || b.getToken() == null) {
                        List<TokenPart> tokenParts = b.getL();
                        for (TokenPart tp : tokenParts) {
                            String token=tp.getToken();
                            switch (token){
                                case "foo":
                                    br.write("for ");
                                    break;
                                case "doiv":
                                    br.write("void ");
                                    break;
                                case "ssalc":
                                    br.write("class ");
                                    break;
                                default :
                                    br.write(token+" ");
                                    break;
                            }

                        }
                        br.write("\n");
                    } else {
                        br.write(b.getToken()+"\n");
                    }
                }
            br.flush();
            br.close();
        }
        else{
            System.out.println("Failed to compile");
        }
    }
}
