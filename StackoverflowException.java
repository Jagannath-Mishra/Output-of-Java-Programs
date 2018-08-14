package com.java.writen.test;
public class StackoverflowException
{
    final static int CALLS = 710;

    public static void main(String[] args)
    {
        final Functor[] functors = new Functor[CALLS];
        for (int i = 0; i < CALLS; i++)
        {
            final int finalInt = i;
            functors[i] = new Functor()
            {
                @Override
                public void fun()
                {
                    System.out.print(finalInt + " ");
                    if (finalInt != CALLS - 1)
                    {
                        functors[finalInt + 1].fun();
                    }
                }
            };
        }
        // Let's get ready to ruuuuuuumble!
        functors[0].fun(); // Sorry, couldn't resist to not comment in such moment. 
    }

    interface Functor
    {
        void fun();
    }
}