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
       // assertThat(chk.checkout("AAABBCD"), equalTo(130+45+20+15));
       //assertThat(chk.checkout("EEB"), equalTo(80));
        //assertThat(chk.checkout("B"), equalTo(30));
        //assertThat(chk.checkout("ABCDE"), equalTo(155));
      //assertThat(chk.checkout("EEEEBB"), equalTo(160));
       //assertThat(chk.checkout("ABCDEABCDE"), equalTo(280));
       //assertThat(chk.checkout("AAAAAEEBAAABB"), equalTo(455));
       // assertThat(chk.checkout("AxA"), equalTo(0));
    }
}