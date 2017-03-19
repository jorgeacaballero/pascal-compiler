/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.compiler;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.*;
import jflex.*;
import pascal.ast.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.Reader;
import java_cup.parser;

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
        LexerGenerator.main(args);
        CupGenerator.main(args);
        Reader reader;
        try {
            reader = new BufferedReader(new FileReader("simpleLoop.txt"));
            Lexer lexer = new Lexer(reader);
           
            
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            mapper.setVisibilityChecker(mapper.getSerializationConfig().getDefaultVisibilityChecker()
                .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
            //mapper.setVisibility(JsonMethod.FIELD, Visibility.ANY);
            
            parser cupParser = new parser(lexer);
            cupParser.parse();
            mapper.writeValue(new File("./AST.json"), cupParser.root);

            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
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
