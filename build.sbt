ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.0-RC1-bin-20220504-26f9e77-NIGHTLY"

lazy val root = (project in file("."))
  .settings(
    name := "dotty-i15145"
  )
