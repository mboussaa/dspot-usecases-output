var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":784,"methods":[{"el":35,"sc":2,"sl":33},{"el":38,"sc":2,"sl":36},{"el":41,"sc":2,"sl":39},{"el":44,"sc":2,"sl":42},{"el":47,"sc":2,"sl":45},{"el":51,"sc":2,"sl":48}],"name":"Profile","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_160":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetUser","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]},"test_267":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetProfiles","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]},"test_38":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetUsers","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]},"test_42":{"methods":[{"sl":36},{"sl":42},{"sl":48}],"name":"testGetProfile","pass":true,"statements":[{"sl":37},{"sl":43},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [267, 38, 160, 42], [267, 38, 160, 42], [], [], [], [], [267, 38, 160, 42], [267, 38, 160, 42], [], [], [], [], [267, 38, 160, 42], [], [267, 38, 160, 42], [], []]
