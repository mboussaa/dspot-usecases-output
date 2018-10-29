package org.sat4j.minisat;


import junit.framework.TestCase;
import org.junit.Before;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.Solver;
import org.sat4j.reader.InstanceReader;


public class TestsFonctionnelsAmpl {
    private static final String PREFIX = System.getProperty("test.prefix");

    private Solver<DataStructureFactory> solver;

    private InstanceReader reader;

    public TestsFonctionnelsAmpl(String arg0) {
        super(arg0);
    }

    @Before
    public void setUp() throws Exception {
        this.solver = SolverFactory.newMiniSATHeap();
        this.reader = new InstanceReader(this.solver);
    }
}

