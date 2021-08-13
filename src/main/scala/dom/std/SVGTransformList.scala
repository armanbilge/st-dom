package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList extends StObject {
  
  def appendItem(newItem: SVGTransform): SVGTransform = js.native
  
  def clear(): Unit = js.native
  
  def consolidate(): SVGTransform = js.native
  
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform = js.native
  
  def getItem(index: Double): SVGTransform = js.native
  
  def initialize(newItem: SVGTransform): SVGTransform = js.native
  
  def insertItemBefore(newItem: SVGTransform, index: Double): SVGTransform = js.native
  
  val numberOfItems: Double = js.native
  
  def removeItem(index: Double): SVGTransform = js.native
  
  def replaceItem(newItem: SVGTransform, index: Double): SVGTransform = js.native
}
object SVGTransformList {
  
  @scala.inline
  def apply(
    appendItem: SVGTransform => SVGTransform,
    clear: () => Unit,
    consolidate: () => SVGTransform,
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    getItem: Double => SVGTransform,
    initialize: SVGTransform => SVGTransform,
    insertItemBefore: (SVGTransform, Double) => SVGTransform,
    numberOfItems: Double,
    removeItem: Double => SVGTransform,
    replaceItem: (SVGTransform, Double) => SVGTransform
  ): SVGTransformList = {
    val __obj = js.Dynamic.literal(appendItem = js.Any.fromFunction1(appendItem), clear = js.Any.fromFunction0(clear), consolidate = js.Any.fromFunction0(consolidate), createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), getItem = js.Any.fromFunction1(getItem), initialize = js.Any.fromFunction1(initialize), insertItemBefore = js.Any.fromFunction2(insertItemBefore), numberOfItems = numberOfItems.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), replaceItem = js.Any.fromFunction2(replaceItem))
    __obj.asInstanceOf[SVGTransformList]
  }
}
