Testing limited to one test class of TelluLib: no.tellu.lib.data.model.ModelTest
This tests no.tellu.lib.data.model.DataModel, where 5 issues (pseudo-tested methods) were found in the Descartes experiment. 3 of these were relevant issues which we fixed manually by extending the test cases. In the DSpot experiments we use the same source revision as was the starting point in the Descartes experiment, and we want to see if DSpot can automatically fix some of the issues we fixed manually.
Same DSpot version as used 01.11.2018.
Using default selector PitMutantScoreSelector (Descartes).
Trying different amplifiers.
Using --timeOut 1000 as none of these tests should take much time and early attempts took very long.

java -jar dspot.jar --path-to-properties dspot.properties --test no.tellu.lib.data.model.ModelTest --timeOut 1000

Default amplifiers: Reports elapsed time 15 seconds, no new tests, output is only ..json file.
--amplifiers MethodAdd: Reports elapsed time 262 seconds, no new tests.
--amplifiers MethodRemove: Stopped after 5 minutes with "IllegalArgumentException: character to be escaped is missing". Afterwards it turned out a test resource file had become corrupt (contents missing), so tests would no longer run.
--amplifiers AllLiteralAmplifiers: Stopped with OutOfMemoryError after 53 minutes.
--amplifiers MethodGeneratorAmplifier: Stopped after 15 minutes with "IllegalArgumentException: character to be escaped is missing".
--amplifiers ReturnValueAmplifier: Reports elapsed time 82 seconds, no new tests.
--amplifiers NullifierAmplifier: Stopped after 17 minutes with "IllegalArgumentException: character to be escaped is missing".