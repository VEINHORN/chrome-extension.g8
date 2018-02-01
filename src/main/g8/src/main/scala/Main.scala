import scala.scalajs.js.JSApp
import org.scalajs.dom

object Main extends JSApp {
  def main(): Unit = {
    dom.window.setInterval(() => {
      dom.console.log("Welcome...")
    }, 1000.toDouble)
  }
}
