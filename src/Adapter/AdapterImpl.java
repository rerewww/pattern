package Adapter;

/**
 * Created by son on 2018-10-02.
 */
public class AdapterImpl implements Adapter {
    private Math math;

    public AdapterImpl() {
        this.math = new Math();
    }

    @Override
    public Float twiceOf(final Float f) {
        return (float) math.twoTime(f.doubleValue());
    }

    @Override
    public Float halfOf(final Float f) {
        return (float) math.half(f.doubleValue());
    }
}
