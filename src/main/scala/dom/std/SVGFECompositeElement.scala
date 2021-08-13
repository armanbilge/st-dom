package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feComposite> element. */
@js.native
trait SVGFECompositeElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  val SVG_FECOMPOSITE_OPERATOR_ARITHMETIC: Double = js.native
  
  val SVG_FECOMPOSITE_OPERATOR_ATOP: Double = js.native
  
  val SVG_FECOMPOSITE_OPERATOR_IN: Double = js.native
  
  val SVG_FECOMPOSITE_OPERATOR_OUT: Double = js.native
  
  val SVG_FECOMPOSITE_OPERATOR_OVER: Double = js.native
  
  val SVG_FECOMPOSITE_OPERATOR_UNKNOWN: Double = js.native
  
  val SVG_FECOMPOSITE_OPERATOR_XOR: Double = js.native
  
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
  
  val in1: SVGAnimatedString = js.native
  
  val in2: SVGAnimatedString = js.native
  
  val k1: SVGAnimatedNumber = js.native
  
  val k2: SVGAnimatedNumber = js.native
  
  val k3: SVGAnimatedNumber = js.native
  
  val k4: SVGAnimatedNumber = js.native
  
  val operator: SVGAnimatedEnumeration = js.native
  
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
}
