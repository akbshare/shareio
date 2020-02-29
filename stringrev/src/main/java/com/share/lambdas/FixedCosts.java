package com.share.lambdas;

public class FixedCosts extends PolynomialQuantity {
    protected FixedCosts(double constant) {
        super(new double[]{constant});
    }

    @Override
    public String getName() {
        return "Fixed Costs";
    }
}
