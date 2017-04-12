package com.getfire.spring.ch3.annotation;

import com.getfire.spring.ch3.oracle.Oracle;
import org.springframework.stereotype.Service;

@Service("oracle")
public class BookWormOracleAnnot implements Oracle {
    private static int count;

    public BookWormOracleAnnot() {
        count++;
    }

    public String defineMeaningOfLife() {
        return "AnnotOracle: Encyclopedias are a waste  of money - use the Internet";
    }

    @Override
    public String toString() {
        return "BookWormOracle{" + count + "}";
    }
}
