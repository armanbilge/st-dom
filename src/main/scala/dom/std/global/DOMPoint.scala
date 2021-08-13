package dom.std.global

import dom.std.DOMPointInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMPoint")
@js.native
class DOMPoint ()
  extends StObject
     with dom.std.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  def this(x: Double, y: Double, z: Unit, w: Double) = this()
  def this(x: Double, y: Unit, z: Double, w: Double) = this()
  def this(x: Double, y: Unit, z: Unit, w: Double) = this()
  def this(x: Unit, y: Double, z: Double, w: Double) = this()
  def this(x: Unit, y: Double, z: Unit, w: Double) = this()
  def this(x: Unit, y: Unit, z: Double, w: Double) = this()
  def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
}
object DOMPoint {
  
  @JSGlobal("DOMPoint")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromPoint(): dom.std.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")().asInstanceOf[dom.std.DOMPoint]
  @scala.inline
  def fromPoint(other: DOMPointInit): dom.std.DOMPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoint")(other.asInstanceOf[js.Any]).asInstanceOf[dom.std.DOMPoint]
}
