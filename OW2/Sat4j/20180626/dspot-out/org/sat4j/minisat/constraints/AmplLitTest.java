package org.sat4j.minisat.constraints;


import junit.framework.TestCase;
import org.junit.Before;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;


public class AmplLitTest {
    private ILits lits;

    public AmplLitTest(String arg0) {
        super(arg0);
    }

    @Before
    public void setUp() throws Exception {
        this.lits = new Lits();
    }
}

