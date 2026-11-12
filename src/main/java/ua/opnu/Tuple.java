package ua.opnu;

class GenericTwoTuple<T, V> {
    public final T first;
    public final V second;

    public GenericTwoTuple(T first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

class GenericThreeTuple<T, V, S> {
    public final GenericTwoTuple<T, V> twoTuple; // Використання композиції
    public final S three;
    public final T first;
    public final V second;

    public GenericThreeTuple(T first, V second, S three) {
        this.twoTuple = new GenericTwoTuple<>(first, second);
        this.first = first;
        this.second = second;
        this.three = three;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + three + ")";
    }
}