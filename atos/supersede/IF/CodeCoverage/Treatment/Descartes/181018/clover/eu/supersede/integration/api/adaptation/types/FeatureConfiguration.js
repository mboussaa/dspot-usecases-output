var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":14,"id":469,"methods":[{"el":9,"sc":2,"sl":7},{"el":12,"sc":2,"sl":10}],"name":"FeatureConfiguration","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_100":{"methods":[{"sl":10}],"name":"testGetAllFCModels","pass":true,"statements":[{"sl":11}]},"test_15":{"methods":[{"sl":7},{"sl":10}],"name":"testEnactAdaptationDecisionActionsForFC","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_4":{"methods":[{"sl":7},{"sl":10}],"name":"testEnactFCGivenByString","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_49":{"methods":[{"sl":7},{"sl":10}],"name":"testEnactSelectedAdaptationDecisionsInFCGivenByString","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_62":{"methods":[{"sl":7},{"sl":10}],"name":"testEnactAdaptationDecisionActions","pass":true,"statements":[{"sl":8},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [4, 49, 62, 15], [4, 49, 62, 15], [], [4, 49, 62, 100, 15], [4, 49, 62, 100, 15], [], [], []]
