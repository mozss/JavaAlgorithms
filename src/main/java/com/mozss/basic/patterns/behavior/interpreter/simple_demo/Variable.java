package com.mozss.basic.patterns.behavior.interpreter.simple_demo;

/**
 * @author mozss
 * @create 2019-10-27 17:41
 */

public class Variable extends Expression {

    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj instanceof Variable) {
            return this.name.equals(
                    ((Variable) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean interpret(Context ctx) {
        return ctx.lookup(this);
    }

}
