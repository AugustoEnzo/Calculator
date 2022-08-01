// name of the project
name := "Calculator"

// Project version
version := "18.0.1-R28"

// Version of Scala used by the project
scalaVersion := "3.1.3"

// Add dependency on ScalaFX library
libraryDependencies += "org.scalafx" %% "scalafx" % "18.0.1-R28"

libraryDependencies ++= {
  // Determine OS version of JavaFX binaries
  lazy val osName = System.getProperty("os.name") match {
    case n if n.startsWith("Linux") => "linux"
    case n if n.startsWith("Mac") => "mac"
    case n if n.startsWith("Windows") => "win"
    case _ => throw new Exception("Unknown platform!")
  }
  Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
    .map(m => "org.openjfx" % s"javafx-$m" % "16" classifier osName)
}

scalacOptions ++=Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

mainClass := Some("calculator.Front")

// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true