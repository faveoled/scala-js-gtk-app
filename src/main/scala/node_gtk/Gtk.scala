package node_gtk

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

@js.native
trait Gtk extends js.Object {

  def init(): Unit = js.native

  def main(): Unit = js.native

  @js.native
  class Window() extends js.Any {
    def setDefaultSize(width: Int, height: Int): Unit = js.native
    def setTitle(title: String): Unit = js.native

    def showAll(): Unit = js.native

    def add(obj: Object): Unit = js.native
  }

  @js.native
  class Label(props: Object & Dynamic) extends js.Any {
  }

  @js.native
  class Button(props: Object & Dynamic) extends js.Any {
  }

  @js.native
  class Box(props: Object & Dynamic) extends js.Any {

    def packStart(childWidget: Object, expand: Boolean, fill: Boolean, padding: Int): Unit = js.native
  }

}