package org.sat4j.minisat.constraints;


import java.io.PrintWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.card.AtLeast;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;


public class TestXor {
    private ISolver solver;

    @Before
    public void setUp() {
        solver = SolverFactory.newDefault();
    }

    @Test(timeout = 10000)
    public void twoOppositeParity() throws Exception, TimeoutException {
        int o_twoOppositeParity__1 = solver.newVar(5);
        Assert.assertEquals(5, ((int) (o_twoOppositeParity__1)));
        IVecInt lits = new VecInt(new int[]{ 1, 2, 3, 4, 5 });
        solver.addParity(lits, true);
        solver.addParity(lits, false);
        this.solver.isSatisfiable();
        Assert.assertEquals(5, ((int) (o_twoOppositeParity__1)));
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
        solver.isSatisfiable();
        this.solver.printStat(new PrintWriter(System.out, true));
        Assert.assertEquals(16, ((int) (o_twoLargeOppositeParity__2)));
    }

    @Test(timeout = 10000)
    public void oneParityAndOneCard() throws Exception, ContradictionException, TimeoutException {
        int o_oneParityAndOneCard__1 = solver.newVar(5);
        Assert.assertEquals(5, ((int) (o_oneParityAndOneCard__1)));
        IVecInt lits = new VecInt(new int[]{ 1, 2, 3, 4, 5 });
        solver.addParity(lits, true);
        IConstr o_oneParityAndOneCard__5 = solver.addAtMost(lits, 2);
        Assert.assertFalse(((AtLeast) (o_oneParityAndOneCard__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((AtLeast) (o_oneParityAndOneCard__5)).getActivity())), 0.1);
        Assert.assertEquals("Card (5) :  + -1[?@-1]   + -2[?@-1]   + -3[?@-1]   + -4[?@-1]   + -5[?@-1]  >= 3", ((AtLeast) (o_oneParityAndOneCard__5)).toString());
        solver.isSatisfiable();
        System.out.println(new VecInt(this.solver.model()));
        Assert.assertEquals(5, ((int) (o_oneParityAndOneCard__1)));
        Assert.assertFalse(((AtLeast) (o_oneParityAndOneCard__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((AtLeast) (o_oneParityAndOneCard__5)).getActivity())), 0.1);
        Assert.assertEquals("Card (5) :  + -1[?@-1]   + -2[?@-1]   + -3[?@-1]   + -4[?@-1]   + -5[?@-1]  >= 3", ((AtLeast) (o_oneParityAndOneCard__5)).toString());
    }

    @Test(timeout = 10000)
    public void clauseParityAndCard() throws Exception, ContradictionException, TimeoutException {
        int o_clauseParityAndCard__1 = solver.newVar(5);
        Assert.assertEquals(5, ((int) (o_clauseParityAndCard__1)));
        IVecInt clause = new VecInt(new int[]{ -1, -2, -3 });
        IConstr o_clauseParityAndCard__7 = solver.addClause(clause);
        int[] array_865738281 = new int[]{3,5,7};
        	int[] array_1425321297 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_clauseParityAndCard__7).getLits();
        	for(int ii = 0; ii <array_865738281.length; ii++) {
        		org.junit.Assert.assertEquals(array_865738281[ii], array_1425321297[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_clauseParityAndCard__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_clauseParityAndCard__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] -2[?] -3[?] ", ((OriginalWLClause) (o_clauseParityAndCard__7)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_clauseParityAndCard__7)).hashCode())));
        clause.clear();
        IVecInt o_clauseParityAndCard__9 = clause.push((-4)).push((-5));
        Assert.assertEquals("-4,-5", ((VecInt) (o_clauseParityAndCard__9)).toString());
        Assert.assertEquals(-4, ((int) (((VecInt) (o_clauseParityAndCard__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_clauseParityAndCard__9)).isEmpty());
        IConstr o_clauseParityAndCard__13 = solver.addClause(clause);
        int[] array_464410184 = new int[]{9,11};
        	int[] array_713494159 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_clauseParityAndCard__13).getLits();
        	for(int ii = 0; ii <array_464410184.length; ii++) {
        		org.junit.Assert.assertEquals(array_464410184[ii], array_713494159[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_clauseParityAndCard__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_clauseParityAndCard__13)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] -5[?]", ((OriginalBinaryClause) (o_clauseParityAndCard__13)).toString());
        Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_clauseParityAndCard__13)).hashCode())));
        clause.clear();
        IVecInt o_clauseParityAndCard__15 = clause.push((-1)).push((-5));
        Assert.assertEquals("-1,-5", ((VecInt) (o_clauseParityAndCard__15)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_clauseParityAndCard__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_clauseParityAndCard__15)).isEmpty());
        IConstr o_clauseParityAndCard__19 = solver.addClause(clause);
        int[] array_468401401 = new int[]{3,11};
        	int[] array_1915075620 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_clauseParityAndCard__19).getLits();
        	for(int ii = 0; ii <array_468401401.length; ii++) {
        		org.junit.Assert.assertEquals(array_468401401[ii], array_1915075620[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_clauseParityAndCard__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_clauseParityAndCard__19)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] -5[?]", ((OriginalBinaryClause) (o_clauseParityAndCard__19)).toString());
        Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_clauseParityAndCard__19)).hashCode())));
        IVecInt lits = new VecInt(new int[]{ 1, 2, 3, 4, 5 });
        solver.addParity(lits, false);
        IConstr o_clauseParityAndCard__23 = solver.addAtMost(lits, 2);
        Assert.assertFalse(((AtLeast) (o_clauseParityAndCard__23)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((AtLeast) (o_clauseParityAndCard__23)).getActivity())), 0.1);
        Assert.assertEquals("Card (5) :  + -1[?@-1]   + -2[?@-1]   + -3[?@-1]   + -4[?@-1]   + -5[?@-1]  >= 3", ((AtLeast) (o_clauseParityAndCard__23)).toString());
        solver.isSatisfiable();
        System.out.println(new VecInt(this.solver.model()));
        Assert.assertEquals(5, ((int) (o_clauseParityAndCard__1)));
        int[] array_1857178018 = new int[]{3,5,7};
        	int[] array_686853686 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_clauseParityAndCard__7).getLits();
        	for(int ii = 0; ii <array_1857178018.length; ii++) {
        		org.junit.Assert.assertEquals(array_1857178018[ii], array_686853686[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_clauseParityAndCard__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_clauseParityAndCard__7)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] -2[?] -3[?] ", ((OriginalWLClause) (o_clauseParityAndCard__7)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_clauseParityAndCard__7)).hashCode())));
        Assert.assertEquals("-1,-5", ((VecInt) (o_clauseParityAndCard__9)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_clauseParityAndCard__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_clauseParityAndCard__9)).isEmpty());
        int[] array_1526777105 = new int[]{9,11};
        	int[] array_1852731602 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_clauseParityAndCard__13).getLits();
        	for(int ii = 0; ii <array_1526777105.length; ii++) {
        		org.junit.Assert.assertEquals(array_1526777105[ii], array_1852731602[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_clauseParityAndCard__13)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_clauseParityAndCard__13)).getActivity())), 0.1);
        Assert.assertEquals("-4[?] -5[?]", ((OriginalBinaryClause) (o_clauseParityAndCard__13)).toString());
        Assert.assertEquals(10, ((int) (((OriginalBinaryClause) (o_clauseParityAndCard__13)).hashCode())));
        Assert.assertEquals("-1,-5", ((VecInt) (o_clauseParityAndCard__15)).toString());
        Assert.assertEquals(-3, ((int) (((VecInt) (o_clauseParityAndCard__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_clauseParityAndCard__15)).isEmpty());
        int[] array_1707940459 = new int[]{3,11};
        	int[] array_1316973585 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_clauseParityAndCard__19).getLits();
        	for(int ii = 0; ii <array_1707940459.length; ii++) {
        		org.junit.Assert.assertEquals(array_1707940459[ii], array_1316973585[ii]);
        	};
        Assert.assertFalse(((OriginalBinaryClause) (o_clauseParityAndCard__19)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_clauseParityAndCard__19)).getActivity())), 0.1);
        Assert.assertEquals("-1[?] -5[?]", ((OriginalBinaryClause) (o_clauseParityAndCard__19)).toString());
        Assert.assertEquals(7, ((int) (((OriginalBinaryClause) (o_clauseParityAndCard__19)).hashCode())));
        Assert.assertFalse(((AtLeast) (o_clauseParityAndCard__23)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((AtLeast) (o_clauseParityAndCard__23)).getActivity())), 0.1);
        Assert.assertEquals("Card (5) :  + -1[?@-1]   + -2[?@-1]   + -3[?@-1]   + -4[?@-1]   + -5[?@-1]  >= 3", ((AtLeast) (o_clauseParityAndCard__23)).toString());
    }

    @Test(timeout = 10000)
    public void checkNumberOfSolutionWithCards() throws Exception, ContradictionException, TimeoutException {
        int o_checkNumberOfSolutionWithCards__1 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_checkNumberOfSolutionWithCards__1)));
        IVecInt lits = new VecInt(new int[]{ 1, 2, 3 });
        solver.addParity(lits, true);
        IConstr o_checkNumberOfSolutionWithCards__5 = solver.addAtLeast(lits, 1);
        int[] array_381992009 = new int[]{2,4,6};
        	int[] array_1276769733 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithCards__5).getLits();
        	for(int ii = 0; ii <array_381992009.length; ii++) {
        		org.junit.Assert.assertEquals(array_381992009[ii], array_1276769733[ii]);
        	};
        Assert.assertFalse(((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).getActivity())), 0.1);
        Assert.assertEquals("1[?] 2[?] 3[?] ", ((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).hashCode())));
        ModelIterator iterator = new ModelIterator(solver);
        while (iterator.isSatisfiable()) {
            iterator.model();
        } 
        long o_checkNumberOfSolutionWithCards__13 = iterator.numberOfModelsFoundSoFar();
        Assert.assertEquals(3L, ((long) (o_checkNumberOfSolutionWithCards__13)));
        System.out.println(new VecInt(this.solver.model()));
        Assert.assertEquals(3, ((int) (o_checkNumberOfSolutionWithCards__1)));
        int[] array_269206278 = new int[]{6,4,2};
        	int[] array_845287145 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_checkNumberOfSolutionWithCards__5).getLits();
        	for(int ii = 0; ii <array_269206278.length; ii++) {
        		org.junit.Assert.assertEquals(array_269206278[ii], array_845287145[ii]);
        	};
        Assert.assertTrue(((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).getActivity())), 0.1);
        Assert.assertEquals("3[T] 2[?] 1[?] ", ((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_checkNumberOfSolutionWithCards__5)).hashCode())));
        Assert.assertEquals(3L, ((long) (o_checkNumberOfSolutionWithCards__13)));
    }
}

