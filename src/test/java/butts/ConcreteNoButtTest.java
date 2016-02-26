package butts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by adrian on 2/26/16.
 */
public class ConcreteNoButtTest {
    @Test
    public void shouldBeNoButts() throws Exception {
        ConcreteNoButt concreteNoButt = new ConcreteNoButt();
        assertThat(concreteNoButt.allOfThem(), equalTo("No Butts"));
    }
}
