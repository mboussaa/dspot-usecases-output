package org.sat4j.minisat.constraints;


import java.io.PrintWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.minisat.constraints.card.AtLeast;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.TimeoutException;


public class TestXor {
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
}

