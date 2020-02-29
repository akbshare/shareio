package com.share.lambdas;

public class IncrementalCosts extends PolynomialQuantity {
    protected IncrementalCosts(final double intercept,
                               final double slope) {
        super(new double[]{intercept, slope});
    }

    @Override
    public String getName() {
        return "Incremental Costs";
    }
}
