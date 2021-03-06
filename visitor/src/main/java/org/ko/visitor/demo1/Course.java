package org.ko.visitor.demo1;

/**
 * 抽象类，课程
 */
public abstract class Course {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void accept(IVisitor visitor);

}
