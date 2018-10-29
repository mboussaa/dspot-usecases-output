package org.sat4j.tools;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.Policy;


public class TestClausalCardinalitiesSequentialEncodingAmpl {
    private ISolver solver;

    private Policy policy;

    private static final boolean MODE_DEBUG = false;

    @Before
    public void setUp() {
        this.policy = new Policy();
        this.policy.setAtMostOneEncoding(EncodingStrategy.SEQUENTIAL);
        this.policy.setAtMostKEncoding(EncodingStrategy.SEQUENTIAL);
        this.policy.setAtLeastOneEncoding(EncodingStrategy.SEQUENTIAL);
        this.policy.setAtLeastKEncoding(EncodingStrategy.SEQUENTIAL);
        this.policy.setExactlyOneEncoding(EncodingStrategy.SEQUENTIAL);
        this.policy.setExactlyKEncoding(EncodingStrategy.SEQUENTIAL);
        this.solver = new ClausalCardinalitiesDecorator<ISolver>(SolverFactory.newDefault(), policy);
    }
}

