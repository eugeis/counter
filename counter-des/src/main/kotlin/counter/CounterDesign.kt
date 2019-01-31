package counter

import ee.design.*
import ee.lang.*

object Counter : Comp({ namespace("ee.counter") }) {
    object Counter : Module() {
        object Counter : Entity() {
            val id = propS().unique()
            val count = propL()

            val increment = updateBy(p(count) { value(count) })

        }
    }
}