class twoStacks {
    private int[] items;
    private int top1;
    private int top2;
    private int size;
    
    twoStacks() {
        this.size = 100;
        this.items = new int[size];
        top1 = 0;
        top2 = size - 1;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if(top1 > top2) return;
        items[top1] = x;
        top1++;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(top1 > top2) return;
        items[top2] = x;
        top2--;
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        if(top1 == 0) return - 1;
        top1--;
        return items[top1];
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        if(top2 == size - 1) return -1;
        top2++;
        return items[top2];
    }
}