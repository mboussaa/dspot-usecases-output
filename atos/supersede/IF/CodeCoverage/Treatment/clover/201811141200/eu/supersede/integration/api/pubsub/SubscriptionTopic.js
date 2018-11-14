var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":5079,"methods":[{"el":13,"sc":2,"sl":10},{"el":18,"sc":2,"sl":15},{"el":22,"sc":2,"sl":20},{"el":26,"sc":2,"sl":24}],"name":"SubscriptionTopic","sl":4}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_269":{"methods":[{"sl":10},{"sl":20}],"name":"testPublishAdaptionAlertMessage","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":21}]},"test_435":{"methods":[{"sl":20}],"name":"testPublishTextMessage","pass":true,"statements":[{"sl":21}]},"test_557":{"methods":[{"sl":20}],"name":"testPublishEvolutionAlertMessage","pass":true,"statements":[{"sl":21}]},"test_709":{"methods":[{"sl":20}],"name":"testPublishAlertMessage","pass":true,"statements":[{"sl":21}]},"test_831":{"methods":[{"sl":20}],"name":"testOptimize","pass":true,"statements":[{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [269], [269], [269], [], [], [], [], [], [], [], [269, 831, 557, 435, 709], [269, 831, 557, 435, 709], [], [], [], [], [], []]
