package dom.std.global

import dom.std.AddEventListenerOptions
import dom.std.EventListenerOptions
import dom.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFEColorMatrixElement")
@js.native
class SVGFEColorMatrixElement ()
  extends StObject
     with dom.std.SVGFEColorMatrixElement {
  
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
object SVGFEColorMatrixElement {
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_HUEROTATE")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_HUEROTATE: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_MATRIX")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_MATRIX: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_SATURATE")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_SATURATE: Double = js.native
  
  @JSGlobal("SVGFEColorMatrixElement.SVG_FECOLORMATRIX_TYPE_UNKNOWN")
  @js.native
  val SVG_FECOLORMATRIX_TYPE_UNKNOWN: Double = js.native
}
