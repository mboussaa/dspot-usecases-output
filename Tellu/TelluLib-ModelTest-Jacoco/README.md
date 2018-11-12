Date: 11.11.2018

Testing the JacocoCoverageSelector with a new version of DSpot.
Used to stop quickly with exception - no coverage file produced.
DSpot 1.2.2-SNAPSHOT, escape-dot-only-if-they-exist version from 06.11.2018

Testing on a single test class of TelluLib.
java -jar dspot.jar --path-to-properties dspot.properties --test no.tellu.lib.data.model.ModelTest --test-criterion JacocoCoverageSelector

Results (see logs for full output):
* Not specifying amplifiers: Stopped with a NullPointerException - needs amplifier? Not same exception as before.
* Amplifier MethodAdd: Stopped with same NullPointerException.
* Amplifier StringLiteralAmplifier: Stopped with same NullPointerException.
