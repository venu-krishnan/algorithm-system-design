package com.showcase;

import org.junit.jupiter.api.Test;

public class DistanceCalculatorTest {

    @Test
    public void testDistance() {

        double lat1 = 18.18004;// 00601
        double lon1 = -66.75218;
        double lat2 = 18.36073; //00602
        double lon2 = -67.17517;
        double distance = DistanceCalculator.getDistanceFromLatLonInKm(lat1, lon1, lat2, lon2);
        System.out.println("distance =" + distance);
    }
}
