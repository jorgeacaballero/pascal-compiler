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
            reader = new BufferedReader(new FileReader("./test/hello.pas"));
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
            mapper.writeValue(new File("./src/pascal/compiler/AST.json"), cupParser.root);

            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println(ex);
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            System.out.println(ex);
            Logger.getLogger(PascalCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
