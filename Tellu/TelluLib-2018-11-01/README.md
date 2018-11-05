First test after getting DSpot to build and run.
Running with all defaults on TelluLib project.
DSpot built from master this date (01.11.2018).
java -jar dspot.jar --path-to-properties dspot.properties

The only project-specific configuration done, was to set filter=no.tellu.*
Running with this, it ends with an exception each time (see Run-filter.txt).
Running without this filter, DSpot runs to completion, but always reports "The original test suite kills 0 mutants".