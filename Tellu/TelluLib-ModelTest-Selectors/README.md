Testing different selectors (test-criterion) on a single test class of TelluLib.
Note that we already tried the selectors on the complete test suite (TelluLib-2018-11-03), now we test if it helps to limit amplification.
Same DSpot as used 01.11.2018.
java -jar dspot.jar --path-to-properties dspot.properties --test no.tellu.lib.data.model.ModelTest --test-criterion <selector>

Selector results (see logs for full output):
* PitMutantScoreSelector: No longer ends with exception, completes in 124 seconds with no new tests.
* CloverCoverageSelector: Not available in this version of DSpot.
* JacocoCoverageSelector: Same exception as before - missing coverage file.
* TakeAllSelector: Completes in 123 seconds, no amplified tests.
