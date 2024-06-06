package com.gustavopeiretti.patterns.strategy;

public class FullCommission implements CommissionStrategy {
    @Override
    public double applyCommission(double amount) {
        // do complicate formula of commissions.
        return amount * 0.50d;
    }
}
