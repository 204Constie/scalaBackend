name := "myEcommerce"

version := "1.0"

lazy val `myecommerce` = (project in file(".")).enablePlugins(PlayScala)


scalaVersion := "2.11.7"

libraryDependencies ++= Seq( cache , filters , ws   , specs2 % Test )

libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.8.10.1"

libraryDependencies ++= Seq("com.typesafe.play" %% "anorm" % "2.3.6")

libraryDependencies ++= Seq("com.typesafe.play" %% "play-slick" % "1.1.1")

libraryDependencies ++= Seq("com.typesafe.play" %% "play-slick-evolutions" % "1.1.1")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

