class StockSpanner {
        Stack<int[]> Stack;



    public StockSpanner() {
        Stack = new Stack<>();
    
        
    }
    
    public int next(int price) {
        int span = 1 ; 
            while(!Stack.isEmpty() && price >= Stack.peek()[0]){
                span+= Stack.peek()[1];
                Stack.pop();


            }
            Stack.push(new int[]{price, span});
            return span;

         }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */