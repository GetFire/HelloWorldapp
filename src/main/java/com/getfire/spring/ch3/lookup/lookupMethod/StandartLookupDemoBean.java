package com.getfire.spring.ch3.lookup.lookupMethod;

import com.getfire.spring.ch3.MyHelper;

public class StandartLookupDemoBean implements DemoBean {
    private MyHelper myHelper;

    public void setMyHelper(MyHelper myHelper) {
        this.myHelper = myHelper;
    }

    public MyHelper getMyHelper() {
        return myHelper;
    }

    public void someOperation() {
        myHelper.doSomethingHelpful();
    }
}
