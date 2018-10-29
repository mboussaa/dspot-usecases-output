var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":235,"id":7560,"methods":[{"el":65,"sc":2,"sl":60},{"el":83,"sc":2,"sl":67},{"el":104,"sc":2,"sl":85},{"el":121,"sc":2,"sl":106},{"el":134,"sc":2,"sl":123},{"el":146,"sc":2,"sl":136},{"el":157,"sc":2,"sl":148},{"el":176,"sc":2,"sl":159},{"el":186,"sc":2,"sl":178},{"el":198,"sc":2,"sl":188},{"el":208,"sc":2,"sl":200},{"el":218,"sc":2,"sl":210},{"el":233,"sc":2,"sl":220}],"name":"AdapterProxyTest","sl":53}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_37":{"methods":[{"sl":123},{"sl":136},{"sl":148},{"sl":159},{"sl":178},{"sl":188},{"sl":200},{"sl":210}],"name":"testEnactAdaptationDecisionActionsForFC","pass":true,"statements":[{"sl":126},{"sl":129},{"sl":130},{"sl":131},{"sl":133},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":145},{"sl":149},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":156},{"sl":160},{"sl":161},{"sl":162},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":175},{"sl":179},{"sl":180},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":217}]},"test_54":{"methods":[{"sl":85},{"sl":136},{"sl":148},{"sl":159},{"sl":178},{"sl":188},{"sl":200},{"sl":210}],"name":"testEnactSelectedAdaptationDecisionsInFCGivenByString","pass":true,"statements":[{"sl":87},{"sl":90},{"sl":93},{"sl":94},{"sl":95},{"sl":97},{"sl":98},{"sl":99},{"sl":100},{"sl":101},{"sl":102},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":145},{"sl":149},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":156},{"sl":160},{"sl":161},{"sl":162},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":175},{"sl":179},{"sl":180},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":217}]},"test_55":{"methods":[{"sl":106},{"sl":136},{"sl":148},{"sl":159},{"sl":178},{"sl":188},{"sl":200},{"sl":210}],"name":"testEnactFCGivenByString","pass":true,"statements":[{"sl":108},{"sl":111},{"sl":114},{"sl":115},{"sl":116},{"sl":118},{"sl":119},{"sl":120},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":145},{"sl":149},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":156},{"sl":160},{"sl":161},{"sl":162},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":175},{"sl":179},{"sl":180},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":217}]},"test_81":{"methods":[{"sl":67},{"sl":136},{"sl":148},{"sl":159},{"sl":178},{"sl":188},{"sl":200},{"sl":210}],"name":"testEnactAdaptationDecisionActions","pass":true,"statements":[{"sl":69},{"sl":72},{"sl":75},{"sl":76},{"sl":77},{"sl":79},{"sl":80},{"sl":81},{"sl":82},{"sl":137},{"sl":139},{"sl":140},{"sl":141},{"sl":142},{"sl":143},{"sl":145},{"sl":149},{"sl":151},{"sl":152},{"sl":153},{"sl":154},{"sl":156},{"sl":160},{"sl":161},{"sl":162},{"sl":164},{"sl":165},{"sl":166},{"sl":167},{"sl":168},{"sl":169},{"sl":170},{"sl":171},{"sl":172},{"sl":173},{"sl":175},{"sl":179},{"sl":180},{"sl":182},{"sl":183},{"sl":184},{"sl":185},{"sl":189},{"sl":190},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":211},{"sl":212},{"sl":213},{"sl":214},{"sl":215},{"sl":217}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [81], [], [81], [], [], [81], [], [], [81], [81], [81], [], [81], [81], [81], [81], [], [], [54], [], [54], [], [], [54], [], [], [54], [54], [54], [], [54], [54], [54], [54], [54], [54], [], [], [], [55], [], [55], [], [], [55], [], [], [55], [55], [55], [], [55], [55], [55], [], [], [37], [], [], [37], [], [], [37], [37], [37], [], [37], [], [], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [], [], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [], [], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [37, 81, 55, 54], [], [37, 81, 55, 54], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
