package org.sat4j.tools;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.Policy;


public class TestClausalCardinalitiesProductEncodingAmpl {
    private ISolver solver;

    private Policy policy;

    private static final boolean MODE_DEBUG = false;

    @Before
    public void setUp() {
        this.policy = new Policy();
        this.policy.setAtMostOneEncoding(EncodingStrategy.PRODUCT);
        this.policy.setAtMostKEncoding(EncodingStrategy.PRODUCT);
        this.policy.setAtLeastOneEncoding(EncodingStrategy.PRODUCT);
        this.policy.setAtLeastKEncoding(EncodingStrategy.PRODUCT);
        this.policy.setExactlyOneEncoding(EncodingStrategy.PRODUCT);
        this.policy.setExactlyKEncoding(EncodingStrategy.PRODUCT);
        this.solver = new ClausalCardinalitiesDecorator<ISolver>(SolverFactory.newDefault(), policy);
    }
}

