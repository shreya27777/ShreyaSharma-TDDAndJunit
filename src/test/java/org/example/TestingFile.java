package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingFile {
    @Test
    public void t1()
    {
        String_questions st = new String_questions();
        String s1 = st.removeA("ABCD");
        assertEquals("BCD",s1);
    }
    @Test
    public void t2()
    {
        String_questions st = new String_questions();
        String s1 = st.removeA("AACD");
        assertEquals("CD",s1);
    }
    @Test
    public void t3()
    {
        String_questions st = new String_questions();
        String s1 = st.removeA("BACD");
        assertEquals("BCD",s1);
    }
    @Test
    public void t4()
    {
        String_questions st =new String_questions();
        String s1 = st.removeA("BBAA");
        assertEquals("BBAA",s1);
    }
    @Test
    public  void t5()
    {
        String_questions st = new String_questions();
        String s1 = st.removeA("AABAA");
        assertEquals("BAA",s1);
    }
}
