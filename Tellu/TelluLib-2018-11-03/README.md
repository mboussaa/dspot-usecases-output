Testing different selectors (test-criterion) on TelluLib, filter=no.tellu.*
Same DSpot as used 01.11.2018.
java -jar dspot.jar --path-to-properties dspot.properties --test-criterion <selector>

Selector results (see logs for full output):
* PitMutantScoreSelector: Same result as default run on 01.11.2018 - "IllegalArgumentException: character to be escaped is missing".
* CloverCoverageSelector: Not available in this version of DSpot.
* JacocoCoverageSelector: Ends soon with exception - seems no coverage file is produced.
* TakeAllSelector: Same exception as with PitMutantScoreSelector.
