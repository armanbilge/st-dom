package dom.std.global

import dom.std.AddEventListenerOptions
import dom.std.EventListenerOptions
import dom.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFETurbulenceElement")
@js.native
class SVGFETurbulenceElement ()
  extends StObject
     with dom.std.SVGFETurbulenceElement {
  
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
object SVGFETurbulenceElement {
  
  @JSGlobal("SVGFETurbulenceElement.SVG_STITCHTYPE_NOSTITCH")
  @js.native
  val SVG_STITCHTYPE_NOSTITCH: Double = js.native
  
  @JSGlobal("SVGFETurbulenceElement.SVG_STITCHTYPE_STITCH")
  @js.native
  val SVG_STITCHTYPE_STITCH: Double = js.native
  
  @JSGlobal("SVGFETurbulenceElement.SVG_STITCHTYPE_UNKNOWN")
  @js.native
  val SVG_STITCHTYPE_UNKNOWN: Double = js.native
  
  @JSGlobal("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_FRACTALNOISE")
  @js.native
  val SVG_TURBULENCE_TYPE_FRACTALNOISE: Double = js.native
  
  @JSGlobal("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_TURBULENCE")
  @js.native
  val SVG_TURBULENCE_TYPE_TURBULENCE: Double = js.native
  
  @JSGlobal("SVGFETurbulenceElement.SVG_TURBULENCE_TYPE_UNKNOWN")
  @js.native
  val SVG_TURBULENCE_TYPE_UNKNOWN: Double = js.native
}
