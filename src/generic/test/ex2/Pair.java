package generic.test.ex2;

public class Pair<K, V> {
    private K item;
    private V item2;

    public void setFirst(K item){
        this.item = item;
    }

    public void setSecond(V item2){
        this.item2 = item2;
    }

    public K getFirst() {
        return item;
    }

    public V getSecond() {
        return item2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "item=" + item +
                ", item2=" + item2 +
                '}';
    }
}
