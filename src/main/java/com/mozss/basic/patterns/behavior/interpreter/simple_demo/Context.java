package com.mozss.basic.patterns.behavior.interpreter.simple_demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mozss
 * @create 2019-10-27 17:42
 */

public class Context {

    private final Map<Variable, Boolean> map = new HashMap<Variable, Boolean>();

    public void assign(Variable var, boolean value) {
        map.put(var, new Boolean(value));
    }

    public boolean lookup(Variable var) throws IllegalArgumentException {
        Boolean value = map.get(var);
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
