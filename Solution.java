package com.javarush.task.task34.task3404;

import com.sun.jmx.remote.internal.ArrayQueue;
import com.sun.org.apache.xpath.internal.operations.Plus;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;


/*
Рекурсия для мат. выражения
*/
public class Solution {
    //private TokenParser tp;
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        String s = "10 * sin(90)";
//        System.out.print(s + " expected output 10 2 actually ");
//        solution.recurse(s, 0);
//
//        s = "sin(90)";
//        System.out.print(s + " expected output 1 1 actually ");
//        solution.recurse(s, 0);

        //s = "sin(2*(-5+1.5*4)+28)";
        //System.out.print(s + " expected output 0.5 6 actually ");
        //solution.recurse(s, 0);

        s = "1^cos(0)";
        System.out.print(s + " expected output 1 2 actually ");
        solution.recurse(s, 0);
//
//        s = "-2^(-2)";
//        System.out.print(s + " expected output -0.25 3 actually ");
//        solution.recurse(s, 0);
//        s = "-(-2^(-2))+2+(-(-2^(-2)))";
//        System.out.print(s + " expected output 2.5 10 actually ");
//        solution.recurse(s, 0);
//        s = "(-2)*(-2)";
//        System.out.print(s + " expected output 4 3 actually ");
//        solution.recurse(s, 0);
//        s = "(-2)/(-2)";
//        System.out.print(s + " expected output 1 3 actually ");
//        solution.recurse(s, 0);
//        s = "sin(-30)";
//        System.out.print(s + " expected output -0.5 2 actually ");
//        solution.recurse(s, 0);
//        s = "cos(-30)";
//        System.out.print(s + " expected output 0.87 2 actually ");
//        solution.recurse(s, 0);
//        s = "tan(-30)";
//        System.out.print(s + " expected output -0.58 2 actually ");
//        solution.recurse(s, 0);
//        s = "2+8*(9/4-1.5)^(1+1)";
//        System.out.print(s + " expected output 6.5 6 actually ");
//        solution.recurse(s, 0);
//        s = "0.005 ";
//        System.out.print(s + " expected output 0.01 0 actually ");
//        solution.recurse(s, 0);
//        s = "0.0049 ";
//        System.out.print(s + " expected output 0 0 actually ");
//        solution.recurse(s, 0);
//        s = "0+0.304";
//        System.out.print(s + " expected output 0.3 1 actually ");
//        solution.recurse(s, 0);
//        s = "10-2^(2-1+1)";
//        System.out.print(s + " expected output 6 4 actually ");
//        solution.recurse(s, 0);
//        s = "2^10+2^(5+5)";
//        System.out.print(s + " expected output 2048 4 actually ");
//        solution.recurse(s, 0);
//        s = "1.01+(2.02-1+1/0.5*1.02)/0.1+0.25+41.1";
//        System.out.print(s + " expected output 72.96 8 actually ");
//        solution.recurse(s, 0);
//        s = "0.000025+0.000012";
//        System.out.print(s + " expected output 0 1 actually ");
//        solution.recurse(s, 0);
//        s = "-2-(-2-1-(-2)-(-2)-(-2-2-(-2)-2)-2-2)";
//        System.out.print(s + " expected output -3 16 actually ");
//        solution.recurse(s, 0);
//        s = "cos(3 + 19*3)";
//        System.out.print(s + " expected output 0.5 3 actually ");
//        solution.recurse(s, 0);
//        s = "2*(589+((2454*0.1548/0.01*(-2+9^2))+((25*123.12+45877*25)+25))-547)";
//        System.out.print(s + " expected output 8302231.36 14 actually ");
//        solution.recurse(s, 0);
//        s = "(-1 + (-2))";
//        System.out.print(s + " expected output -3 3 actually ");
//        solution.recurse(s, 0);
//        s = "-sin(2*(-5+1.5*4)+28)";
//        System.out.print(s + " expected output -0.5 7 actually ");
//        solution.recurse(s, 0);
//        s = "sin(100)-sin(100)";
//        System.out.print(s + " expected output 0 3 actually ");
//        solution.recurse(s, 0);
//        s = "sin(2*(-5+1.5*4)+28)";
//        System.out.print(s + " expected output 0.5 6 actually ");
//        solution.recurse(s, 0);
//        s = "tan(45)";
//        System.out.print(s + " expected output 1 1 actually ");
//        solution.recurse(s, 0);
//        s = "tan(-45)";
//        System.out.print(s + " expected output -1 2 actually ");
//        solution.recurse(s, 0);
//        s = "0.305";
//        System.out.print(s + " expected output 0.3 0 actually ");
//        solution.recurse(s, 0);
//        s = "0.3051";
//        System.out.print(s + " expected output 0.31 0 actually ");
//        solution.recurse(s, 0);
//        s = "(0.3051)";
//        System.out.print(s + " expected output 0.31 0 actually ");
//        solution.recurse(s, 0);
//        s = "1+(1+(1+1)*(1+1))*(1+1)+1";
//        System.out.print(s + " expected output 12 8 actually ");
//        solution.recurse(s, 0);
//        s = "tan(44+sin(89-cos(180)^2))";
//        System.out.print(s + " expected output 1 6 actually ");
//        solution.recurse(s, 0);
//        s = "-2+(-2+(-2)-2*(2+2))";
//        System.out.print(s + " expected output -14 8 actually ");
//        solution.recurse(s, 0);
//        s = "sin(80+(2+(1+1))*(1+1)+2)";
//        System.out.print(s + " expected output 1 7 actually ");
//        solution.recurse(s, 0);
//        s = "1+4/2/2+2^2+2*2-2^(2-1+1)";
//        System.out.print(s + " expected output 6 11 actually ");
    }


    public void tryParse(String mathExpression){
        String regaxTrue = "((?<=[-+*/()^ ])(?<![+*/()][-])(?=[-]?\\d)|(?<=\\d)(?=[-+*/()^ ]))|(?<=[-+*/()^ ])(?=(sin|cos|tan))|(?<=(sin|cos|tan)(?=[()^ ]))|(?=[()])(?<=([-+*/()^ ]))";
        String[] array = mathExpression.split(regaxTrue);
        System.out.println(Arrays.toString(array));
    }


    public void recurse(final String expression, int countOperation) throws Exception {
        TokenParser tp = TokenParser.getInstance(expression);
        if (countOperation == tp.getCountOperations()){
            double result = tp.getResult().getVal();

            String k = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP).toString();
            k = new DecimalFormat("#.##").format(Double.valueOf(k));
            System.out.println(k.replace(",", ".") + " " + tp.getCountOperations());
            TokenParser.makeNull();
            return;
        }

        recurse(tp.returnText(),++countOperation);
    }



    public Solution() {
        //don't delete
    }


    public static class Parser{
        TokenParser tp = null;

        public Parser(TokenParser tp) {
            this.tp = tp;
        }

        public Token MulDiv() throws Exception {
            Token result = Bracket();
            Token operation = TokenParser.getInstance().getToken();
            if (operation.getType() != Type.UMN && operation.getType() != Type.DIV && operation.getType()!= Type.POW){
                TokenParser.getInstance().returnToken(operation);
                return result;
            }
            Token right = Bracket();
            return result.operation(operation,right);
        }

        private Token PlusMinus() throws Exception {
            TokenParser tp = TokenParser.getInstance();

            Token result = MulDiv();
            Token operation = tp.getToken();
            if (operation.getType() != Type.PLUS && operation.getType() != Type.MINUS){
                TokenParser.getInstance().returnToken(operation);
                return result;
            }
            Token right = MulDiv();
            Token tokenResult = result.operation(operation,right);

            return tokenResult;
        }

        public Token Bracket() throws Exception {
            Token token = TokenParser.getInstance().getToken();
            if (token.getType()== Type.L_BR){
                Token result = PlusMinus();
                Token leftBr = TokenParser.getInstance().getToken();
                if (leftBr.getType()==Type.R_BR){
                    return result;
                }else{
                    System.out.println("Скобощке не закрыл");
                }
            }
            TokenParser.getInstance().returnToken(token);
            return Function();
        }

        public Token Function() throws Exception {
            Token token = TokenParser.getInstance().getToken();
            if (TokenParser.getInstance().isFunction(token)){
                Token bracket = Bracket();
                return bracket.function(token);
            }
            TokenParser.getInstance().returnToken(token);
            return num();
        }

        public Token num(){
            return TokenParser.getInstance().getToken();
        }

    }



    public static class TokenParser{
        public static TokenParser tokenParser;
        private int countOperations = 0;
        private String mathExpression;
        private int curIdx = 0;
        private String[] tokensString;
        private boolean isReady = false;
        private ArrayDeque<Token> tokens = new ArrayDeque<Token>();

        public static TokenParser getInstance(){
            return tokenParser;
        }

        public Token getResult() throws Exception {
            return new Parser(tokenParser).PlusMinus();
        }

        public static void makeNull(){
            tokenParser = null;
        }
        public static TokenParser getInstance(String mathExpression){
            if (tokenParser == null){
                tokenParser = new TokenParser(mathExpression);
                return tokenParser;
            }else {
                return tokenParser;
            }
        }

        public int getCountOperations() {
            return countOperations;
        }

        private TokenParser(String mathExpression) {
            this.mathExpression = mathExpression;
            String regax = "((?<=[-+*/()^ ])(?<![+*/()^][-])(?=[-]?\\d)|(?<=\\d)(?=[-+*/()^ ]))|(?<=[-+*/()^ ])(?=(sin|cos|tan))|(?<=(sin|cos|tan)(?=[()^ ]))|(?=[()])(?<=([-+*/()^ ]))|(?<=[() ])(?=[-+*/^ ])";
            //String regax = "((?<=[-+*/()^ ])(?<![+*/()][-])(?=[-]?\\d)|(?<=\\d)(?=[-+*/()^ ]))|((?=([-+*/()^ ])|(sin|cos|tan))(?<=[()])|(?=[()])(?<=([-+*/()^ ])|(sin|cos|tan)))|((?=(sin|cos|tan)(?<=[-+*/()^ ]))|(?=[-+*/()^ ])(?<=(sin|cos|tan)))";
            tokensString = mathExpression.split(regax);

            for (int i = 0; i < tokensString.length ; i++) {
                if (tokensString[i].trim().equals("")){
                    continue;
                }
                if (tokensString[i].matches("[-]?[0-9]+[.]?[0-9]*")){
                    double num = Double.parseDouble(tokensString[i]);
                    if (num<0){
                        countOperations++;
                    }
                    tokens.add(new Token(num,Type.NUM));
                }else {
                    Token token = new Token(Type.getType(tokensString[i]));
                    if (token.getType()!= Type.L_BR && token.getType() != Type.R_BR){
                        countOperations ++;
                    }
                    tokens.add(token);
                }
            }
        }

        public boolean isFunction(Token token){
            return token.getType() == Type.COS || token.getType() == Type.SIN || token.getType() == Type.TAN;
        }

        public Token getToken(){
            if (!tokens.isEmpty()){
                return tokens.pollFirst();
            }else {
                return new Token(Type.NULL);
            }
        }

        public void returnToken(Token token){
            tokens.addFirst(token);
            if (tokens.size()==1){
                isReady = true;

            }
        }

        public boolean isReady(){
            return isReady;
        }

        public boolean isEmpty() {
            return tokens.isEmpty();
        }

        public String returnText(){
            StringBuilder sb = new StringBuilder();
            Iterator<Token> iterator = tokens.iterator();
            while (iterator.hasNext()){
                sb.append(iterator.next());
            }
            return sb.toString();
        }
    }

    public static class Token {
        private Type type;
        private double val;

        public Token(double val, Type type) {
            this.val = val;
            this.type = type;
        }
        public double getVal() {
            return val;
        }
        public Type getType() {
            return type;
        }
        public Token(Type type) {
            this(-1,type);
        }

        public Token function(Token function){
            switch (function.getType()){
                case COS:
                    return new Token(Math.cos(Math.toRadians(val)),Type.NUM);
                case SIN:
                    return new Token(Math.sin(Math.toRadians(val)),Type.NUM);
                case TAN:
                    return new Token(Math.tan(Math.toRadians(val)),Type.NUM);
                default:
                    return new Token(Type.NULL);
            }
        }

        public Token operation(Token operation, Token value){
            switch (operation.getType()){
                case PLUS:
                    return new Token(val + value.getVal(),Type.NUM);
                case MINUS:
                    return new Token(val - value.getVal(), Type.NUM);
                case UMN:
                    return new Token(val*value.getVal(),Type.NUM);
                case DIV:
                    return new Token(val/value.getVal(),Type.NUM);
                case POW:
                    return new Token(Math.pow(val,value.getVal()),Type.NUM);
                default:
                    return new Token(Type.NULL);
            }
        }

        @Override
        public String toString() {
            if (type == Type.NUM){
                return ""+val;
            }else {
                return type.getOperation();
            }

        }
    }

    public enum Type{
        NUM("NUM"),
        PLUS("+"),
        MINUS("-"),
        UMN("*"),
        DIV("/"),
        POW("^"),
        SIN("sin"),
        COS("cos"),
        TAN("tan"),
        L_BR("("),
        R_BR(")"),
        NULL("");

        private String operation;
        Type(String operation) {
            this.operation = operation;
        }
        public String getOperation() {
            return operation;
        }

        public static  Type getType(String token){
            for (Type operation : Type.values()) {
                if (token.equalsIgnoreCase(operation.operation)) {
                    return operation;
                }
            }
            return NULL;
        }
    }
}
