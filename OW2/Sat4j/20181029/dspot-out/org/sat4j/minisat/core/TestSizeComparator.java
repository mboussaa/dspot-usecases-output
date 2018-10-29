package org.sat4j.minisat.core;


import java.util.Comparator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.constraints.cnf.OriginalBinaryClause;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVec;
import org.sat4j.specs.IVecInt;


public class TestSizeComparator {
    private static final Comparator<Constr> comparator = new SizeComparator();

    private IVec<Constr> constrs;

    private Constr c1;

    private Constr c2;

    private Constr c3;

    private Constr c4;

    private ILits voc;

    @Before
    public void setUp() {
        constrs = new Vec<Constr>();
        voc = new Lits();
        IVecInt clause = new VecInt();
        clause.push(2).push(4);
        c1 = new OriginalBinaryClause(clause, voc);
        clause.clear();
        clause.push(2).push(6).push(8).push(10);
        c2 = new OriginalWLClause(clause, voc);
        clause.clear();
        clause.push(3).push(5).push(7).push(11).push(17);
        c3 = new OriginalWLClause(clause, voc);
        clause.clear();
        clause.push(2).push(6).push(8).push(10).push(18).push(24).push(30);
        c4 = new OriginalWLClause(clause, voc);
        clause.clear();
    }

    @Test(timeout = 10000)
    public void testSizeComparatorWithTie() throws Exception {
        IVec<Constr> o_testSizeComparatorWithTie__1 = constrs.push(c4).push(c3).push(c2).push(c1);
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] ,1[?] 2[?]", ((Vec) (o_testSizeComparatorWithTie__1)).toString());
        Assert.assertEquals(6, ((int) (((Vec) (o_testSizeComparatorWithTie__1)).hashCode())));
        Assert.assertFalse(((Vec) (o_testSizeComparatorWithTie__1)).isEmpty());
        constrs.sort(TestSizeComparator.comparator);
        Constr o_testSizeComparatorWithTie__6 = constrs.get(0);
        Assert.assertFalse(((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).getActivity())), 0.1);
        int[] array_755613613 = new int[]{2,4};
        	int[] array_1873133004 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).getLits();
        	for(int ii = 0; ii <array_755613613.length; ii++) {
        		org.junit.Assert.assertEquals(array_755613613[ii], array_1873133004[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).hashCode())));
        Constr o_testSizeComparatorWithTie__7 = constrs.get(1);
        Assert.assertFalse(((OriginalWLClause) (o_testSizeComparatorWithTie__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSizeComparatorWithTie__7)).getActivity())), 0.1);
        int[] array_409865418 = new int[]{2,6,8,10};
        	int[] array_743356295 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).getLits();
        	for(int ii = 0; ii <array_409865418.length; ii++) {
        		org.junit.Assert.assertEquals(array_409865418[ii], array_743356295[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] ", ((OriginalWLClause) (o_testSizeComparatorWithTie__7)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSizeComparatorWithTie__7)).hashCode())));
        Constr o_testSizeComparatorWithTie__8 = constrs.get(2);
        Assert.assertFalse(((OriginalWLClause) (o_testSizeComparatorWithTie__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSizeComparatorWithTie__8)).getActivity())), 0.1);
        int[] array_77614905 = new int[]{3,5,7,11,17};
        	int[] array_1211344611 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).getLits();
        	for(int ii = 0; ii <array_77614905.length; ii++) {
        		org.junit.Assert.assertEquals(array_77614905[ii], array_1211344611[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] -3[?] -5[?] -8[?] ", ((OriginalWLClause) (o_testSizeComparatorWithTie__8)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testSizeComparatorWithTie__8)).hashCode())));
        Constr o_testSizeComparatorWithTie__9 = this.constrs.get(3);
        Assert.assertFalse(((OriginalWLClause) (o_testSizeComparatorWithTie__9)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSizeComparatorWithTie__9)).getActivity())), 0.1);
        int[] array_419846341 = new int[]{2,6,8,10,18,24,30};
        	int[] array_2077728141 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__9).getLits();
        	for(int ii = 0; ii <array_419846341.length; ii++) {
        		org.junit.Assert.assertEquals(array_419846341[ii], array_2077728141[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ", ((OriginalWLClause) (o_testSizeComparatorWithTie__9)).toString());
        Assert.assertEquals(14, ((int) (((OriginalWLClause) (o_testSizeComparatorWithTie__9)).hashCode())));
        Assert.assertEquals("1[?] 2[?],1[?] 3[?] 4[?] 5[?] ,-1[?] -2[?] -3[?] -5[?] -8[?] ,1[?] 3[?] 4[?] 5[?] 9[?] 12[?] 15[?] ", ((Vec) (o_testSizeComparatorWithTie__1)).toString());
        Assert.assertEquals(6, ((int) (((Vec) (o_testSizeComparatorWithTie__1)).hashCode())));
        Assert.assertFalse(((Vec) (o_testSizeComparatorWithTie__1)).isEmpty());
        Assert.assertFalse(((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).getActivity())), 0.1);
        int[] array_99173693 = new int[]{2,4};
        	int[] array_119824515 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalBinaryClause)o_testSizeComparatorWithTie__6).getLits();
        	for(int ii = 0; ii <array_99173693.length; ii++) {
        		org.junit.Assert.assertEquals(array_99173693[ii], array_119824515[ii]);
        	};
        Assert.assertEquals("1[?] 2[?]", ((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).toString());
        Assert.assertEquals(3, ((int) (((OriginalBinaryClause) (o_testSizeComparatorWithTie__6)).hashCode())));
        Assert.assertFalse(((OriginalWLClause) (o_testSizeComparatorWithTie__7)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSizeComparatorWithTie__7)).getActivity())), 0.1);
        int[] array_1523459939 = new int[]{2,6,8,10};
        	int[] array_1539297395 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__7).getLits();
        	for(int ii = 0; ii <array_1523459939.length; ii++) {
        		org.junit.Assert.assertEquals(array_1523459939[ii], array_1539297395[ii]);
        	};
        Assert.assertEquals("1[?] 3[?] 4[?] 5[?] ", ((OriginalWLClause) (o_testSizeComparatorWithTie__7)).toString());
        Assert.assertEquals(6, ((int) (((OriginalWLClause) (o_testSizeComparatorWithTie__7)).hashCode())));
        Assert.assertFalse(((OriginalWLClause) (o_testSizeComparatorWithTie__8)).isSatisfied());
        Assert.assertEquals(0.0, ((double) (((OriginalWLClause) (o_testSizeComparatorWithTie__8)).getActivity())), 0.1);
        int[] array_455044136 = new int[]{3,5,7,11,17};
        	int[] array_193893194 = (int[])((org.sat4j.minisat.constraints.cnf.OriginalWLClause)o_testSizeComparatorWithTie__8).getLits();
        	for(int ii = 0; ii <array_455044136.length; ii++) {
        		org.junit.Assert.assertEquals(array_455044136[ii], array_193893194[ii]);
        	};
        Assert.assertEquals("-1[?] -2[?] -3[?] -5[?] -8[?] ", ((OriginalWLClause) (o_testSizeComparatorWithTie__8)).toString());
        Assert.assertEquals(8, ((int) (((OriginalWLClause) (o_testSizeComparatorWithTie__8)).hashCode())));
    }
}

