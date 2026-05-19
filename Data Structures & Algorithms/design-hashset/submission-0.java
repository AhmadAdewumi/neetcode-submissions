class MyHashSet {

    private Integer[]  hashset;

    public MyHashSet() {
        this.hashset = new Integer[10000];
    }
    
    public void add(int key) {
        for(int i = 0; i < hashset.length; i++){
            if(contains(key)) break;
            if (hashset[i] == null){
                hashset[i] = key;
            }
        }
    }
    
    public void remove(int key) {
        for(int i = 0; i < hashset.length; i++){
            if (hashset[i] !=null && hashset[i] == key){
                hashset[i] = null;
            }
        }
    }
    
    public boolean contains(int key) {
         for(int i = 0; i < hashset.length; i++){
            if (hashset[i] !=null && hashset[i] == key){
                return true;
            }
        }

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */