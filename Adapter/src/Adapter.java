// implements Target
public class Adapter implements Target {
    @Override
    public Float twiceOf(Float f) {
        return (float) Math.twoTimes(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        return (float) Math.half(f.doubleValue());
    }

}
