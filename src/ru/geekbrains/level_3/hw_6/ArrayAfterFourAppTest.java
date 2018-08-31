package ru.geekbrains.level_3.hw_6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by DIO
 */
public class ArrayAfterFourAppTest {

    @RunWith(Parameterized.class)
            public static class ParameterTest{

        @Parameterized.Parameters
        public static Collection<Object[]>
        data(){
            return Arrays.asList(new Object[][]{
                    {new int[]{1,2,3,4,5,1,3,2,4,5,2,1},new int[]{5,2,1}},
                    {new int[] {4,2,1,6,2},new int[]{2,1,6,2}},
            });
        }
        private ArrayAfterFourApp app;
        private int[] startArr;
        private int[] result;

        public ParameterTest(int[] startArr, int[] result) {
            this.startArr = startArr;
            this.result = result;
        }

        @Before
        public void init(){
            app = new ArrayAfterFourApp();
        }

        @Test
        public void arrayAfterFour(){
            Assert.assertArrayEquals(result,app.arrayAfterFour(startArr));
        }


    }







    ArrayAfterFourApp app;
    @Before
    public void init(){
        app = new ArrayAfterFourApp();
    }


    @Test
    public void arrayAfterFour() {
        int[] expected={5,2,1};
        int[] array= {1,2,3,5,1,3,2,4,5,2,1};
        int[] result =app.arrayAfterFour(array);
        assertArrayEquals(expected,result);
    }

    @Test
    public void isArrayWithFourOne() {
    }
}