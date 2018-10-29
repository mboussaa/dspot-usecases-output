package org.sat4j.minisat.core;


import org.junit.Assert;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.OptToSatAdapter;


public class Bug275101 {
    @Test(timeout = 10000)
    public void testMaxSAtIteratorIfSat() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = new ModelIterator(new OptToSatAdapter(new MaxSatDecorator(SolverFactory.newDefault())));
        int o_testMaxSAtIteratorIfSat__6 = solver.newVar(3);
        Assert.assertEquals(3, ((int) (o_testMaxSAtIteratorIfSat__6)));
        IVecInt literals = new VecInt();
        IVecInt o_testMaxSAtIteratorIfSat__9 = literals.push((-1)).push((-2)).push(3);
        Assert.assertEquals("-1,-2,3", ((VecInt) (o_testMaxSAtIteratorIfSat__9)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testMaxSAtIteratorIfSat__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIteratorIfSat__9)).isEmpty());
        IConstr o_testMaxSAtIteratorIfSat__14 = solver.addClause(literals);
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).isSatisfied());
        int[] array_2087484823 = new int[]{3,5,6,8};
        	int[] array_679543374 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIteratorIfSat__14).getLits();
        	for(int ii = 0; ii <array_2087484823.length; ii++) {
        		org.junit.Assert.assertEquals(array_2087484823[ii], array_679543374[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] 3[?] 4[?] ", ((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).hashCode())));
        literals.clear();
        IVecInt o_testMaxSAtIteratorIfSat__16 = literals.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testMaxSAtIteratorIfSat__16)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testMaxSAtIteratorIfSat__16)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIteratorIfSat__16)).isEmpty());
        IConstr o_testMaxSAtIteratorIfSat__19 = solver.addClause(literals);
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).isSatisfied());
        int[] array_109620927 = new int[]{3,4,10};
        	int[] array_403897321 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIteratorIfSat__19).getLits();
        	for(int ii = 0; ii <array_109620927.length; ii++) {
        		org.junit.Assert.assertEquals(array_109620927[ii], array_403897321[ii]);
        	};
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).hashCode())));
        literals.clear();
        IVecInt o_testMaxSAtIteratorIfSat__21 = literals.push((-1)).push((-3));
        Assert.assertEquals("-1,-3", ((VecInt) (o_testMaxSAtIteratorIfSat__21)).toString());
        Assert.assertEquals(-2, ((int) (((VecInt) (o_testMaxSAtIteratorIfSat__21)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIteratorIfSat__21)).isEmpty());
        IConstr o_testMaxSAtIteratorIfSat__25 = solver.addClause(literals);
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).isSatisfied());
        int[] array_1740806952 = new int[]{3,7,12};
        	int[] array_673318014 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIteratorIfSat__25).getLits();
        	for(int ii = 0; ii <array_1740806952.length; ii++) {
        		org.junit.Assert.assertEquals(array_1740806952[ii], array_673318014[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?] 6[?] ", ((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).hashCode())));
        literals.clear();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println(((("" + (solver.model(1))) + (solver.model(2))) + (solver.model(3))));
        solver.isSatisfiable();
        Assert.assertEquals(3, ((int) (o_testMaxSAtIteratorIfSat__6)));
        Assert.assertEquals("", ((VecInt) (o_testMaxSAtIteratorIfSat__9)).toString());
        Assert.assertTrue(((VecInt) (o_testMaxSAtIteratorIfSat__9)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).isSatisfied());
        int[] array_144344505 = new int[]{3,5,6,8};
        	int[] array_1690747032 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIteratorIfSat__14).getLits();
        	for(int ii = 0; ii <array_144344505.length; ii++) {
        		org.junit.Assert.assertEquals(array_144344505[ii], array_1690747032[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] 3[?] 4[?] ", ((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__14)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testMaxSAtIteratorIfSat__16)).toString());
        Assert.assertTrue(((VecInt) (o_testMaxSAtIteratorIfSat__16)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).isSatisfied());
        int[] array_1602401835 = new int[]{3,4,10};
        	int[] array_692964736 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIteratorIfSat__19).getLits();
        	for(int ii = 0; ii <array_1602401835.length; ii++) {
        		org.junit.Assert.assertEquals(array_1602401835[ii], array_692964736[ii]);
        	};
        Assert.assertEquals("-1[?] 2[?] 5[?] ", ((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__19)).hashCode())));
        Assert.assertEquals("", ((VecInt) (o_testMaxSAtIteratorIfSat__21)).toString());
        Assert.assertTrue(((VecInt) (o_testMaxSAtIteratorIfSat__21)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).isSatisfied());
        int[] array_1681360969 = new int[]{3,7,12};
        	int[] array_47294426 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIteratorIfSat__25).getLits();
        	for(int ii = 0; ii <array_1681360969.length; ii++) {
        		org.junit.Assert.assertEquals(array_1681360969[ii], array_47294426[ii]);
        	};
        Assert.assertEquals("-1[?] -3[?] 6[?] ", ((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).toString());
        Assert.assertEquals(7, ((int) (((OriginalWLClause) (o_testMaxSAtIteratorIfSat__25)).hashCode())));
    }

    @Test(timeout = 10000)
    public void testMaxSAtIterator() throws Exception, ContradictionException, TimeoutException {
        ISolver solver = new ModelIterator(new OptToSatAdapter(new MaxSatDecorator(SolverFactory.newDefault())));
        int o_testMaxSAtIterator__6 = solver.newVar(2);
        Assert.assertEquals(2, ((int) (o_testMaxSAtIterator__6)));
        IVecInt literals = new VecInt();
        IVecInt o_testMaxSAtIterator__9 = literals.push((-1)).push((-2));
        Assert.assertEquals("-1,-2", ((VecInt) (o_testMaxSAtIterator__9)).toString());
        Assert.assertEquals(-1, ((int) (((VecInt) (o_testMaxSAtIterator__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__9)).isEmpty());
        IConstr o_testMaxSAtIterator__13 = solver.addClause(literals);
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__13)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__13)).isSatisfied());
        int[] array_268709476 = new int[]{3,5,6};
        	int[] array_1565255191 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__13).getLits();
        	for(int ii = 0; ii <array_268709476.length; ii++) {
        		org.junit.Assert.assertEquals(array_268709476[ii], array_1565255191[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] 3[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__13)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__13)).hashCode())));
        literals.clear();
        IVecInt o_testMaxSAtIterator__15 = literals.push((-1)).push(2);
        Assert.assertEquals("-1,2", ((VecInt) (o_testMaxSAtIterator__15)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testMaxSAtIterator__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__15)).isEmpty());
        IConstr o_testMaxSAtIterator__18 = solver.addClause(literals);
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__18)).isSatisfied());
        int[] array_1257412961 = new int[]{3,4,8};
        	int[] array_2122754561 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__18).getLits();
        	for(int ii = 0; ii <array_1257412961.length; ii++) {
        		org.junit.Assert.assertEquals(array_1257412961[ii], array_2122754561[ii]);
        	};
        Assert.assertEquals("-1[?] 2[?] 4[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__18)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__18)).hashCode())));
        literals.clear();
        IVecInt o_testMaxSAtIterator__20 = literals.push(1).push((-2));
        Assert.assertEquals("1,-2", ((VecInt) (o_testMaxSAtIterator__20)).toString());
        Assert.assertEquals(0, ((int) (((VecInt) (o_testMaxSAtIterator__20)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__20)).isEmpty());
        IConstr o_testMaxSAtIterator__23 = solver.addClause(literals);
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__23)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__23)).isSatisfied());
        int[] array_534937887 = new int[]{2,5,10};
        	int[] array_1634877861 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__23).getLits();
        	for(int ii = 0; ii <array_534937887.length; ii++) {
        		org.junit.Assert.assertEquals(array_534937887[ii], array_1634877861[ii]);
        	};
        Assert.assertEquals("1[?] -2[?] 5[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__23)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__23)).hashCode())));
        literals.clear();
        IVecInt o_testMaxSAtIterator__25 = literals.push(1).push(2);
        Assert.assertEquals("1,2", ((VecInt) (o_testMaxSAtIterator__25)).toString());
        Assert.assertEquals(1, ((int) (((VecInt) (o_testMaxSAtIterator__25)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__25)).isEmpty());
        IConstr o_testMaxSAtIterator__27 = solver.addClause(literals);
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__27)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__27)).isSatisfied());
        int[] array_1281550771 = new int[]{2,4,12};
        	int[] array_1073891162 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__27).getLits();
        	for(int ii = 0; ii <array_1281550771.length; ii++) {
        		org.junit.Assert.assertEquals(array_1281550771[ii], array_1073891162[ii]);
        	};
        Assert.assertEquals("1[?] 2[?] 6[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__27)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__27)).hashCode())));
        solver.isSatisfiable();
        System.out.println((("" + (solver.model(1))) + (solver.model(2))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println((("" + (solver.model(1))) + (solver.model(2))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println((("" + (solver.model(1))) + (solver.model(2))));
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        solver.isSatisfiable();
        System.out.println((("" + (solver.model(1))) + (solver.model(2))));
        solver.isSatisfiable();
        Assert.assertEquals(2, ((int) (o_testMaxSAtIterator__6)));
        Assert.assertEquals("1,2,6", ((VecInt) (o_testMaxSAtIterator__9)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testMaxSAtIterator__9)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__9)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__13)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__13)).isSatisfied());
        int[] array_1858404507 = new int[]{5,3,6};
        	int[] array_748175285 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__13).getLits();
        	for(int ii = 0; ii <array_1858404507.length; ii++) {
        		org.junit.Assert.assertEquals(array_1858404507[ii], array_748175285[ii]);
        	};
        Assert.assertEquals("-2[?] -1[?] 3[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__13)).toString());
        Assert.assertEquals(4, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__13)).hashCode())));
        Assert.assertEquals("1,2,6", ((VecInt) (o_testMaxSAtIterator__15)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testMaxSAtIterator__15)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__15)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__18)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__18)).isSatisfied());
        int[] array_1532662278 = new int[]{4,3,8};
        	int[] array_1538493509 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__18).getLits();
        	for(int ii = 0; ii <array_1532662278.length; ii++) {
        		org.junit.Assert.assertEquals(array_1532662278[ii], array_1538493509[ii]);
        	};
        Assert.assertEquals("2[?] -1[?] 4[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__18)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__18)).hashCode())));
        Assert.assertEquals("1,2,6", ((VecInt) (o_testMaxSAtIterator__20)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testMaxSAtIterator__20)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__20)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__23)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__23)).isSatisfied());
        int[] array_864755754 = new int[]{5,2,10};
        	int[] array_1722450718 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__23).getLits();
        	for(int ii = 0; ii <array_864755754.length; ii++) {
        		org.junit.Assert.assertEquals(array_864755754[ii], array_1722450718[ii]);
        	};
        Assert.assertEquals("-2[?] 1[?] 5[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__23)).toString());
        Assert.assertEquals(5, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__23)).hashCode())));
        Assert.assertEquals("1,2,6", ((VecInt) (o_testMaxSAtIterator__25)).toString());
        Assert.assertEquals(3, ((int) (((VecInt) (o_testMaxSAtIterator__25)).hashCode())));
        Assert.assertFalse(((VecInt) (o_testMaxSAtIterator__25)).isEmpty());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testMaxSAtIterator__27)).getActivity())), 0.1);
        Assert.assertFalse(((OriginalWLClause) (o_testMaxSAtIterator__27)).isSatisfied());
        int[] array_1509749032 = new int[]{4,2,12};
        	int[] array_917400259 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testMaxSAtIterator__27).getLits();
        	for(int ii = 0; ii <array_1509749032.length; ii++) {
        		org.junit.Assert.assertEquals(array_1509749032[ii], array_917400259[ii]);
        	};
        Assert.assertEquals("2[?] 1[?] 6[?] ", ((OriginalWLClause) (o_testMaxSAtIterator__27)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testMaxSAtIterator__27)).hashCode())));
    }
}

