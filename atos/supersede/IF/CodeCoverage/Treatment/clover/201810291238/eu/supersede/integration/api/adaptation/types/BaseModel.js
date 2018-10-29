var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":14,"id":434,"methods":[{"el":9,"sc":2,"sl":7},{"el":12,"sc":2,"sl":10}],"name":"BaseModel","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":10}],"name":"testGetAllBaseModels","pass":true,"statements":[{"sl":11}]},"test_117":{"methods":[{"sl":10}],"name":"testGetAllAdaptationModels","pass":true,"statements":[{"sl":11}]},"test_118":{"methods":[{"sl":10}],"name":"getModelInstance","pass":true,"statements":[{"sl":11}]},"test_38":{"methods":[{"sl":10}],"name":"testGetBaseModelsForSystem","pass":true,"statements":[{"sl":11}]},"test_57":{"methods":[{"sl":7},{"sl":10}],"name":"testCreateGetAndDeleteBaseModel","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_78":{"methods":[{"sl":10}],"name":"testGetAllBaseModelsWithQueryMetadata","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [57], [57], [], [57, 117, 78, 102, 118, 38], [57, 117, 78, 102, 118, 38], [], [], []]
