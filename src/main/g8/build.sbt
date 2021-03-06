import chrome._
import chrome.permissions.Permission
import chrome.permissions.Permission.API
import net.lullabyte.Chrome

lazy val root = (project in file("."))
  .enablePlugins(ChromeSbtPlugin)
  .settings(
    inThisBuild(List(
      organization := "com.example",
      $if(scalajs_chrome_050.truthy)$
      scalaVersion := "2.12.2"
      $else$
      scalaVersion := "2.12.4"
      $endif$
    )),
    name := "$name$",
    version := "0.1",

    scalaJSUseMainModuleInitializer := true,
    scalaJSUseMainModuleInitializer in Test := false,
    relativeSourceMaps := true,
    skip in packageJSDependencies := false,

    libraryDependencies ++= Seq(
      $if(scalajs_chrome_050.truthy)$
      "net.lullabyte" %%% "scala-js-chrome" % "0.5.0"
      $else$
      "net.lullabyte" %%% "scala-js-chrome" % "0.5.8"
      $endif$
    ),
    chromeManifest := new ExtensionManifest {
      override val name = Keys.name.value
      override val version = Keys.version.value

      override val background = Background(
        scripts = Chrome.defaultScripts
      )

      override val defaultLocale = Some("en")

      override val icons = Chrome.icons(
        "asserts/icons",
        "app.png",
        Set()
      )

      override val permissions = Set[Permission](
        API.System.CPU,
        API.System.Display,
        API.System.Memory,
        API.Storage
      )

    }
  )
