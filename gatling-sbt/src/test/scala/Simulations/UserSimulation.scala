package Simulations

import Config.Configuration.{rampUp, users}
import io.gatling.core.Predef._
import scenarios.UserScenario

import scala.concurrent.duration._

class UserSimulation extends Simulation{
private val UserRampExec = UserScenario.userScenario.inject(rampUsers(users) during(rampUp seconds))

  setUp(UserRampExec).assertions(global.responseTime.max.lt(4000))
}
