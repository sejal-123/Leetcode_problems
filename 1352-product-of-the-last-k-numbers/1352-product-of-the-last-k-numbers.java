class ProductOfNumbers {

    ArrayList<Integer> nums = new ArrayList<Integer>();

    // public ProductOfNumbers() {
        
    // }
    
    public void add(int num) {
        nums.add(num);
    }
    
    public int getProduct(int k) {
        int res = 1;
        for (int i = nums.size()-1; i > nums.size() - k - 1; i-- ) {
            res = res  * nums.get(i);
        }
        return res;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */