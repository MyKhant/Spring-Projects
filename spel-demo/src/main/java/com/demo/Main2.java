package com.demo;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main2 {
    public static void main(String[] args) {
        ExpressionParser parser =
                new SpelExpressionParser();
        System.out.println(parser.parseExpression("'Hello World'.toUpperCase()").getValue());
        System.out.println(parser.parseExpression("'2 + 5 is equals to '.concat(2+5)").getValue());
        System.out.println(parser.parseExpression("{1,2,3,4,5}").getValue());
        System.out.println(parser.parseExpression("{a:2, b:3, c:4}").getValue());
        System.out.println(parser.parseExpression("'5 > 2 is '.concat(5 > 2)").getValue());
    }

}
