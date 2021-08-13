package dom.std.global

import dom.std.AddEventListenerOptions
import dom.std.EventListenerOptions
import dom.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFEConvolveMatrixElement")
@js.native
class SVGFEConvolveMatrixElement ()
  extends StObject
     with dom.std.SVGFEConvolveMatrixElement {
  
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
object SVGFEConvolveMatrixElement {
  
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_DUPLICATE")
  @js.native
  val SVG_EDGEMODE_DUPLICATE: Double = js.native
  
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_NONE")
  @js.native
  val SVG_EDGEMODE_NONE: Double = js.native
  
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_UNKNOWN")
  @js.native
  val SVG_EDGEMODE_UNKNOWN: Double = js.native
  
  @JSGlobal("SVGFEConvolveMatrixElement.SVG_EDGEMODE_WRAP")
  @js.native
  val SVG_EDGEMODE_WRAP: Double = js.native
}
