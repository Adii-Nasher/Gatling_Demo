package requests

import Config.Configuration.baseUrl
import io.gatling.core.body.RawFileBody
import io.gatling.core.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.javaapi.http.HttpDsl.{http, status}

object Request {
  var get_UserInfo: HttpRequestBuilder = http("Get userInfo")
    .post(baseUrl + "/page=2")
    .body(RawFileBody("src/User.json")).asJson
    .header("content-type","application/json")
    .check(status is 200)
}
