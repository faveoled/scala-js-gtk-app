package node_gtk

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("node-gtk", JSImport.Namespace)
object gi extends js.Any {

  def require(arg1: String, arg2: String): Gtk = js.native

  def startLoop(): Unit = js.native
}