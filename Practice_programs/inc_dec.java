class static_block_example
{       
    int x=5;
    static{
        x+= x++ + ++x + x++ + --x + x--;
    }

    inc_dec()
    {
        x+= ++x + x++ + --x ;
    }

    public static void main(String[] args) {
        static_block_example obj = new static_block_example();
    }
}

// always static block is executed before main