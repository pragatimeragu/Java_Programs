public class static_block_vs_constructor {
    static{
        System.out.println("Static block1 exceuted");
    }
     static{
        System.out.println("Static block2 exceuted");
    }

    static_block_vs_constructor()
    {
        System.out.println("constructor exceuted");
    }

    public static void main(String[] args) {
        static_block_vs_constructor s1 = new static_block_vs_constructor();
    }
        
    
}

// static block always executes first before main or constructor
//when there are multiple static blocks then the order in which we created them it will execute in that sequence