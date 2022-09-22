public class Shape implements Cloneable{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (RuntimeException | CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
