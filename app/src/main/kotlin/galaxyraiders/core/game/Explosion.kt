package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(initialPosition: Point2D, var countdown: Int) :
  SpaceObject("Explosion", 'x', initialPosition, Vector2D(0.0, 0.0), 10.0, 1.0) {
  fun isActive(): Boolean {
    return countdown > 0
  }

  fun decreaseCountdown() {
    countdown -= 1
  }
}
