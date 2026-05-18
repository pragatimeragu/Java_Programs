class A
{
    A()
    {
        System.out.print("A ");
    }
}
class B extends A 
{
    B()
    {
        System.out.print("B ");
    }
}
class C extends B 
{
    C()
    {
        System.out.print("C ");
    }
}
class inheritance_super_eg
{
    public static void main(String[] args) {
        new C();
    }
}

//This program demonstrates **constructor inheritance and implicit `super()` calling** in Java.
//  When an object of class `C` is created using `new C()`, 
//  Java first calls the constructor of its parent class `B`, 
//  and before `B` executes, 
//  it automatically calls the constructor of class `A`. 
//  This happens because **Java inserts `super()` by default** in every constructor if it is not written explicitly. 
//  Since `A` is the top parent class, its constructor executes first, followed by `B`, and then `C`.
//  Therefore, 
// the output is: A B C
// This shows that **parent constructors are executed before child constructors through automatic `super()` calling**.
