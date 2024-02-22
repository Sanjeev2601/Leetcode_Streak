class TwoSum {
    private HashMap<Integer, Integer> hm;
    public TwoSum() {
        this.hm = new HashMap<>();
    }
    
    public void add(int number) {
        if(this.hm.containsKey(number)){
            this.hm.put(number, this.hm.get(number) + 1);
        }
        else{
            this.hm.put(number, 1);
        }
    }
    
    public boolean find(int value) {
        for(Map.Entry<Integer, Integer> entry : this.hm.entrySet()){
            int complement = value - entry.getKey();
            if(complement != entry.getKey()){
                if(this.hm.containsKey(complement))
                   return true;
            }
            else{
                if(entry.getValue() > 1)
                   return true;
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */