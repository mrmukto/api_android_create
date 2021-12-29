package com.mrmukto12.apiresouse;

import java.util.List;

public class OurDataClass extends DataClass {
    private List<OurDataClass> data;

    public OurDataClass() {
    }

    public List <OurDataClass> getData() {
        return data;
    }

    public void setData(List<OurDataClass> data) {
        this.data = data;
    }

    public OurDataClass(List<OurDataClass> data) {
        this.data = data;
    }
}
