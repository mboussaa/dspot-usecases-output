var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":5271,"methods":[{"el":22,"sc":2,"sl":20},{"el":33,"sc":2,"sl":24},{"el":37,"sc":2,"sl":35},{"el":41,"sc":2,"sl":39}],"name":"EvolutionAlertMessageListener","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_109":{"methods":[{"sl":20},{"sl":24}],"name":"testParsingAlerts","pass":true,"statements":[{"sl":21},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_112":{"methods":[{"sl":20},{"sl":24},{"sl":35},{"sl":39}],"name":"testPublishEvolutionAlertMessage","pass":true,"statements":[{"sl":21},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":36},{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [109, 112], [109, 112], [], [], [109, 112], [109, 112], [109, 112], [109, 112], [109, 112], [109, 112], [], [], [], [], [], [112], [112], [], [], [112], [112], [], []]
