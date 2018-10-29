package org.sat4j.tools;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.Policy;


public class TestClausalCardinalitiesBinaryEncodingAmpl {
    private ISolver solver;

    private Policy policy;

    private static final boolean MODE_DEBUG = false;

    @Before
    public void setUp() {
        this.policy = new Policy();
        this.policy.setAtMostOneEncoding(EncodingStrategy.BINARY);
        this.policy.setAtMostKEncoding(EncodingStrategy.BINARY);
        this.policy.setAtLeastOneEncoding(EncodingStrategy.BINARY);
        this.policy.setAtLeastKEncoding(EncodingStrategy.BINARY);
        this.policy.setExactlyOneEncoding(EncodingStrategy.BINARY);
        this.policy.setExactlyKEncoding(EncodingStrategy.BINARY);
        this.solver = new ClausalCardinalitiesDecorator<ISolver>(SolverFactory.newDefault(), this.policy);
    }
}

