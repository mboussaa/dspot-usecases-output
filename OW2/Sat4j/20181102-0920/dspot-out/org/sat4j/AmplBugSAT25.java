package org.sat4j;


import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.specs.ContradictionException;


public class AmplBugSAT25 {
    @Test(timeout = 30000)
    public void testReaderFromInstanceReader_remove1() throws IOException, Exception, ParseFormatException, ContradictionException {
        String cnfString = "p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0";
        Assert.assertEquals("p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0", cnfString);
        InstanceReader reader = new InstanceReader(SolverFactory.newDefault());
        Assert.assertFalse(((InstanceReader) (reader)).isVerbose());
        Assert.assertFalse(((InstanceReader) (reader)).isUsingMapping());
        Assert.assertEquals("p cnf 3 4\n1 2 3 0\n-1 -2 0\n-1 -3 0\n-2 -3 0", cnfString);
    }
}

