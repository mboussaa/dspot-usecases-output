package org.sat4j.minisat;


import junit.framework.TestCase;
import org.junit.Assert;
import org.sat4j.specs.ISolver;


public class AmplGenericM2Test extends AbstractM2Test<ISolver> {
    private final String solvername;

    private static final SolverFactory FACTORY = SolverFactory.instance();

    public AmplGenericM2Test(String arg0) {
        setName(("AbstractM2Test" + arg0));
        this.solvername = arg0;
    }

    @Override
    protected ISolver createSolver() {
        return AmplGenericM2Test.FACTORY.createSolverByName(this.solvername);
    }

    @Override
    protected void runTest() throws Throwable {
        Assert.assertFalse(solveInstance(((AbstractM2Test.PREFIX) + "pigeons/hole6.cnf")));
    }
}

