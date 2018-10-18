var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":5220,"methods":[{"el":25,"sc":2,"sl":23},{"el":31,"sc":2,"sl":27},{"el":46,"sc":2,"sl":33},{"el":51,"sc":2,"sl":48}],"name":"AdaptationPublisher","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_121":{"methods":[{"sl":27},{"sl":33}],"name":"testOptimize","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":35},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45}]},"test_35":{"methods":[{"sl":48}],"name":"testGetApplications","pass":true,"statements":[{"sl":50}]},"test_59":{"methods":[{"sl":27},{"sl":33}],"name":"testPublishAdaptionAlertMessage","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":35},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45}]},"test_95":{"methods":[{"sl":48}],"name":"testCreateGetAndDeleteBaseModel","pass":true,"statements":[{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [121, 59], [121, 59], [121, 59], [121, 59], [], [], [121, 59], [], [121, 59], [], [121, 59], [121, 59], [121, 59], [121, 59], [121, 59], [121, 59], [121, 59], [121, 59], [121, 59], [], [], [95, 35], [], [95, 35], [], [], []]