Date: 11.11.2018

Testing of a fix to the exception which stopped some of the earlier test runs:
"IllegalArgumentException: character to be escaped is missing".

Fix made by Benjamin Danglot 06.11.2018 - danglotb/dspot:escape-dot-only-if-they-exist
SHA-1: 14dd46a438b846f0a555a766d4335f69450e5eef

First test: Running with defaults (not specifying test, selector or amplifiers, same as TelluLib-2018-11-01)
java -jar dspot.jar --path-to-properties dspot.properties
Stops with same exception: "java.lang.IllegalArgumentException: character to be escaped is missing"

Second test: TakeAllSelector (same as one of the runs in TelluLib-2018-11-03)
java -jar dspot.jar --path-to-properties dspot.properties --test-criterion TakeAllSelector
Stops with same exception

Third test: Repeat TelluLib-ModelTest-Descartes-Amplifiers with MethodGeneratorAmplifier
java -jar dspot.jar --path-to-properties dspot.properties --test no.tellu.lib.data.model.ModelTest --timeOut 1000 --amplifiers MethodGeneratorAmplifier
Stops after 14 minutes with same exception

Result: The isse was not fixed.