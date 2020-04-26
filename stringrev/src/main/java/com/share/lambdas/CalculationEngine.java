package com.share.lambdas;

public class CalculationEngine {
    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] { 42.6, 50, 48, 49, 43, 41, 45, 44, 46, 45.7, 48.4, 44.5
            };
    public static void main(String[] args) {
        final Sales sales = new Sales(EXPECTED_SALES_JAN_TO_DEC);
        final FixedCosts fixedCosts = new FixedCosts(15.0);
        final IncrementalCosts incrementalCosts = new IncrementalCosts(5.1,0.15);
        final Profit profit = new Profit(
                sales,
                incrementalCosts,
                fixedCosts
        );
        double total = 0.0;
        for(int i=1;i<=12;i++){
            total += profit.valueAt(i);
        }

        System.out.println("Total profits for the year: "+total);
    }
}
