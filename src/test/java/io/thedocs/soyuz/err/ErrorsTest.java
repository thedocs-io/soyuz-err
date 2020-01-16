package io.thedocs.soyuz.err;

import io.thedocs.soyuz.to;
import org.junit.Assert;
import org.junit.Test;

public class ErrorsTest {

    @Test
    public void shouldSkipNullErrors() {
        Errors errors = Errors.ok();

        errors.add((Err) null);
        errors.add(to.list(
                Err.code("abc").build(),
                null
        ));

        Assert.assertEquals(1, errors.get().size());
    }
}
