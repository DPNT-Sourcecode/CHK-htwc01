package befaster.solutions.TST;

import befaster.solutions.CHK.CheckoutSolution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class OneTest {
    private One one;

    private CheckoutSolution chk;

    @BeforeEach
    public void name() {
        one = new One();
        chk = new CheckoutSolution();
    }

    @Test
    public void run() {
        assertThat(one.apply(), equalTo(1));
    }

    @Test
    public void runCheckoutSolution() {
        //assertThat(chk.checkout("AAABBCD"), equalTo(130+45+20+15));
       // assertThat(chk.checkout(""), equalTo(0));
        assertThat(chk.checkout("AxA"), equalTo(0));
    }
}