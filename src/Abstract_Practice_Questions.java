class Abstract_Practice_Questions
{
    public static void main (String[] args)
    {
        // Question 1

        /*Pen p = new FountainPen();
        FountainPen fp = new FountainPen();
        p.write();
        p.refill();
        fp.changeNib();*/
        
        //Question 2

        BasicAnimal ba = new Human();
        Monkey h = new Human();
        ba.eat();
        ba.sleep();
        h.jump();
        h.bite();
        
        //Question 3
        
        
    }
}


abstract class Pen
{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen
{
    @Override
    public void write()
    {
        System.out.println ("I am Fountain Pen");
    }
    @Override
    public void refill()
    {
        System.out.println ("I need a Refill");
    }
    
    public void changeNib()
    {
        System.out.println ("Change My Nib");
    }
}


class Monkey
{
    public void jump()
    {
        System.out.println ("I am a monkey and I JuMp");
    }
    public void bite()
    {
        System.out.println ("I am a monkey and I bite");
    }
}
interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println ("I am a human and I eat");
    }
    public void sleep()
    {
        System.out.println ("I am a human and I sleep");
    }
}