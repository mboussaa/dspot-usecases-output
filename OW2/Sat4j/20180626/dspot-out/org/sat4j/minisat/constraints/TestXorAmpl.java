package org.sat4j.minisat.constraints;


import java.io.PrintWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;


public class TestXorAmpl {
    private ISolver solver;

    @Before
    public void setUp() {
        solver = SolverFactory.newDefault();
    }

    @Test(timeout = 10000)
    public void twoLargeOppositeParity() throws Exception, TimeoutException {
        int size = 16;
        int o_twoLargeOppositeParity__2 = solver.newVar(size);
        Assert.assertEquals(16, ((int) (o_twoLargeOppositeParity__2)));
        IVecInt lits = new VecInt(size);
        for (int i = 0; i < size; i++) {
            lits.push((i + 1));
        }
        solver.addParity(lits, true);
        solver.addParity(lits, false);
        boolean o_twoLargeOppositeParity__12 = solver.isSatisfiable();
        Assert.assertFalse(o_twoLargeOppositeParity__12);
        this.solver.printStat(new PrintWriter(System.out, true));
        Assert.assertEquals(16, ((int) (o_twoLargeOppositeParity__2)));
        Assert.assertFalse(o_twoLargeOppositeParity__12);
    }

    @Test(timeout = 10000)
    public void checkNumberOfSolutionWithClauses() throws Exception, ContradictionException, TimeoutException {
        int o_checkNumberOfSolutionWithClauses__1 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_checkNumberOfSolutionWithClauses__1)));
        IVecInt lits = new VecInt(new int[]{ 1, 2, 3 });
        solver.addParity(lits, true);
        IVecInt clause = new VecInt(new int[]{ 1, 2, 3 });
        IConstr o_checkNumberOfSolutionWithClauses__7 = solver.addClause(clause);
        int[] array_1707940459 = new int[]{2, 4, 6};
        	int[] array_1316973585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).getLits();
        	for(int ii = 0; ii <array_1707940459.length; ii++) {
        		org.junit.Assert.assertEquals(array_1707940459[ii], array_1316973585[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).isSatisfied());
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).hashCode())));
        clause.clear();
        IVecInt o_checkNumberOfSolutionWithClauses__9 = clause.push((-1)).push((-3));
        Assert.assertEquals("-1,-3", ((org.sat4j.core.VecInt)o_checkNumberOfSolutionWithClauses__9).toString());
        Assert.assertEquals(-2, ((int) (((org.sat4j.core.VecInt)o_checkNumberOfSolutionWithClauses__9).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_checkNumberOfSolutionWithClauses__9).isEmpty());
        IConstr o_checkNumberOfSolutionWithClauses__13 = solver.addClause(clause);
        int[] array_268709476 = new int[]{3, 7};
        	int[] array_1565255191 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).getLits();
        	for(int ii = 0; ii <array_268709476.length; ii++) {
        		org.junit.Assert.assertEquals(array_268709476[ii], array_1565255191[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).isSatisfied());
        Assert.assertEquals("-1[?] -3[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).hashCode())));
        ModelIterator iterator = new ModelIterator(solver);
        while (iterator.isSatisfiable()) {
            iterator.model();
        } 
        long o_checkNumberOfSolutionWithClauses__21 = iterator.numberOfModelsFoundSoFar();
        Assert.assertEquals(2L, ((long) (o_checkNumberOfSolutionWithClauses__21)));
        System.out.println(new VecInt(this.solver.model()));
        Assert.assertEquals(3, ((int) (o_checkNumberOfSolutionWithClauses__1)));
        int[] array_1257412961 = new int[]{4, 6, 2};
        	int[] array_2122754561 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).getLits();
        	for(int ii = 0; ii <array_1257412961.length; ii++) {
        		org.junit.Assert.assertEquals(array_1257412961[ii], array_2122754561[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).isSatisfied());
        Assert.assertEquals("2[?] 3[?] 1[?] ", ((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).toString());
        Assert.assertEquals(4, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithClauses__7).hashCode())));
        Assert.assertEquals("-1,-3", ((org.sat4j.core.VecInt)o_checkNumberOfSolutionWithClauses__9).toString());
        Assert.assertEquals(-2, ((int) (((org.sat4j.core.VecInt)o_checkNumberOfSolutionWithClauses__9).hashCode())));
        Assert.assertFalse(((org.sat4j.core.VecInt)o_checkNumberOfSolutionWithClauses__9).isEmpty());
        int[] array_534937887 = new int[]{3, 7};
        	int[] array_1634877861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).getLits();
        	for(int ii = 0; ii <array_534937887.length; ii++) {
        		org.junit.Assert.assertEquals(array_534937887[ii], array_1634877861[ii]);
        	};
        Assert.assertEquals(0.0, ((double) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).getActivity())), 0.1);
        Assert.assertFalse(((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).isSatisfied());
        Assert.assertEquals("-1[?] -3[?]", ((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).toString());
        Assert.assertEquals(5, ((int) (((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_checkNumberOfSolutionWithClauses__13).hashCode())));
        Assert.assertEquals(2L, ((long) (o_checkNumberOfSolutionWithClauses__21)));
    }
}

