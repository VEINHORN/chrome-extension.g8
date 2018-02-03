$if(scalajs_chrome_050.truthy)$
  addSbtPlugin("net.lullabyte" % "sbt-chrome-plugin" % "0.5.0")
$else$
resolvers += Resolver.url("veinhorn plugins-repo", url("https://dl.bintray.com/veinhorn/sbt-plugins"))(Resolver.ivyStylePatterns)

addSbtPlugin("net.lullabyte" % "sbt-chrome-plugin" % "0.5.8")
$endif$
