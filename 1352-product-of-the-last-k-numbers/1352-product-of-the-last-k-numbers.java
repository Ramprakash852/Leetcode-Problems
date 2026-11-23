class ProductOfNumbers {

    public ProductOfNumbers() {
        
    }
    List<Integer>list=new ArrayList <Integer>();
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int p=1 ;
        int i=list.size()-1;
        while(k>0){
            p *=list.get(i);
            i--;
            k--;
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */