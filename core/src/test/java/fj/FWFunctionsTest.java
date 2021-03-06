package fj;

import org.junit.Test;

import fj.F1W;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FWFunctionsTest {
    @Test
    public void testLift1() {
        F<Integer, Integer> f = i -> i + 1;
        F1W f1w = F1W.lift(f);
        assertThat(f1w.f(1), is(2));
    }

    @Test
    public void testLift2() {
        F2<Integer, Integer, Integer> f2 = (i, j) -> i + j;
        F2W f2w = F2W.lift(f2);
        assertThat(f2w.f(1, 2), is(3));
    }

}
