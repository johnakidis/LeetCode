class MinStack {
    Stack st;
    Stack min;
    /** initialize your data structure here. */
    public MinStack() {
        st=new Stack();
        min=new Stack();
    }
    
    public void push(int x) {
        if(st.empty())
            min.push(x);
        if(x<=(int)min.peek())
            min.push(x);
        st.push(x);
    }
    
    public void pop() {
        if(st.empty())
            return;
        int i=(int)st.pop();
        if(i==(int)min.peek())
            min.pop();
    }
    
    public int top() {
        //(st.empty())
         // return null;
        return (int)st.peek();
    }
    
    public int getMin() {
        //(st.empty())
         // return null;
        return (int)min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */