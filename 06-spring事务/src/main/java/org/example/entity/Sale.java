package org.example.entity;

public class Sale {
    private int id;
    private int gid;
    private int nums;


    public Sale(){}

    public Sale(int gid, int nums) {
        this.gid = gid;
        this.nums = nums;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }
}
