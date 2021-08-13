package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Corresponds to the <feConvolveMatrix> element. */
@js.native
trait SVGFEConvolveMatrixElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  
  val SVG_EDGEMODE_NONE: Double = js.native
  
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  
  val SVG_EDGEMODE_WRAP: Double = js.native
  
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
  
  val bias: SVGAnimatedNumber = js.native
  
  val divisor: SVGAnimatedNumber = js.native
  
  val edgeMode: SVGAnimatedEnumeration = js.native
  
  val in1: SVGAnimatedString = js.native
  
  val kernelMatrix: SVGAnimatedNumberList = js.native
  
  val kernelUnitLengthX: SVGAnimatedNumber = js.native
  
  val kernelUnitLengthY: SVGAnimatedNumber = js.native
  
  val orderX: SVGAnimatedInteger = js.native
  
  val orderY: SVGAnimatedInteger = js.native
  
  val preserveAlpha: SVGAnimatedBoolean = js.native
  
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
  
  val targetX: SVGAnimatedInteger = js.native
  
  val targetY: SVGAnimatedInteger = js.native
}
