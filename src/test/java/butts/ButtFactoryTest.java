package butts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by adrian on 2/26/16.
 */
public class ButtFactoryTest {
    @Test
    public void shouldWrapAButt() throws Exception {
        ButtFactory buttFactory = new ButtFactory();
        SpecButtInterface wrappedButt = buttFactory.wrapAButt(new SpecButts());
        assertThat(wrappedButt.allOfThem(), equalTo("No Butts"));
        assertThat(((ButtMutator)wrappedButt).moreButts(), equalTo("more butts"));
    }
}
