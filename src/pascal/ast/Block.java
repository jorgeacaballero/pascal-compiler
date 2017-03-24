/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.ast;

/**
 *
 * @author jorgecaballero
 */
public class Block {
    public LabelDeclaration label_declaration;
    public Block block;
    public ConstantDeclaration constant_declaration;
    public TypeDeclaration type_declaration;
    public VariableDeclaration variable_declaration;
    public ProcAndFuncDeclaration proc_and_func_declaration;
    public StatementList statement_list;
    String semicolon, begin, end;

    public Block(Block block) {
        this.block = block;
    }

    public Block(Block block, LabelDeclaration label_declaration, String semicolon) {
        this.label_declaration = label_declaration;
        this.block = block;
        this.semicolon = semicolon;
    }

    public Block(Block block, ConstantDeclaration constant_declaration, String semicolon) {
        this.block = block;
        this.constant_declaration = constant_declaration;
        this.semicolon = semicolon;
    }

    public Block(Block block, TypeDeclaration type_declaration, String semicolon) {
        this.block = block;
        this.type_declaration = type_declaration;
        this.semicolon = semicolon;
    }

    public Block(Block block, VariableDeclaration variable_declaration, String semicolon) {
        this.block = block;
        this.variable_declaration = variable_declaration;
        this.semicolon = semicolon;
    }

    public Block(Block block, ProcAndFuncDeclaration proc_and_func_declaration, String semicolon) {
        this.block = block;
        this.proc_and_func_declaration = proc_and_func_declaration;
        this.semicolon = semicolon;
    }

    public Block(StatementList statement_list, String begin, String end) {
        this.statement_list = statement_list;
        this.begin = begin;
        this.end = end;
    }
    
    
    
}
