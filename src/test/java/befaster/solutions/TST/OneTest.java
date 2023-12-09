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
       //assertThat(chk.checkout("EEB"), equalTo(80));
       //assertThat(chk.checkout("B"), equalTo(30));
        //assertThat(chk.checkout("E"), equalTo(40));
        //assertThat(chk.checkout("N"), equalTo(40));
        //assertThat(chk.checkout("AAAAA"), equalTo(200));
        //assertThat(chk.checkout("AAAAAAAAAA"), equalTo(400));
        //assertThat(chk.checkout("PPPPP"), equalTo(200));
        //assertThat(chk.checkout("PPPPPP"), equalTo(250));
        //assertThat(chk.checkout("RRRQ"), equalTo(150));
        //assertThat(chk.checkout("RRRRQ"), equalTo(200));
        //assertThat(chk.checkout("RRRRRRQQ"), equalTo(300));
        //assertThat(chk.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ"), equalTo(1880));
        assertThat(chk.checkout("EEBB"), equalTo(80+45));
        //assertThat(chk.checkout("ABCDE"), equalTo(155));
      //assertThat(chk.checkout("EEEEBB"), equalTo(160));
      // assertThat(chk.checkout("ABCDEABCDE"), equalTo(280));
      //assertThat(chk.checkout("AAAAAEEBAAABB"), equalTo(455));
       //assertThat(chk.checkout("AxA"), equalTo(0));

       // assertThat(chk.checkout("FF"), equalTo(20));
        //assertThat(chk.checkout("FFFF"), equalTo(30));
       //assertThat(chk.checkout("FFFFFF"), equalTo(40));

    }
}