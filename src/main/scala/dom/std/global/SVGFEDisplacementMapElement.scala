package dom.std.global

import dom.std.AddEventListenerOptions
import dom.std.EventListenerOptions
import dom.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("SVGFEDisplacementMapElement")
@js.native
class SVGFEDisplacementMapElement ()
  extends StObject
     with dom.std.SVGFEDisplacementMapElement {
  
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
object SVGFEDisplacementMapElement {
  
  @JSGlobal("SVGFEDisplacementMapElement.SVG_CHANNEL_A")
  @js.native
  val SVG_CHANNEL_A: Double = js.native
  
  @JSGlobal("SVGFEDisplacementMapElement.SVG_CHANNEL_B")
  @js.native
  val SVG_CHANNEL_B: Double = js.native
  
  @JSGlobal("SVGFEDisplacementMapElement.SVG_CHANNEL_G")
  @js.native
  val SVG_CHANNEL_G: Double = js.native
  
  @JSGlobal("SVGFEDisplacementMapElement.SVG_CHANNEL_R")
  @js.native
  val SVG_CHANNEL_R: Double = js.native
  
  @JSGlobal("SVGFEDisplacementMapElement.SVG_CHANNEL_UNKNOWN")
  @js.native
  val SVG_CHANNEL_UNKNOWN: Double = js.native
}
