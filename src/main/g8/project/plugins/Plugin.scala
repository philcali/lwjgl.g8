import sbt._

class Plugin(info: ProjectInfo) extends PluginDefinition(info) {
  val lwjglVersion = "com.github.philcali" % "sbt-lwjgl-plugin" % "$sbt_lwjgl_version$"
}
