import org.scalajs.linker.interface.OutputPatterns

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"

scalaJSUseMainModuleInitializer := true

lazy val root = (project in file("."))
  .settings(
    name := "scala-js-gtk-app"
  )
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

npmDependencies in Compile += "node-gtk" -> "0.11.0"

scalaJSLinkerConfig ~= {
  // Enable ECMAScript module output.
  _.withModuleKind(ModuleKind.CommonJSModule)
   // Use .mjs extension.
//   .withOutputPatterns(OutputPatterns.fromJSFile("%s.mjs"))
}
