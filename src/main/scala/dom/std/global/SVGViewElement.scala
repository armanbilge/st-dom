package dom.std.global

import dom.std.AddEventListenerOptions
import dom.std.EventListenerOptions
import dom.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGViewElement")
@js.native
class SVGViewElement ()
  extends StObject
     with dom.std.SVGViewElement {
  
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
object SVGViewElement {
  
  @JSGlobal("SVGViewElement.SVG_ZOOMANDPAN_DISABLE")
  @js.native
  val SVG_ZOOMANDPAN_DISABLE: Double = js.native
  
  @JSGlobal("SVGViewElement.SVG_ZOOMANDPAN_MAGNIFY")
  @js.native
  val SVG_ZOOMANDPAN_MAGNIFY: Double = js.native
  
  @JSGlobal("SVGViewElement.SVG_ZOOMANDPAN_UNKNOWN")
  @js.native
  val SVG_ZOOMANDPAN_UNKNOWN: Double = js.native
}
