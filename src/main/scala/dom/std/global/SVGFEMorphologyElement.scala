package dom.std.global

import dom.std.AddEventListenerOptions
import dom.std.EventListenerOptions
import dom.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFEMorphologyElement")
@js.native
class SVGFEMorphologyElement ()
  extends StObject
     with dom.std.SVGFEMorphologyElement {
  
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
object SVGFEMorphologyElement {
  
  @JSGlobal("SVGFEMorphologyElement.SVG_MORPHOLOGY_OPERATOR_DILATE")
  @js.native
  val SVG_MORPHOLOGY_OPERATOR_DILATE: Double = js.native
  
  @JSGlobal("SVGFEMorphologyElement.SVG_MORPHOLOGY_OPERATOR_ERODE")
  @js.native
  val SVG_MORPHOLOGY_OPERATOR_ERODE: Double = js.native
  
  @JSGlobal("SVGFEMorphologyElement.SVG_MORPHOLOGY_OPERATOR_UNKNOWN")
  @js.native
  val SVG_MORPHOLOGY_OPERATOR_UNKNOWN: Double = js.native
}
