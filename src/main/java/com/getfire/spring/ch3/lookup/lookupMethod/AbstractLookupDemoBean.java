package com.getfire.spring.ch3.lookup.lookupMethod;

import com.getfire.spring.ch3.MyHelper;

public abstract class AbstractLookupDemoBean implements DemoBean {

    public abstract MyHelper getMyHelper();

    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
