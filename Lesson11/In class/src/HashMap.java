class MyHashMap {
    int[] hashMap;

    public MyHashMap() {
        this.hashMap = new int[1000001];
        for (int i = 0; i < this.hashMap.length; i++) {
            this.hashMap[i] = -1;
        }
    }

    public void put(int key, int value) {
        this.hashMap[key] = value;
    }

    public int get(int key) {
        return this.hashMap[key];
    }

    public void remove(int key) {
        this.hashMap[key] = -1;
    }
}