package com.designpattern.creational.prototype;

class FourthDimension extends Dimension {

    private String time;
    private String height;
    private String width;
    private String depth;

    public FourthDimension(String height, String width, String depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    //Copy constructor
    public FourthDimension(FourthDimension dimension) {
        this.height = dimension.height;
        this.width = dimension.width;
        this.depth = dimension.depth;
    }

    //copy method
    public Dimension copy() {
        FourthDimension fd = new FourthDimension(this.height, this.width, this.depth);
        fd.setTime(this.time);
        return fd;
    }

    //clone method implements Cloneable interface
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new FourthDimension(this.height, this.width, this.depth);
        }
    }

    public void setTime(String time) {
        this.time = time;
    }

}
