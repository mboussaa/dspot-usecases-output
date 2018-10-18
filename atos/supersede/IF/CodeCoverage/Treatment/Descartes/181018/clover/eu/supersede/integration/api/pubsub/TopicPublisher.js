var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":5122,"methods":[{"el":36,"sc":2,"sl":34},{"el":42,"sc":2,"sl":38},{"el":60,"sc":2,"sl":47},{"el":65,"sc":2,"sl":62}],"name":"TopicPublisher","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_107":{"methods":[{"sl":38},{"sl":47}],"name":"testPublishAlertMessage","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41},{"sl":50},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59}]},"test_121":{"methods":[{"sl":34}],"name":"testOptimize","pass":true,"statements":[{"sl":35}]},"test_18":{"methods":[{"sl":34}],"name":"testPublishEvolutionAlertMessage","pass":true,"statements":[{"sl":35}]},"test_35":{"methods":[{"sl":62}],"name":"testGetApplications","pass":true,"statements":[{"sl":64}]},"test_59":{"methods":[{"sl":34}],"name":"testPublishAdaptionAlertMessage","pass":true,"statements":[{"sl":35}]},"test_69":{"methods":[{"sl":38},{"sl":47}],"name":"testPublishTextMessage","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41},{"sl":50},{"sl":52},{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":58},{"sl":59}]},"test_95":{"methods":[{"sl":62}],"name":"testCreateGetAndDeleteBaseModel","pass":true,"statements":[{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [121, 18, 59], [121, 18, 59], [], [], [69, 107], [69, 107], [69, 107], [69, 107], [], [], [], [], [], [69, 107], [], [], [69, 107], [], [69, 107], [69, 107], [69, 107], [69, 107], [69, 107], [69, 107], [69, 107], [69, 107], [], [], [95, 35], [], [95, 35], [], [], []]
