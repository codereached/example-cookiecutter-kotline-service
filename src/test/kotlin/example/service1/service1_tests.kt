package example

import example.service1.*
import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun f() {
        assertEquals("test", Service1().perform("test"))
    }
}