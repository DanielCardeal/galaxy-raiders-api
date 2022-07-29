package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

@DisplayName("Given an explosion")
internal class ExplosionTest {
  @Test
  fun `it can decrease its countdown`() {
    val explosion = Explosion(Point2D(1.0, 1.0), 5)
    explosion.decreaseCountdown()
    assertEquals(explosion.countdown, 4)
    explosion.decreaseCountdown()
    assertEquals(explosion.countdown, 3)
  }

  @Test
  fun `it can detect when it is active`() {
    val explosion = Explosion(Point2D(1.0, 1.0), 1)
    assertTrue(explosion.isActive())
    explosion.decreaseCountdown()
    assertFalse(explosion.isActive())
  }
}