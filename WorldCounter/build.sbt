//lazy val root = (project in file(".")).
//  settings(
//    name := "HelloWorldSBT",
//    version := "1.0",
//    scalaVersion := "2.12.2",
//    mainClass in Compile := Some("myPackage.HelloWorld")
//  )
name := "HelloWorldSBT"
version := "1.0"
scalaVersion := "2.10.6"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

//unmanagedJars in Compile += file("C:\\Users\\abc\\IdeaProjects\\HelloWorldSBT\\HelloWorldSBT-1.0.jar")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.6.1" % "provided",
  //"org.apache.spark" % "spark-core" % "1.2.0"
  //"org.apache.spark" %% "spark-core" % "1.6.1"
  "org.apache.spark" %% "spark-streaming" % "1.6.1" % "provided"
  //  "org.apache.spark" %% "spark-hive" % "1.6.1" % "provided",
  //  "org.apache.spark" %% "spark-sql" % "1.6.1" % "provided",
  //"org.apache.spark" %% "spark-assembly" % "2.1.0",
  //"net.liftweb" %% "lift-json" % "3.0-M1"
)
