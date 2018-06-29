import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.davsanba",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "akkademy-db-client",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.5.13",
      "com.davsanba" %% "akkademy-db" % "0.0.1-SNAPSHOT",
      "com.typesafe.akka" %% "akka-testkit" % "2.5.13" % Test,
      scalaTest % Test
    )
  )
