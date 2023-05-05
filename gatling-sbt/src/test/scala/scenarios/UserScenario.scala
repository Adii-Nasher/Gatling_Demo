package scenarios

import requests.Request
import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder

object UserScenario {
   val userScenario: ScenarioBuilder = scenario("Get user sceanrio")
     .exec(Request.get_UserInfo)
}
