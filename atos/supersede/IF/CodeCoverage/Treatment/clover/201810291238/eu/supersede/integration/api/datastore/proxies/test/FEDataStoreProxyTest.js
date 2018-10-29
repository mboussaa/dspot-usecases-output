var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":123,"id":7882,"methods":[{"el":55,"sc":5,"sl":45},{"el":62,"sc":5,"sl":57},{"el":69,"sc":5,"sl":64},{"el":77,"sc":5,"sl":71},{"el":85,"sc":5,"sl":79},{"el":92,"sc":5,"sl":87},{"el":100,"sc":5,"sl":94},{"el":107,"sc":5,"sl":102},{"el":115,"sc":5,"sl":109}],"name":"FEDataStoreProxyTest","sl":39}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_129":{"methods":[{"sl":102}],"name":"testGetProfiles","pass":true,"statements":[{"sl":104},{"sl":105},{"sl":106}]},"test_15":{"methods":[{"sl":94}],"name":"testGetNotification","pass":true,"statements":[{"sl":96},{"sl":97},{"sl":98}]},"test_27":{"methods":[{"sl":71}],"name":"testGetUserLazy","pass":true,"statements":[{"sl":73},{"sl":74},{"sl":75},{"sl":76}]},"test_39":{"methods":[{"sl":87}],"name":"testGetNotifications","pass":true,"statements":[{"sl":89},{"sl":90}]},"test_5":{"methods":[{"sl":79}],"name":"testGetUser","pass":true,"statements":[{"sl":81},{"sl":82},{"sl":83},{"sl":84}]},"test_52":{"methods":[{"sl":57}],"name":"testGetUsersLazy","pass":true,"statements":[{"sl":59},{"sl":60},{"sl":61}]},"test_63":{"methods":[{"sl":109}],"name":"testGetProfile","pass":true,"statements":[{"sl":111},{"sl":112},{"sl":113},{"sl":114}]},"test_88":{"methods":[{"sl":64}],"name":"testGetUsers","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [52], [], [52], [52], [52], [], [], [88], [], [88], [88], [88], [], [], [27], [], [27], [27], [27], [27], [], [], [5], [], [5], [5], [5], [5], [], [], [39], [], [39], [39], [], [], [], [15], [], [15], [15], [15], [], [], [], [129], [], [129], [129], [129], [], [], [63], [], [63], [63], [63], [63], [], [], [], [], [], [], [], [], []]