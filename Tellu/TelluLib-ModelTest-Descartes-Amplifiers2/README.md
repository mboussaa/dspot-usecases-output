Date: 11.11.2018

Testing of different amplifiers. Using default selector PitMutantScoreSelector (Descartes).

Testing limited to one test class of TelluLib: no.tellu.lib.data.model.ModelTest
This tests no.tellu.lib.data.model.DataModel, where 5 issues (pseudo-tested methods) were found in the Descartes experiment. 3 of these were relevant issues which we fixed manually by extending the test cases. In the DSpot experiments we use the same source revision as was the starting point in the Descartes experiment, and we want to see if DSpot can automatically fix some of the issues we fixed manually.

Differences from TelluLib-ModelTest-Descartes-Amplifiers:
* DSpot version: escape-dot-only-if-they-exist version from 06.11.2018, as used in TelluLib-EscapeFix. This is a 1.2.2-SNAPSHOT.
* Will test combinations of amplifiers.

java -jar dspot.jar --path-to-properties dspot.properties --test no.tellu.lib.data.model.ModelTest --timeOut 1000 --amplifiers <amplifiers>

Could not get list of amplifiers to work on Windows.

* "--amplifiers MethodAdd:MethodRemove" as in documentation seems to be interpreted as a a single amplifier.
[WARN] 2018-11-11 14:20:12 AmplifierEnum - Wrong values for amplifiers: MethodAdd:MethodRemove is not recognized

* "--amplifiers MethodAdd;MethodRemove" was suggested by Benjamin. It ran fine for some minutes, but then ended with error:

MethodRemove : The term 'MethodRemove' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spel
ling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:138
+ ... ta.model.ModelTest --timeOut 1000 --amplifiers MethodAdd;MethodRemove
+                                                              ~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (MethodRemove:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException
