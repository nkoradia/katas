package com.jspcore.values;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoordinateShould {

    final Point x = new Point(2);
    final Point y = new Point(3);

    @Test public void
    x_when_get_x_coordinates_from_a_point() {
        assertThat(new Coordinate(x, y).x(), is(2));
    }

    @Test public void
    y_when_get_y_coordinates_from_a_point() {
        assertThat(new Coordinate(x, y).y(), is(3));
    }
}
