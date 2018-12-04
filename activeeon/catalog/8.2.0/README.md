## Dspot result on Catalog version 8.2.0

### Result

- 93% sucessful test classes analysis.  
- 2 classes failed to be analyzed: CatalogObjectServiceTest and RestAPIAcessServiceTest.
- If we exclude CatalogObjectServiceTest from the test suite, it takes 16.3 secondes to analyse it.
- After analysing each class, thre are 311 mutants killed and no test generated. 


### Command line

```shell
java -jar dspot-1.2.1-jar-with-dependencies.jar --path-to-properties dspot.properties --automatic-builder GradleBuilder -t  org.ow2.proactive.catalog.* -m pitest.csv
```

### Configuration

```
project=.                                                                                             
# Relative path to the source project from this properties file                                       
src=src/main/java/                                                                                    
# Relative path to the test source project from this properties file                                  
testSrc=src/test/java/                                                                                
# Java version used                                                                                   
javaVersion=8                                                                                         
# (Optional) Path to the output folder, default to "output_diversify"                                 
outputDirectory=result/
# (Optional) Filter on the package name containing tests to be amplified ("example" => "example.*")   
#filter=org.ow2.proactive.catalog.*                                                               
classes=build/classes/main/                                                                           
testClasses=build/classes/test/
```

### RestApiAccessServiceTest exception

The RestApiAccessServiceTest error is reported by Dspot in the file [errors_report.txt](errors_report.txt)

### End the execution result

```
2018-12-04 18:05:49,824 WARN eu.stamp_project.utils.compilation.TestCompiler - Trying three time to compile with no success. Give up.
2018-12-04 18:05:49,825 INFO eu.stamp_project.dspot.Amplification - 0 amplified test methods has been selected to be kept. (global: 0)
2018-12-04 18:05:49,825 INFO eu.stamp_project.dspot.DSpot - elapsedTime 435
2018-12-04 18:05:49,827 WARN eu.stamp_project.dspot.DSpot - DSpot could not obtain any amplified test method.
2018-12-04 18:05:49,827 WARN eu.stamp_project.dspot.DSpot - You can customize the following options: --amplifiers, --test-criterion, --iteration, --budgetizer etc, and retry with a new configuration.

======= REPORT =======
PitMutantScoreSelector:
The original test suite kills 311 mutants
The amplification results with 0 new tests
it kills 0 more mutants

2018-12-04 18:05:49,828 INFO eu.stamp_project.Main - Amplification succeed.
2018-12-04 18:05:49,828 INFO eu.stamp_project.Main - Elapsed time 15393 ms
2018-12-04 18:05:49,828 INFO eu.stamp_project.dspot.Amplification - DSpot amplified your test suite without errors. (no errors report will be outputted)
```