libraryDependencies <+= (sbtVersion) { (sv) => 
  "com.github.philcali" %% "sbt-lwjgl-plugin" % ("sbt" + sv + "_$sbt_lwjgl_version$")
}
