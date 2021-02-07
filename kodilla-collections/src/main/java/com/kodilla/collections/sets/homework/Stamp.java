package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampDimension;
    private String stampStamp;

    public Stamp(String stampName, String stampDimension, String stampStamp) {
        this.stampName = stampName;
        this.stampDimension = stampDimension;
        this.stampStamp = stampStamp;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampDimension() {
        return stampDimension;
    }

    public String getStampStamp() {
        return stampStamp;
    }
    @Override public int hashCode() {
        return Objects.hash(stampName, stampDimension, stampStamp);
    }
    @Override
    public String toString(){
        return "Stamp{" + "stampName='" + stampDimension + '\'' + ", stampStamp='"
                + stampName + '\'' + ", stampStamp=" + stampStamp + '}';
    }
}
