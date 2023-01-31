class MyHashSet {
    boolean[] hashset;

    public MyHashSet() {
        this.hashset = new boolean[1000001];
    }

    public void add(int key) {
        this.hashset[key] = true;
    }

    public void remove(int key) {
        this.hashset[key] = false;
    }

    public boolean contains(int key) {
        return this.hashset[key];
    }
}