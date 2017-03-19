/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.compiler;

import java.io.File;

/**
 *
 * @author jorgecaballero
 */
public class LexerGenerator {
    public static void main(String[] args) {
        String paramsLexer[] = new String[3];
        paramsLexer[0] = "-d";
        paramsLexer[1] = "src/pascal/compiler/";
        paramsLexer[2] = "src/pascal/compiler/lexer.flex";
        try {
            jflex.Main.generate(paramsLexer);
        } catch (Exception e) {
        }
    }
    
    public static void generateLexer(String path) {
        File file = new File(path);
        jflex.Main.generate(file);
    }
}

