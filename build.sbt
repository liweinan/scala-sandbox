// https://doc.akka.io/docs/akka-http/current/compatibility-guidelines.html#versioning-and-compatibility
lazy val akkaHttpVersion = "10.1.4"
// https://akka.io/docs/
lazy val akkaVersion = "2.5.15"
// http://www.scalatest.org/
lazy val scalaTestVersion = "3.0.5"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "io.weli",
      scalaVersion := "2.12.6"
    )),
    name := "foobar",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,

      "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream" % akkaVersion,

      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
      // https://doc.akka.io/docs/akka/2.5/stream/stream-testkit.html
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,

      "org.scalatest" %% "scalatest" % scalaTestVersion % Test
    )
  )
