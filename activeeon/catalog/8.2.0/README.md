## Dspot result on Catalog version 8.2.0

### Result

- 93% sucessful test classes analysis.  
- 2 classes failed to be analyzed: CatalogObjectServiceTest and RestAPIAcessServiceTest.
- If we exclude CatalogObjectServiceTest from the test suite, it takes 16.3 secondes to analyse it.
- After analysing each class, thre are no killed mutant and no test generated. This is probably due to the pitest exception which occurs during the build. 


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
outputDirectory=todelete/                                                                             
# (Optional) Filter on the package name containing tests to be amplified ("example" => "example.*")   
#filter=org.ow2.proactive.catalog.dto.*                                                               
classes=build/classes/main/                                                                           
testClasses=build/classes/test/
```

### Pitest exception

The pitest exception prevent pitest to run and occures before using Dspot on each test classes.

```
2018-11-20 15:07:00,416 INFO eu.stamp_project.automaticbuilder.gradle.GradleAutomaticBuilder - Running Pit...
2018-11-20 15:07:00,417 INFO eu.stamp_project.automaticbuilder.gradle.GradleAutomaticBuilder - Run gradle tasks: pitest
java.lang.RuntimeException: org.gradle.tooling.BuildException: Could not execute build using Gradle distribution 'https://services.gradle.org/distributions/gradle-4.10.2-bin.zip'.
     at eu.stamp_project.automaticbuilder.gradle.GradleAutomaticBuilder.runTasks(GradleAutomaticBuilder.java:113)
     at eu.stamp_project.automaticbuilder.gradle.GradleAutomaticBuilder.runPit(GradleAutomaticBuilder.java:94)
     at eu.stamp_project.automaticbuilder.gradle.GradleAutomaticBuilder.runPit(GradleAutomaticBuilder.java:85)
     at eu.stamp_project.dspot.selector.PitMutantScoreSelector.init(PitMutantScoreSelector.java:59)
     at eu.stamp_project.dspot.DSpot.<init>(DSpot.java:97)
     at eu.stamp_project.Main.run(Main.java:53)
     at eu.stamp_project.Main.main(Main.java:41)
Caused by: org.gradle.tooling.BuildException: Could not execute build using Gradle distribution 'https://services.gradle.org/distributions/gradle-4.10.2-bin.zip'.
    at org.gradle.tooling.internal.consumer.ExceptionTransformer.transform(ExceptionTransformer.java:51)
    at org.gradle.tooling.internal.consumer.ExceptionTransformer.transform(ExceptionTransformer.java:29)
    at org.gradle.tooling.internal.consumer.ResultHandlerAdapter.onFailure(ResultHandlerAdapter.java:41)
    at org.gradle.tooling.internal.consumer.async.DefaultAsyncConsumerActionExecutor$1$1.run(DefaultAsyncConsumerActionExecutor.java:57)
    at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
    at org.gradle.internal.concurrent.StoppableExecutorImpl$1.run(StoppableExecutorImpl.java:46)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
    at java.lang.Thread.run(Thread.java:748)
    at org.gradle.tooling.internal.consumer.BlockingResultHandler.getResult(BlockingResultHandler.java:46)
    at org.gradle.tooling.internal.consumer.DefaultBuildLauncher.run(DefaultBuildLauncher.java:77)
    at eu.stamp_project.automaticbuilder.gradle.GradleAutomaticBuilder.runTasks(GradleAutomaticBuilder.java:111)
    ... 6 more
Caused by: org.gradle.internal.exceptions.LocationAwareException: Execution failed for task ':pitest'.
    at org.gradle.initialization.DefaultExceptionAnalyser.transform(DefaultExceptionAnalyser.java:74)
    at org.gradle.initialization.MultipleBuildFailuresExceptionAnalyser.transform(MultipleBuildFailuresExceptionAnalyser.java:49)
    at org.gradle.initialization.MultipleBuildFailuresExceptionAnalyser.transform(MultipleBuildFailuresExceptionAnalyser.java:39)
    at org.gradle.initialization.StackTraceSanitizingExceptionAnalyser.transform(StackTraceSanitizingExceptionAnalyser.java:30)
    at org.gradle.initialization.DefaultGradleLauncher.doBuildStages(DefaultGradleLauncher.java:152)
    at org.gradle.initialization.DefaultGradleLauncher.executeTasks(DefaultGradleLauncher.java:124)
    at org.gradle.internal.invocation.GradleBuildController$1.call(GradleBuildController.java:77)
    at org.gradle.internal.invocation.GradleBuildController$1.call(GradleBuildController.java:74)
    at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:154)
    at org.gradle.internal.work.StopShieldingWorkerLeaseService.withLocks(StopShieldingWorkerLeaseService.java:38)
    at org.gradle.internal.invocation.GradleBuildController.doBuild(GradleBuildController.java:96)
    at org.gradle.internal.invocation.GradleBuildController.run(GradleBuildController.java:74)
    at org.gradle.tooling.internal.provider.runner.BuildModelActionRunner.run(BuildModelActionRunner.java:55)
    at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
    at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
    at org.gradle.tooling.internal.provider.ValidatingBuildActionRunner.run(ValidatingBuildActionRunner.java:32)
    at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner$3.run(RunAsBuildOperationBuildActionRunner.java:50)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:300)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:292)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:174)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:90)
    at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
    at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner.run(RunAsBuildOperationBuildActionRunner.java:45)
    at org.gradle.tooling.internal.provider.SubscribableBuildActionRunner.run(SubscribableBuildActionRunner.java:51)
    at org.gradle.launcher.exec.InProcessBuildActionExecuter$1.transform(InProcessBuildActionExecuter.java:47)
    at org.gradle.launcher.exec.InProcessBuildActionExecuter$1.transform(InProcessBuildActionExecuter.java:44)
    at org.gradle.composite.internal.DefaultRootBuildState.run(DefaultRootBuildState.java:79)
    at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:44)
    at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:30)
    at org.gradle.launcher.exec.BuildTreeScopeBuildActionExecuter.execute(BuildTreeScopeBuildActionExecuter.java:39)
    at org.gradle.launcher.exec.BuildTreeScopeBuildActionExecuter.execute(BuildTreeScopeBuildActionExecuter.java:25)
    at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:80)
    at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:53)
    at org.gradle.tooling.internal.provider.ServicesSetupBuildActionExecuter.execute(ServicesSetupBuildActionExecuter.java:62)
    at org.gradle.tooling.internal.provider.ServicesSetupBuildActionExecuter.execute(ServicesSetupBuildActionExecuter.java:34)
    at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:36)
    at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:25)
    at org.gradle.tooling.internal.provider.ParallelismConfigurationBuildActionExecuter.execute(ParallelismConfigurationBuildActionExecuter.java:43)
    at org.gradle.tooling.internal.provider.ParallelismConfigurationBuildActionExecuter.execute(ParallelismConfigurationBuildActionExecuter.java:29)
    at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:59)
    at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:31)
    at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:59)
    at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:44)
    at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:46)
    at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:30)
    at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:67)
    at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:36)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:37)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:26)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.RequestStopIfSingleUsedDaemon.execute(RequestStopIfSingleUsedDaemon.java:34)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.call(ForwardClientInput.java:74)
    at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.call(ForwardClientInput.java:72)
    at org.gradle.util.Swapper.swap(Swapper.java:38)
    at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:72)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.LogAndCheckHealth.execute(LogAndCheckHealth.java:55)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:62)
    at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:36)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:81)
    at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:36)
    at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:122)
    at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:50)
    at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:295)
    at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
    at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
    at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
Caused by: org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':pitest'.
    at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:110)
    at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:77)
    at org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter.execute(OutputDirectoryCreatingTaskExecuter.java:51)
    at org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter.execute(SkipUpToDateTaskExecuter.java:59)
    at org.gradle.api.internal.tasks.execution.ResolveTaskOutputCachingStateExecuter.execute(ResolveTaskOutputCachingStateExecuter.java:54)
    at org.gradle.api.internal.tasks.execution.ValidatingTaskExecuter.execute(ValidatingTaskExecuter.java:59)
    at org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter.execute(SkipEmptySourceFilesTaskExecuter.java:101)
    at org.gradle.api.internal.tasks.execution.FinalizeInputFilePropertiesTaskExecuter.execute(FinalizeInputFilePropertiesTaskExecuter.java:44)
    at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:91)
    at org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter.execute(ResolveTaskArtifactStateTaskExecuter.java:62)
    at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:59)
    at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:54)
    at org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter.execute(ExecuteAtMostOnceTaskExecuter.java:43)
    at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:34)
    at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.run(EventFiringTaskExecuter.java:51)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:300)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:292)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:174)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:90)
    at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
    at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:46)
    at org.gradle.execution.taskgraph.LocalTaskInfoExecutor.execute(LocalTaskInfoExecutor.java:42)
    at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareWorkItemExecutor.execute(DefaultTaskExecutionGraph.java:277)
    at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareWorkItemExecutor.execute(DefaultTaskExecutionGraph.java:262)
    at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$ExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:135)
    at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$ExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:130)
    at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$ExecutorWorker.execute(DefaultTaskPlanExecutor.java:200)
    at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$ExecutorWorker.executeWithWork(DefaultTaskPlanExecutor.java:191)
    at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$ExecutorWorker.run(DefaultTaskPlanExecutor.java:130)
    ... 3 more
Caused by: org.gradle.process.internal.ExecException: Process 'command '/usr/lib/jvm/java-8-oracle/bin/java'' finished with non-zero exit value 1
    at org.gradle.process.internal.DefaultExecHandle$ExecResultImpl.assertNormalExitValue(DefaultExecHandle.java:395)
    at org.gradle.process.internal.DefaultJavaExecAction.execute(DefaultJavaExecAction.java:37)
    at org.gradle.api.tasks.JavaExec.exec(JavaExec.java:79)
    at info.solidsoft.gradle.pitest.PitestTask.exec(PitestTask.groovy:205)
    at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73)
    at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:46)
    at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:39)
    at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:26)
    at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:801)
    at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:768)
    at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$1.run(ExecuteActionsTaskExecuter.java:131)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:300)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:292)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:174)
    at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:90)
    at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
    at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:120)
    at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:99)
    ... 31 more
    
```

### CatalogObjectServiceTest exception

The following exception occures at runtime when analysing the CatalogObjectService test class.

```
Exception in thread "main" spoon.SpoonException: Explicit modifier not found
    at spoon.support.compiler.jdt.PositionBuilder.setModifiersPosition(PositionBuilder.java:525)
    at spoon.support.compiler.jdt.PositionBuilder.buildPositionCtElement(PositionBuilder.java:283)
    at spoon.support.compiler.jdt.ContextBuilder.enter(ContextBuilder.java:98)
    at spoon.support.compiler.jdt.JDTTreeBuilderHelper.createType(JDTTreeBuilderHelper.java:624)
    at spoon.support.compiler.jdt.JDTTreeBuilder.visit(JDTTreeBuilder.java:1651)
    at org.eclipse.jdt.internal.compiler.ast.TypeDeclaration.traverse(TypeDeclaration.java:1349)
    at org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration.traverse(CompilationUnitDeclaration.java:783)
    at org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration.traverse(CompilationUnitDeclaration.java:744)
    at spoon.support.compiler.jdt.JDTBasedSpoonCompiler.buildModel(JDTBasedSpoonCompiler.java:475)
    at spoon.support.compiler.jdt.JDTBasedSpoonCompiler.buildUnitsAndModel(JDTBasedSpoonCompiler.java:390)
    at spoon.support.compiler.jdt.JDTBasedSpoonCompiler.buildSources(JDTBasedSpoonCompiler.java:339)
    at spoon.support.compiler.jdt.JDTBasedSpoonCompiler.build(JDTBasedSpoonCompiler.java:122)
    at spoon.support.compiler.jdt.JDTBasedSpoonCompiler.build(JDTBasedSpoonCompiler.java:105)
    at spoon.Launcher.buildModel(Launcher.java:767)
    at eu.stamp_project.utils.compilation.TestCompiler.getNewModelCtClass(TestCompiler.java:199)
    at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:151)
    at eu.stamp_project.utils.compilation.TestCompiler.compileAndDiscardUncompilableMethods(TestCompiler.java:119)
    at eu.stamp_project.utils.compilation.TestCompiler.compileAndRun(TestCompiler.java:92)
    at eu.stamp_project.utils.compilation.TestCompiler.compileRunAndDiscardUncompilableAndFailingTestMethods(TestCompiler.java:54)
    at eu.stamp_project.dspot.Amplification.amplification(Amplification.java:77)
    at eu.stamp_project.dspot.DSpot._amplify(DSpot.java:244)
    at eu.stamp_project.dspot.DSpot.lambda$amplifyTestClassesTestMethods$6(DSpot.java:223)
    at java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)
    at java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1382)
    at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:481)
    at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)
    at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)
    at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    at java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)
    at eu.stamp_project.dspot.DSpot.amplifyTestClassesTestMethods(DSpot.java:224)
    at eu.stamp_project.Main.run(Main.java:70)
    at eu.stamp_project.Main.main(Main.java:41)

```

### RestApiAccessServiceTest exception

The RestApiAccessServiceTest error is reported by Dspot in the file [errors_report.txt](errors_report.txt)

