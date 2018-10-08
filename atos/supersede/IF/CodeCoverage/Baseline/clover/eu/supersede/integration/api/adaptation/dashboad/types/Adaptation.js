var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":97,"id":25,"methods":[{"el":30,"sc":2,"sl":30},{"el":34,"sc":5,"sl":32},{"el":38,"sc":2,"sl":36},{"el":42,"sc":2,"sl":40},{"el":46,"sc":2,"sl":44},{"el":50,"sc":2,"sl":48},{"el":54,"sc":2,"sl":52},{"el":58,"sc":2,"sl":56},{"el":62,"sc":2,"sl":60},{"el":69,"sc":2,"sl":64},{"el":73,"sc":2,"sl":71},{"el":77,"sc":2,"sl":75},{"el":81,"sc":2,"sl":79},{"el":96,"sc":2,"sl":83}],"name":"Adaptation","sl":18}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_117":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testEnactAdaptationDecisionActionsForFC","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]},"test_133":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testResetDashboard","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]},"test_21":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testEnactAdaptationDecisionActions","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]},"test_46":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testEnactFCGivenByString","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]},"test_50":{"methods":[{"sl":30},{"sl":36},{"sl":44},{"sl":52},{"sl":71},{"sl":79}],"name":"testGetAllAdaptations","pass":true,"statements":[{"sl":37},{"sl":45},{"sl":53},{"sl":72},{"sl":80}]},"test_67":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testGetAdaptation","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]},"test_70":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testAddAdaptation","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]},"test_79":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testEnactSelectedAdaptationDecisionsInFCGivenByString","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]},"test_97":{"methods":[{"sl":30},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48},{"sl":52},{"sl":60},{"sl":64},{"sl":71},{"sl":75},{"sl":79}],"name":"testAddEnactment","pass":true,"statements":[{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49},{"sl":53},{"sl":61},{"sl":65},{"sl":66},{"sl":68},{"sl":72},{"sl":76},{"sl":80}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [79, 46, 133, 70, 117, 67, 97, 21, 50], [], [79, 46, 133, 70, 117, 67, 97, 21], [79, 46, 133, 70, 117, 67, 97, 21], [], [], [79, 46, 133, 70, 117, 67, 97, 21, 50], [79, 46, 133, 70, 117, 67, 97, 21, 50], [], [], [79, 46, 133, 70, 117, 67, 97, 21], [79, 46, 133, 70, 117, 67, 97, 21], [], [], [79, 46, 133, 70, 117, 67, 97, 21, 50], [79, 46, 133, 70, 117, 67, 97, 21, 50], [], [], [79, 46, 133, 70, 117, 67, 97, 21], [79, 46, 133, 70, 117, 67, 97, 21], [], [], [79, 46, 133, 70, 117, 67, 97, 21, 50], [79, 46, 133, 70, 117, 67, 97, 21, 50], [], [], [], [], [], [], [79, 46, 133, 70, 117, 67, 97, 21], [79, 46, 133, 70, 117, 67, 97, 21], [], [], [79, 46, 133, 70, 117, 67, 97, 21], [79, 46, 133, 70, 117, 67, 97, 21], [79, 46, 133, 70, 117, 67, 97, 21], [], [79, 46, 133, 70, 117, 67, 97, 21], [], [], [79, 46, 133, 70, 117, 67, 97, 21, 50], [79, 46, 133, 70, 117, 67, 97, 21, 50], [], [], [79, 46, 133, 70, 117, 67, 97, 21], [79, 46, 133, 70, 117, 67, 97, 21], [], [], [79, 46, 133, 70, 117, 67, 97, 21, 50], [79, 46, 133, 70, 117, 67, 97, 21, 50], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
