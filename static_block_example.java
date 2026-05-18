class static_block_example
{       
    static int x=5;
    static{
        x+= x++ + ++x + x++ + --x + x--;
    //  x=5+(5+7+7+7+7)=38
    }

    static_block_example()
    {
        x+= ++x + x++ + --x ;
    //  x=38+(39+39+39) = 155
    }

    public static void main(String[] args) {

        static_block_example obj = new static_block_example();
        System.out.println("X :"+obj.x);
    }
}


// Output - X :155

// always static block is executed before main