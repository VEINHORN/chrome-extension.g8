$if(scalajs_chrome_050.truthy)$
package $package$

import scala.scalajs.js.JSApp
import org.scalajs.dom

object Main extends JSApp {
  def main(): Unit = {
    dom.window.setInterval(() => {
      dom.console.log("Welcome...")
    }, 1000.toDouble)
  }
}
$else$
package $package$

import org.scalajs.dom

object Main {
  def main(args: Array[String]): Unit = {
    dom.window.setInterval(() => {
      dom.console.log("Welcome...")
    }, 1000.toDouble)
  }
}
$endif$