package org.ko.adapter.basic.objectadapter;

public class ConcreateTarget implements Target {
    @Override
    public void request() {
        System.out.println("被适配的方法");
    }
}
