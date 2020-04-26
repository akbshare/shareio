package com.share.lambdas.fp;

import com.share.lambdas.QuantityOfInterest;

public class Sales implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;
    public Sales(FunctionOverTime valueFunction){
        this.valueFunction = valueFunction;
    }
    @Override
    public String getName() {
        return "Sales";
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
