package com.algorithm.inprogress;

import java.util.Objects;

public class Queen8 {

    private String str ;
    private int i;

    public static void main1(String[] args) {


        String str = "test";

        String var = str;

        Queen8 v1 = new Queen8();
        Queen8 v2 = v1;//new Queen8();

        System.out.println("test v1:" + v1.hashCode() + " v2:"+v2.hashCode());

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queen8 queen8 = (Queen8) o;
        return i == queen8.i &&
                Objects.equals(str, queen8.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str, i);
    }
}
