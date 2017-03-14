/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        String[] alexico = {"./src/pascal/compiler/lexer.flex"};
        jflex.Main.main(alexico);
        String[] cup_file = {"-parser", "AnalizadorSintactico", "./src/pascal/compiler/sintax.cup"};
        try {
            System.out.println("FUCK");
            java_cup.Main.main(cup_file);
        } catch (Exception ex) {
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }


        boolean mvAS = moverArch("AnalizadorSintactico.java");
        boolean mvSym= moverArch("sym.java");
        if(mvAS && mvSym){
            System.exit(0);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("./test/buble.pas"));
            Lexer lexer = new Lexer(reader);
            Integer token = lexer.next_token().sym;
            String[] archivoPrueba = {"./test/buble.pas"};
            AnalizadorSintactico.main(archivoPrueba);
            while (token != 0) {
                System.out.println(token);
                token = lexer.next_token().sym;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static boolean moverArch(String archNombre) {
        boolean efectuado = false;
        File arch = new File(archNombre);
        if (arch.exists()) {
            System.out.println("\n*** Moviendo " + arch + " \n***");
            Path currentRelativePath = Paths.get("");
            String nuevoDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "pascal/compiler" + File.separator + arch.getName();
            File archViejo = new File(nuevoDir);
            archViejo.delete();
            if (arch.renameTo(new File(nuevoDir))) {
                System.out.println("\n*** Generado " + archNombre + "***\n");
                efectuado = true;
            } else {
                System.out.println("\n*** No movido " + archNombre + " ***\n");
            }

        } else {
            System.out.println("\n*** Codigo no existente ***\n");
        }
        return efectuado;
    }

}
