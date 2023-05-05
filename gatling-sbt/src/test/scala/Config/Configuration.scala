package Config

object Configuration {
    val baseUrl: String = "https://reqres.in/api/usrers"
    val users: Int = Integer.getInteger("VirtualUsers",1).toInt
    val rampUp: Int = Integer.getInteger("rampUp",1).toInt
}
