/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import jflex.*;

/**
 *
 * @author jorgecaballero
 */
public class PascalCompiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("./src/pascal/compiler/lexer.flex");
        jflex.Main.generate(file);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./test/hello.pas"));
            Lexer lexer = new Lexer(reader);
            Integer token = lexer.next_token().sym;
            while (token != 0) {
                System.out.println(token);
                token = lexer.next_token().sym;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
