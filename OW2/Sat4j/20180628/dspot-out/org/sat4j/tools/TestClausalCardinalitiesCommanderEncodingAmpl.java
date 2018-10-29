package org.sat4j.tools;


import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.encoding.EncodingStrategy;
import org.sat4j.tools.encoding.Policy;


public class TestClausalCardinalitiesCommanderEncodingAmpl {
    private ISolver solver;

    private Policy policy;

    private static final boolean MODE_DEBUG = false;

    @Before
    public void setUp() {
        this.policy = new Policy();
        this.policy.setAtMostOneEncoding(EncodingStrategy.COMMANDER);
        this.policy.setAtMostKEncoding(EncodingStrategy.COMMANDER);
        this.policy.setAtLeastOneEncoding(EncodingStrategy.COMMANDER);
        this.policy.setAtLeastKEncoding(EncodingStrategy.COMMANDER);
        this.policy.setExactlyOneEncoding(EncodingStrategy.COMMANDER);
        this.policy.setExactlyKEncoding(EncodingStrategy.COMMANDER);
        this.solver = new ClausalCardinalitiesDecorator<ISolver>(SolverFactory.newDefault(), policy);
    }
}

