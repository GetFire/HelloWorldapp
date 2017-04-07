package com.getfire.spring.ch3.oracle;

public class BookWormOracle implements Oracle {
    private static int count;

    public BookWormOracle() {
        count++;
    }

    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste  of money - use the Internet";
    }

    @Override
    public String toString() {
        return "BookWormOracle{"+count+"}";
    }
}
