import node_gtk.gi

import scala.scalajs.*

object App {

  def main(args: Array[String]): Unit = {
    val Gtk = gi.require("Gtk", "3.0")
    gi.startLoop()
    Gtk.init()
    val win = new Gtk.Window()
    win.setTitle("Hello App")
    win.setDefaultSize(200, 80)

    val label = new Gtk.Label(js.Dynamic.literal(label = "Hello, Scala!"))
    val button = new Gtk.Button(js.Dynamic.literal(label = "Press me"))

    val hbox = Gtk.Box(js.Dynamic.literal(orientation = 1))
    hbox.packStart(label, false, false ,0)
    hbox.packStart(button, true, true, 8)

    win.add(hbox)
    win.showAll()
    Gtk.main()
  }
}
