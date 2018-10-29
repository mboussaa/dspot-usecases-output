package org.sat4j;


import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Before;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.xplain.Xplain;


public class AmplBugSAT26 {
    private Xplain<ISolver> xplain;

    @Before
    public void setUp() throws FileNotFoundException, IOException, ParseFormatException, ContradictionException {
        this.xplain = new Xplain<ISolver>(SolverFactory.newDefault());
        this.xplain.setTimeout(3600);
        Reader reader = new DimacsReader(this.xplain);
        String dimacs = "src/test/testfiles/eb42.dimacs";
        reader.parseInstance(dimacs);
    }
}

