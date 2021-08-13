package dom.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IDBKeyRange")
@js.native
class IDBKeyRange ()
  extends StObject
     with dom.std.IDBKeyRange
object IDBKeyRange {
  
  @JSGlobal("IDBKeyRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
    */
  @scala.inline
  def bound(lower: js.Any, upper: js.Any): dom.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any])).asInstanceOf[dom.std.IDBKeyRange]
  @scala.inline
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean): dom.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any])).asInstanceOf[dom.std.IDBKeyRange]
  @scala.inline
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): dom.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any], upperOpen.asInstanceOf[js.Any])).asInstanceOf[dom.std.IDBKeyRange]
  @scala.inline
  def bound(lower: js.Any, upper: js.Any, lowerOpen: Unit, upperOpen: scala.Boolean): dom.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(lower.asInstanceOf[js.Any], upper.asInstanceOf[js.Any], lowerOpen.asInstanceOf[js.Any], upperOpen.asInstanceOf[js.Any])).asInstanceOf[dom.std.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
    */
  @scala.inline
  def lowerBound(lower: js.Any): dom.std.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(lower.asInstanceOf[js.Any]).asInstanceOf[dom.std.IDBKeyRange]
  @scala.inline
  def lowerBound(lower: js.Any, open: scala.Boolean): dom.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(lower.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[dom.std.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange spanning only key.
    */
  @scala.inline
  def only(value: js.Any): dom.std.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("only")(value.asInstanceOf[js.Any]).asInstanceOf[dom.std.IDBKeyRange]
  
  /**
    * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
    */
  @scala.inline
  def upperBound(upper: js.Any): dom.std.IDBKeyRange = ^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(upper.asInstanceOf[js.Any]).asInstanceOf[dom.std.IDBKeyRange]
  @scala.inline
  def upperBound(upper: js.Any, open: scala.Boolean): dom.std.IDBKeyRange = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(upper.asInstanceOf[js.Any], open.asInstanceOf[js.Any])).asInstanceOf[dom.std.IDBKeyRange]
}
