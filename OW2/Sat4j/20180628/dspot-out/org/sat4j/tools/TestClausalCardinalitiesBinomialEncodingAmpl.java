package org.sat4j.tools;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.Policy;


public class TestClausalCardinalitiesBinomialEncodingAmpl {
    private ISolver solver;

    private Policy policy;

    private static final boolean MODE_DEBUG = false;

    @Before
    public void setUp() {
        this.policy = new Policy();
        this.policy.setAtMostOneEncoding(EncodingStrategy.BINOMIAL);
        this.policy.setAtMostKEncoding(EncodingStrategy.BINOMIAL);
        this.policy.setAtLeastOneEncoding(EncodingStrategy.BINOMIAL);
        this.policy.setAtLeastKEncoding(EncodingStrategy.BINOMIAL);
        this.policy.setExactlyOneEncoding(EncodingStrategy.BINOMIAL);
        this.policy.setExactlyKEncoding(EncodingStrategy.BINOMIAL);
        this.solver = new ClausalCardinalitiesDecorator<ISolver>(SolverFactory.newDefault(), this.policy);
    }
}

