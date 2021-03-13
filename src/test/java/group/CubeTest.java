package group;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CubeTest {
    Cube cube;
    @Before
    public void setUp() throws Exception {
        cube=new Cube("1",1,2,3,4,5,6);
        System.out.println("Test begin!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test end!");
    }

    @Test
    public void getVolume() {
        assertTrue(cube.getVolume()==18);
    }
}