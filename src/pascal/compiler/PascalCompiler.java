/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.*;
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
        String[] jfelx_file = {"./src/pascal/compiler/lexer.flex"};
        jflex.Main.main(jfelx_file);

        String[] cup_file = {"-parser", "AnalizadorSintactico", "./src/pascal/compiler/sintax.cup"};
        try {
            java_cup.Main.main(cup_file);
        } catch (Exception ex) {
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }

        boolean mvAS = moveFile("AnalizadorSintactico.java");
        boolean mvSym= moveFile("sym.java");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./test/buble.pas"));
            Lexer lexer = new Lexer(reader);
            Integer token = lexer.next_token().sym;

            while (token != 0) {
                token = lexer.next_token().sym;
            }
        } catch (IOException e) {
            System.out.println(e);
        }


//        String[] archivoPrueba = {"./test/buble.pas"};
//        AnalizadorSintactico.main(archivoPrueba);

    }

    public static boolean moveFile(String fileName) {
        boolean done = false;
        File arch = new File(fileName);
        if (arch.exists()) {
            Path currentRelativePath = Paths.get("");
            String newDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "pascal/compiler" + File.separator + arch.getName();
            File oldFile = new File(newDir);
            oldFile.delete();
            if (arch.renameTo(new File(newDir))) {
                done = true;
            }
        } else {
            System.out.println("\nCode not found\n");
        }
        return done;
    }

}
