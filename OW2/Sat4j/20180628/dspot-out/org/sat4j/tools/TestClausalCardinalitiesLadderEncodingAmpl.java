package org.sat4j.tools;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.Policy;


public class TestClausalCardinalitiesLadderEncodingAmpl {
    private ISolver solver;

    private Policy policy;

    private static final boolean MODE_DEBUG = false;

    @Before
    public void setUp() {
        this.policy = new Policy();
        this.policy.setAtMostOneEncoding(EncodingStrategy.LADDER);
        this.policy.setAtMostKEncoding(EncodingStrategy.LADDER);
        this.policy.setAtLeastOneEncoding(EncodingStrategy.LADDER);
        this.policy.setAtLeastKEncoding(EncodingStrategy.LADDER);
        this.policy.setExactlyOneEncoding(EncodingStrategy.LADDER);
        this.policy.setExactlyKEncoding(EncodingStrategy.LADDER);
        this.solver = new ClausalCardinalitiesDecorator<ISolver>(SolverFactory.newDefault(), policy);
    }
}

