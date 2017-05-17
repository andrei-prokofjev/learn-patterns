package com.apro.patterns.behavioral.interpreter;

public class OrExpression implements Expression {

    private Expression expr1;
    private Expression expr2;

    public OrExpression(Expression expr1, Expression expression2) {
        this.expr1 = expr1;
        this.expr2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
