package dom.std.global

import dom.std.DOMPointInit
import dom.std.DOMQuadInit
import dom.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMQuad")
@js.native
class DOMQuad ()
  extends StObject
     with dom.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
}
object DOMQuad {
  
  @JSGlobal("DOMQuad")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromQuad(): dom.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")().asInstanceOf[dom.std.DOMQuad]
  @scala.inline
  def fromQuad(other: DOMQuadInit): dom.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")(other.asInstanceOf[js.Any]).asInstanceOf[dom.std.DOMQuad]
  
  @scala.inline
  def fromRect(): dom.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[dom.std.DOMQuad]
  @scala.inline
  def fromRect(other: DOMRectInit): dom.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[dom.std.DOMQuad]
}
