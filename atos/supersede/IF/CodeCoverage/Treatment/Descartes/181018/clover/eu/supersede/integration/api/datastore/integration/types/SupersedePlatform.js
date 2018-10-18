var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":828,"methods":[{"el":11,"sc":2,"sl":9},{"el":14,"sc":2,"sl":12},{"el":17,"sc":2,"sl":15},{"el":20,"sc":2,"sl":18},{"el":23,"sc":2,"sl":21},{"el":26,"sc":2,"sl":24},{"el":30,"sc":2,"sl":28},{"el":33,"sc":2,"sl":31},{"el":41,"sc":2,"sl":34}],"name":"SupersedePlatform","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_107":{"methods":[{"sl":9},{"sl":15},{"sl":21},{"sl":28}],"name":"testPublishAlertMessage","pass":true,"statements":[{"sl":10},{"sl":16},{"sl":22},{"sl":29}]},"test_121":{"methods":[{"sl":9},{"sl":15},{"sl":21},{"sl":28}],"name":"testOptimize","pass":true,"statements":[{"sl":10},{"sl":16},{"sl":22},{"sl":29}]},"test_18":{"methods":[{"sl":9},{"sl":15},{"sl":21},{"sl":28}],"name":"testPublishEvolutionAlertMessage","pass":true,"statements":[{"sl":10},{"sl":16},{"sl":22},{"sl":29}]},"test_48":{"methods":[{"sl":9}],"name":"testRegisterRelease","pass":true,"statements":[{"sl":10}]},"test_59":{"methods":[{"sl":9},{"sl":12},{"sl":15},{"sl":21},{"sl":24},{"sl":28},{"sl":31},{"sl":34}],"name":"testPublishAdaptionAlertMessage","pass":true,"statements":[{"sl":10},{"sl":13},{"sl":16},{"sl":22},{"sl":25},{"sl":29},{"sl":32},{"sl":36}]},"test_69":{"methods":[{"sl":9},{"sl":15},{"sl":21},{"sl":28}],"name":"testPublishTextMessage","pass":true,"statements":[{"sl":10},{"sl":16},{"sl":22},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [121, 48, 69, 107, 18, 59], [121, 48, 69, 107, 18, 59], [], [59], [59], [], [121, 69, 107, 18, 59], [121, 69, 107, 18, 59], [], [], [], [], [121, 69, 107, 18, 59], [121, 69, 107, 18, 59], [], [59], [59], [], [], [121, 69, 107, 18, 59], [121, 69, 107, 18, 59], [], [59], [59], [], [59], [], [59], [], [], [], [], [], []]
