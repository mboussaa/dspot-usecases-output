var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":14,"id":434,"methods":[{"el":9,"sc":2,"sl":7},{"el":12,"sc":2,"sl":10}],"name":"BaseModel","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":10}],"name":"testGetAllBaseModelsWithQueryMetadata","pass":true,"statements":[{"sl":11}]},"test_125":{"methods":[{"sl":10}],"name":"getModelInstance","pass":true,"statements":[{"sl":11}]},"test_16":{"methods":[{"sl":10}],"name":"testGetBaseModelsForSystem","pass":true,"statements":[{"sl":11}]},"test_2":{"methods":[{"sl":10}],"name":"testGetAllBaseModels","pass":true,"statements":[{"sl":11}]},"test_52":{"methods":[{"sl":10}],"name":"testGetAllAdaptationModels","pass":true,"statements":[{"sl":11}]},"test_95":{"methods":[{"sl":7},{"sl":10}],"name":"testCreateGetAndDeleteBaseModel","pass":true,"statements":[{"sl":8},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [95], [95], [], [2, 95, 125, 103, 16, 52], [2, 95, 125, 103, 16, 52], [], [], []]
