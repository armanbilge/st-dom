package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGPathSegList extends StObject {
  
  def appendItem(newItem: SVGPathSeg): SVGPathSeg = js.native
  
  def clear(): Unit = js.native
  
  def getItem(index: Double): SVGPathSeg = js.native
  
  def initialize(newItem: SVGPathSeg): SVGPathSeg = js.native
  
  def insertItemBefore(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
  
  val numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGPathSeg = js.native
  
  def replaceItem(newItem: SVGPathSeg, index: Double): SVGPathSeg = js.native
}
object SVGPathSegList {
  
  @scala.inline
  def apply(
    appendItem: SVGPathSeg => SVGPathSeg,
    clear: () => Unit,
    getItem: Double => SVGPathSeg,
    initialize: SVGPathSeg => SVGPathSeg,
    insertItemBefore: (SVGPathSeg, Double) => SVGPathSeg,
    numberOfItems: Double,
    removeItem: Double => SVGPathSeg,
    replaceItem: (SVGPathSeg, Double) => SVGPathSeg
  ): SVGPathSegList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGPathSegList]
  }
}
