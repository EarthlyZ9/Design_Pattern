package alton;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class AltonFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new AltonBody();
    }

    @Override
    public Wheel createWheel() {
        return new AltonWheel();
    }
}
