import subSystems.Rinse;
import subSystems.SpanDry;
import subSystems.Wash;

public class Washer {
    private final Wash wash;
    private final Rinse rinse;
    private final SpanDry spanDry;

    public Washer() {
        wash = new Wash();
        rinse = new Rinse();
        spanDry = new SpanDry();
    }

    public void start() {
        wash.startWash();
        rinse.startRinse();
        spanDry.startDry();
    }
}
