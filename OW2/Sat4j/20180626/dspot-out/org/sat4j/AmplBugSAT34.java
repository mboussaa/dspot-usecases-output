package org.sat4j;


import java.util.ArrayList;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ISolver;


@RunWith(Parameterized.class)
public class AmplBugSAT34 {
    ISolver system;

    String solvername;

    public AmplBugSAT34(ISolver system, String solvername) {
        this.system = system;
        this.solvername = solvername;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateSolvers() {
        Collection<Object[]> solvers = new ArrayList<Object[]>();
        for (String name : SolverFactory.instance().solverNames()) {
            if ((!("DimacsOutput".equals(name))) && (!("Statistics".equals(name)))) {
                solvers.add(new Object[]{ SolverFactory.instance().createSolverByName(name), name });
            }
        }
        return solvers;
    }
}

