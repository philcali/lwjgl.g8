import sbt._

class Plugin(info: ProjectInfo) extends PluginDefinition(info) {
  val giter8 = "net.databinder" % "giter8-plugin" % "0.1.0"
}
