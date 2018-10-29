package org.sat4j;


import org.junit.Before;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.OptToSatAdapter;


public class AmplBugSAT95 {
    private ISolver solver;

    private MinOneDecorator minOne;

    private OptToSatAdapter adapter;

    @Before
    public void setUp() throws ContradictionException {
        solver = SolverFactory.newDefault();
        minOne = new MinOneDecorator(solver);
        adapter = new OptToSatAdapter(minOne);
        IVecInt clause = new VecInt();
        clause.push(1).push(2);
        minOne.addClause(clause);
        clause.clear();
        clause = new VecInt();
        clause.push(1).push((-3));
        minOne.addClause(clause);
        clause.clear();
        clause = new VecInt();
        clause.push(1).push(3).push(4);
        minOne.addClause(clause);
        clause.clear();
    }
}

