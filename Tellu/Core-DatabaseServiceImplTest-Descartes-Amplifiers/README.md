11.11.2018

First test on Core project, similar to amplifier tests on TelluLib. Limited to one test class: no.tellu.findit.services.DatabaseServiceImplTest. This uncovered a number of issues in the Descartes experiment, some of which were fixed there. In the DSpot experiments we use the same source revision as was the starting point in the Descartes experiment, and we want to see if DSpot can automatically fix some of the issues we fixed manually.

Using default selector PitMutantScoreSelector (Descartes).
Trying different amplifiers.
Using --timeOut 2000 to restrict time usage.

java -jar dspot.jar --path-to-properties dspot.properties --test no.tellu.findit.services.DatabaseServiceImplTest --timeOut 2000

Results:
* Default amplifiers: Ran for 20 minutes, no new tests
* MethodAdd amplifier: Ran for 20 minutes, seems to complete ok, but no new tests
* MethodRemove amplifier: Ran for 20 minutes, seems to complete ok, but no new tests
* MethodGeneratorAmplifier: Stopped after 21 minutes. StackOverflowError with the longest stack trace I've ever seen.
