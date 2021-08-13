package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement. */
@js.native
trait SVGTextContentElement
  extends StObject
     with SVGGraphicsElement {
  
  val LENGTHADJUST_SPACING: Double = js.native
  
  val LENGTHADJUST_SPACINGANDGLYPHS: Double = js.native
  
  val LENGTHADJUST_UNKNOWN: Double = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  def getCharNumAtPosition(): Double = js.native
  def getCharNumAtPosition(point: DOMPointInit): Double = js.native
  
  def getComputedTextLength(): Double = js.native
  
  def getEndPositionOfChar(charnum: Double): DOMPoint = js.native
  
  def getExtentOfChar(charnum: Double): DOMRect = js.native
  
  def getNumberOfChars(): Double = js.native
  
  def getRotationOfChar(charnum: Double): Double = js.native
  
  def getStartPositionOfChar(charnum: Double): DOMPoint = js.native
  
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  
  val lengthAdjust: SVGAnimatedEnumeration = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  val textLength: SVGAnimatedLength = js.native
}
