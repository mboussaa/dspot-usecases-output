## Dspot 1.2.2 result on Catalog version 8.4.0-RC1

### Command line

```shell
java -jar target/dspot-1.2.2-jar-with-dependencies.jar --path-to-properties catalog/catalog.properties --automatic-builder GradleBuilder -t  org.ow2.proactive.catalog.*
```

### Configuration

```
project=catalog
src=src/main/java/
testSrc=src/test/java/
javaVersion=8
outputDirectory=result/
classes=build/classes/main/
testClasses=build/classes/test/
```

### NullPointerException

DSpot encountered 1 error(s) during amplification reported in result/errors_report.txt

### End the execution result

```
[INFO] 2019-01-23 17:01:57 Amplification - Assertion amplification: 2 test method(s) has been successfully amplified.
[INFO] 2019-01-23 17:01:57 GradleAutomaticBuilder - Injecting  Gradle task to run Pit...
[INFO] 2019-01-23 17:01:57 GradleAutomaticBuilder - Making backup copy of original Gradle file...
[INFO] 2019-01-23 17:01:57 GradleAutomaticBuilder - Original Gradle build file backed-up as /Users/mohamedboussaa/Documents/STAMP/dspot/dspot/catalog/build.gradle.orig.
[INFO] 2019-01-23 17:01:57 GradleAutomaticBuilder - Running Pit...
[INFO] 2019-01-23 17:01:57 GradleAutomaticBuilder - Run gradle tasks: pitest
[INFO] 2019-01-23 17:02:04 GradleAutomaticBuilder - Restoring original Gradle build file...
[INFO] 2019-01-23 17:02:04 GradleAutomaticBuilder - Deleting modified (with injected task) Gradle build file...
[INFO] 2019-01-23 17:02:04 GradleAutomaticBuilder - Renaming original Gradle build file from /Users/mohamedboussaa/Documents/STAMP/dspot/dspot/catalog//build.gradle.orig to /Users/mohamedboussaa/Documents/STAMP/dspot/dspot/catalog//build.gradle...
[INFO] 2019-01-23 17:02:04 PitMutantScoreSelector - 559 mutants has been generated (559)
[INFO] 2019-01-23 17:02:04 Amplification - 0 amplified test methods has been selected to be kept. (global: 0)
[INFO] 2019-01-23 17:02:04 DSpot - elapsedTime 9812
[WARN] 2019-01-23 17:02:04 DSpot - DSpot could not obtain any amplified test method.
[WARN] 2019-01-23 17:02:04 DSpot - You can customize the following options: --amplifiers, --test-criterion, --iteration, --budgetizer etc, and retry with a new configuration.

======= REPORT =======
PitMutantScoreSelector: 
The original test suite kills 195 mutants
The amplification results with 0 new tests
it kills 0 more mutants

[INFO] 2019-01-23 17:02:04 Main - Amplification succeed.
[INFO] 2019-01-23 17:02:04 Main - Elapsed time 332529 ms
[WARN] 2019-01-23 17:02:04 GlobalReport - DSpot encountered some errors during amplification.
[WARN] 2019-01-23 17:02:04 GlobalReport - DSpot encountered 1 error(s) during amplification.
Something bad happened during assertion amplification
java.lang.NullPointerException
	at eu.stamp_project.dspot.assertgenerator.AssertionRemover.removeAssertion(AssertionRemover.java:85)
	at eu.stamp_project.dspot.assertgenerator.AssertionRemover.lambda$removeAssertion$0(AssertionRemover.java:47)
	at java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:267)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1374)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
	at eu.stamp_project.dspot.assertgenerator.AssertionRemover.removeAssertion(AssertionRemover.java:48)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1374)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
	at eu.stamp_project.dspot.assertgenerator.AssertGenerator.assertionAmplification(AssertGenerator.java:63)
	at eu.stamp_project.dspot.Amplification.assertionsAmplification(Amplification.java:184)
	at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:93)
	at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:275)
	at eu.stamp_project.dspot.DSpot.lambda$amplifyTestClassesTestMethods$5(DSpot.java:255)
	at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
	at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1374)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)
	at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
	at eu.stamp_project.dspot.DSpot.amplifyTestClassesTestMethods(DSpot.java:256)
	at eu.stamp_project.Main.run(Main.java:61)
	at eu.stamp_project.Main.main(Main.java:41)
```

### Other:

An issue is encountred when building jar from sources: https://github.com/STAMP-project/dspot/issues/673
