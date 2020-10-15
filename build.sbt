
name := "big-data-interview"

version := "0.1"

scalaVersion := "2.12.12"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

val spark_version = "3.0.1"

/* Runtime */
libraryDependencies +=  "org.apache.spark" %% "spark-sql" % spark_version % Provided

/* Test */
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"


