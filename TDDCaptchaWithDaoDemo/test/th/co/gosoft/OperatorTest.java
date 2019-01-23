package th.co.gosoft;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorTest {
    @Test
    public void เมื่อใส่ค่า_1_ควรจะได้บวก() {
        Operator operator = new Operator(1);
        String result = operator.toString();
        assertEquals("+", result);
    }

    @Test
    public void เมื่อใส่ค่า_2_ควรจะได้คูณ() {
        Operator operator = new Operator(2);
        String result = operator.toString();
        assertEquals("*", result);
    }

    @Test
    public void เมื่อใส่ค่า_3_ควรจะได้ลบ() {
        Operator operator = new Operator(3);
        String result = operator.toString();
        assertEquals("-", result);
    }

    @Test
    public void เมื่อใส่ค่า_4_ควรจะได้หาร() {
        Operator operator = new Operator(4);
        String result = operator.toString();
        assertEquals("/", result);
    }

    @Test
    public void เมื่อใส่ค่า_5_ควรจะได้_null() {
        Operator operator = new Operator(5);
        String result = operator.toString();
        assertEquals(null, result);
    }
}
