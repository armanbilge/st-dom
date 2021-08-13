package dom.std

import dom.std.stdStrings.compassneedscalibration
import dom.std.stdStrings.devicemotion
import dom.std.stdStrings.deviceorientation
import dom.std.stdStrings.deviceorientationabsolute
import dom.std.stdStrings.gamepadconnected
import dom.std.stdStrings.gamepaddisconnected
import dom.std.stdStrings.mousewheel
import dom.std.stdStrings.orientationchange
import dom.std.stdStrings.readystatechange
import dom.std.stdStrings.vrdisplayactivate
import dom.std.stdStrings.vrdisplayblur
import dom.std.stdStrings.vrdisplayconnect
import dom.std.stdStrings.vrdisplaydeactivate
import dom.std.stdStrings.vrdisplaydisconnect
import dom.std.stdStrings.vrdisplaypresentchange
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A window containing a DOM document; the document property points to the DOM document loaded in that window. */
@js.native
trait Window
  extends StObject
     with EventTarget
     with AnimationFrameProvider
     with GlobalEventHandlers
     with WindowEventHandlers
     with WindowLocalStorage
     with WindowOrWorkerGlobalScope
     with WindowSessionStorage
     with /* index */ NumberDictionary[Window] {
  
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
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  def alert(): Unit = js.native
  def alert(message: js.Any): Unit = js.native
  
  val applicationCache: ApplicationCache = js.native
  
  def blur(): Unit = js.native
  
  /** @deprecated */
  def captureEvents(): Unit = js.native
  
  val clientInformation: Navigator = js.native
  
  def close(): Unit = js.native
  
  val closed: scala.Boolean = js.native
  
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
  
  var customElements: CustomElementRegistry = js.native
  
  var defaultStatus: java.lang.String = js.native
  
  def departFocus(navigationReason: NavigationReason, origin: FocusNavigationOrigin): Unit = js.native
  
  val devicePixelRatio: Double = js.native
  
  val doNotTrack: java.lang.String = js.native
  
  val document: Document = js.native
  
  /** @deprecated */
  val event: js.UndefOr[Event] = js.native
  
  /** @deprecated */
  val external: External = js.native
  
  def focus(): Unit = js.native
  
  val frameElement: Element | Null = js.native
  
  val frames: Window = js.native
  
  def getComputedStyle(elt: Element): CSSStyleDeclaration = js.native
  def getComputedStyle(elt: Element, pseudoElt: java.lang.String): CSSStyleDeclaration = js.native
  
  def getMatchedCSSRules(elt: Element): CSSRuleList = js.native
  def getMatchedCSSRules(elt: Element, pseudoElt: java.lang.String): CSSRuleList = js.native
  
  def getSelection(): Selection | Null = js.native
  
  val history: History = js.native
  
  val innerHeight: Double = js.native
  
  val innerWidth: Double = js.native
  
  val length: Double = js.native
  
  var location: Location = js.native
  
  val locationbar: BarProp = js.native
  
  def matchMedia(query: java.lang.String): MediaQueryList = js.native
  
  val menubar: BarProp = js.native
  
  def moveBy(x: Double, y: Double): Unit = js.native
  
  def moveTo(x: Double, y: Double): Unit = js.native
  
  val msContentScript: ExtensionScriptApis = js.native
  
  def msWriteProfilerMark(profilerMarkName: java.lang.String): Unit = js.native
  
  var name: java.lang.String = js.native
  
  val navigator: Navigator = js.native
  
  var offscreenBuffering: java.lang.String | scala.Boolean = js.native
  
  var oncompassneedscalibration: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var ondevicemotion: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, js.Any]) | Null = js.native
  
  var ondeviceorientation: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any]) | Null = js.native
  
  var ondeviceorientationabsolute: (js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any]) | Null = js.native
  
  var ongamepadconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any]) | Null = js.native
  
  var ongamepaddisconnected: (js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any]) | Null = js.native
  
  var onmousewheel: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any]) | Null = js.native
  
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  def open(): Window | Null = js.native
  def open(url: java.lang.String): Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String): Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: java.lang.String): Window | Null = js.native
  def open(
    url: java.lang.String,
    target: java.lang.String,
    features: java.lang.String,
    replace: scala.Boolean
  ): Window | Null = js.native
  def open(url: java.lang.String, target: java.lang.String, features: Unit, replace: scala.Boolean): Window | Null = js.native
  def open(url: java.lang.String, target: Unit, features: java.lang.String): Window | Null = js.native
  def open(url: java.lang.String, target: Unit, features: java.lang.String, replace: scala.Boolean): Window | Null = js.native
  def open(url: java.lang.String, target: Unit, features: Unit, replace: scala.Boolean): Window | Null = js.native
  def open(url: Unit, target: java.lang.String): Window | Null = js.native
  def open(url: Unit, target: java.lang.String, features: java.lang.String): Window | Null = js.native
  def open(url: Unit, target: java.lang.String, features: java.lang.String, replace: scala.Boolean): Window | Null = js.native
  def open(url: Unit, target: java.lang.String, features: Unit, replace: scala.Boolean): Window | Null = js.native
  def open(url: Unit, target: Unit, features: java.lang.String): Window | Null = js.native
  def open(url: Unit, target: Unit, features: java.lang.String, replace: scala.Boolean): Window | Null = js.native
  def open(url: Unit, target: Unit, features: Unit, replace: scala.Boolean): Window | Null = js.native
  
  var opener: WindowProxy | Null = js.native
  
  /** @deprecated */
  val orientation: java.lang.String | Double = js.native
  
  val outerHeight: Double = js.native
  
  val outerWidth: Double = js.native
  
  val pageXOffset: Double = js.native
  
  val pageYOffset: Double = js.native
  
  val parent: Window = js.native
  
  val personalbar: BarProp = js.native
  
  def postMessage(message: js.Any, targetOrigin: java.lang.String): Unit = js.native
  def postMessage(message: js.Any, targetOrigin: java.lang.String, transfer: js.Array[Transferable]): Unit = js.native
  
  def print(): Unit = js.native
  
  def prompt(): java.lang.String | Null = js.native
  def prompt(message: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: java.lang.String, _default: java.lang.String): java.lang.String | Null = js.native
  def prompt(message: Unit, _default: java.lang.String): java.lang.String | Null = js.native
  
  /** @deprecated */
  def releaseEvents(): Unit = js.native
  
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
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compassneedscalibration(
    `type`: compassneedscalibration,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicemotion(
    `type`: devicemotion,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceMotionEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientation(
    `type`: deviceorientation,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceorientationabsolute(
    `type`: deviceorientationabsolute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ DeviceOrientationEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepadconnected(
    `type`: gamepadconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gamepaddisconnected(
    `type`: gamepaddisconnected,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ GamepadEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(`type`: mousewheel, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mousewheel(
    `type`: mousewheel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[this.type], js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  
  def resizeBy(x: Double, y: Double): Unit = js.native
  
  def resizeTo(width: Double, height: Double): Unit = js.native
  
  val screen: Screen = js.native
  
  val screenLeft: Double = js.native
  
  val screenTop: Double = js.native
  
  val screenX: Double = js.native
  
  val screenY: Double = js.native
  
  def scroll(): Unit = js.native
  def scroll(options: ScrollToOptions): Unit = js.native
  def scroll(x: Double, y: Double): Unit = js.native
  
  def scrollBy(): Unit = js.native
  def scrollBy(options: ScrollToOptions): Unit = js.native
  def scrollBy(x: Double, y: Double): Unit = js.native
  
  def scrollTo(): Unit = js.native
  def scrollTo(options: ScrollToOptions): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  
  val scrollX: Double = js.native
  
  val scrollY: Double = js.native
  
  val scrollbars: BarProp = js.native
  
  val self: Window with (/* globalThis */ js.Any) = js.native
  
  val speechSynthesis: SpeechSynthesis = js.native
  
  var status: java.lang.String = js.native
  
  val statusbar: BarProp = js.native
  
  def stop(): Unit = js.native
  
  val styleMedia: StyleMedia = js.native
  
  val toolbar: BarProp = js.native
  
  val top: Window = js.native
  
  val visualViewport: VisualViewport = js.native
  
  def webkitCancelAnimationFrame(handle: Double): Unit = js.native
  
  def webkitConvertPointFromNodeToPage(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  
  def webkitConvertPointFromPageToNode(node: Node, pt: WebKitPoint): WebKitPoint = js.native
  
  def webkitRequestAnimationFrame(callback: FrameRequestCallback): Double = js.native
  
  val window: Window with (/* globalThis */ js.Any) = js.native
}
