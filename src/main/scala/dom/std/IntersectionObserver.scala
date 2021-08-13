package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a way to asynchronously observe changes in the intersection of a target element with an ancestor element or with a top-level document's viewport. */
@js.native
trait IntersectionObserver extends StObject {
  
  def disconnect(): Unit = js.native
  
  def observe(target: Element): Unit = js.native
  
  val root: Element | Document | Null = js.native
  
  val rootMargin: java.lang.String = js.native
  
  def takeRecords(): js.Array[IntersectionObserverEntry] = js.native
  
  val thresholds: js.Array[Double] = js.native
  
  def unobserve(target: Element): Unit = js.native
}
object IntersectionObserver {
  
  @scala.inline
  def apply(
    disconnect: () => Unit,
    observe: Element => Unit,
    rootMargin: java.lang.String,
    takeRecords: () => js.Array[IntersectionObserverEntry],
    thresholds: js.Array[Double],
    unobserve: Element => Unit,
    root: Element | Document = null
  ): IntersectionObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), rootMargin = rootMargin.asInstanceOf[js.Any], takeRecords = js.Any.fromFunction0(takeRecords), thresholds = thresholds.asInstanceOf[js.Any], unobserve = js.Any.fromFunction1(unobserve))
    __obj.updateDynamic("root")(if (root != null) (root.asInstanceOf[Element | Document]).asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[IntersectionObserver]
  }
}
