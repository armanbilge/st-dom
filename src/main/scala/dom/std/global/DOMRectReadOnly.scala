package dom.std.global

import dom.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMRectReadOnly")
@js.native
class DOMRectReadOnly ()
  extends StObject
     with dom.std.DOMRectReadOnly {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Unit, width: Double) = this()
  def this(x: Unit, y: Double, width: Double) = this()
  def this(x: Unit, y: Unit, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  def this(x: Double, y: Double, width: Unit, height: Double) = this()
  def this(x: Double, y: Unit, width: Double, height: Double) = this()
  def this(x: Double, y: Unit, width: Unit, height: Double) = this()
  def this(x: Unit, y: Double, width: Double, height: Double) = this()
  def this(x: Unit, y: Double, width: Unit, height: Double) = this()
  def this(x: Unit, y: Unit, width: Double, height: Double) = this()
  def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
}
object DOMRectReadOnly {
  
  @JSGlobal("DOMRectReadOnly")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromRect(): dom.std.DOMRectReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[dom.std.DOMRectReadOnly]
  @scala.inline
  def fromRect(other: DOMRectInit): dom.std.DOMRectReadOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[dom.std.DOMRectReadOnly]
}
