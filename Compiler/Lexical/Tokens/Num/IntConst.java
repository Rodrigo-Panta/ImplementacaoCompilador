package Compiler.Lexical.Tokens.Num;

import Compiler.Lexical.Tag;

public class IntConst extends Num{
    public IntConst(long value){
        super(value, Tag.INT_CONST);
    }
}
