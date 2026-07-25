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