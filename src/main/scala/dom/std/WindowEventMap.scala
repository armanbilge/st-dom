package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowEventMap
  extends StObject
     with GlobalEventHandlersEventMap
     with WindowEventHandlersEventMap {
  
  var compassneedscalibration: Event = js.native
  
  var devicemotion: DeviceMotionEvent = js.native
  
  var deviceorientation: DeviceOrientationEvent = js.native
  
  var deviceorientationabsolute: DeviceOrientationEvent = js.native
  
  var gamepadconnected: GamepadEvent = js.native
  
  var gamepaddisconnected: GamepadEvent = js.native
  
  var mousewheel: Event = js.native
  
  var orientationchange: Event = js.native
  
  @JSName("progress")
  var progress_WindowEventMap: ProgressEvent[Window] = js.native
  
  var readystatechange: ProgressEvent[Window] = js.native
  
  var vrdisplayactivate: Event = js.native
  
  var vrdisplayblur: Event = js.native
  
  var vrdisplayconnect: Event = js.native
  
  var vrdisplaydeactivate: Event = js.native
  
  var vrdisplaydisconnect: Event = js.native
  
  var vrdisplaypresentchange: Event = js.native
}
object WindowEventMap {
  
  @scala.inline
  def apply(
    abort: UIEvent,
    afterprint: Event,
    animationcancel: AnimationEvent,
    animationend: AnimationEvent,
    animationiteration: AnimationEvent,
    animationstart: AnimationEvent,
    auxclick: MouseEvent,
    beforeinput: InputEvent,
    beforeprint: Event,
    beforeunload: BeforeUnloadEvent,
    blur: FocusEvent,
    cancel: Event,
    canplay: Event,
    canplaythrough: Event,
    change: Event,
    click: MouseEvent,
    close: Event,
    compassneedscalibration: Event,
    compositionend: CompositionEvent,
    compositionstart: CompositionEvent,
    compositionupdate: CompositionEvent,
    contextmenu: MouseEvent,
    cuechange: Event,
    dblclick: MouseEvent,
    devicemotion: DeviceMotionEvent,
    deviceorientation: DeviceOrientationEvent,
    deviceorientationabsolute: DeviceOrientationEvent,
    drag: DragEvent,
    dragend: DragEvent,
    dragenter: DragEvent,
    dragexit: Event,
    dragleave: DragEvent,
    dragover: DragEvent,
    dragstart: DragEvent,
    drop: DragEvent,
    durationchange: Event,
    emptied: Event,
    ended: Event,
    error: ErrorEvent,
    focus: FocusEvent,
    focusin: FocusEvent,
    focusout: FocusEvent,
    gamepadconnected: GamepadEvent,
    gamepaddisconnected: GamepadEvent,
    gotpointercapture: PointerEvent,
    hashchange: HashChangeEvent,
    input: Event,
    invalid: Event,
    keydown: KeyboardEvent,
    keypress: KeyboardEvent,
    keyup: KeyboardEvent,
    languagechange: Event,
    load: Event,
    loadeddata: Event,
    loadedmetadata: Event,
    loadstart: Event,
    lostpointercapture: PointerEvent,
    message: MessageEvent[js.Any],
    messageerror: MessageEvent[js.Any],
    mousedown: MouseEvent,
    mouseenter: MouseEvent,
    mouseleave: MouseEvent,
    mousemove: MouseEvent,
    mouseout: MouseEvent,
    mouseover: MouseEvent,
    mouseup: MouseEvent,
    mousewheel: Event,
    offline: Event,
    online: Event,
    orientationchange: Event,
    pagehide: PageTransitionEvent,
    pageshow: PageTransitionEvent,
    pause: Event,
    play: Event,
    playing: Event,
    pointercancel: PointerEvent,
    pointerdown: PointerEvent,
    pointerenter: PointerEvent,
    pointerleave: PointerEvent,
    pointermove: PointerEvent,
    pointerout: PointerEvent,
    pointerover: PointerEvent,
    pointerup: PointerEvent,
    popstate: PopStateEvent,
    progress: ProgressEvent[Window],
    ratechange: Event,
    readystatechange: ProgressEvent[Window],
    rejectionhandled: PromiseRejectionEvent,
    reset: Event,
    resize: UIEvent,
    scroll: Event,
    securitypolicyviolation: SecurityPolicyViolationEvent,
    seeked: Event,
    seeking: Event,
    select: Event,
    selectionchange: Event,
    selectstart: Event,
    stalled: Event,
    storage: StorageEvent,
    submit: Event,
    suspend: Event,
    timeupdate: Event,
    toggle: Event,
    touchcancel: TouchEvent,
    touchend: TouchEvent,
    touchmove: TouchEvent,
    touchstart: TouchEvent,
    transitioncancel: TransitionEvent,
    transitionend: TransitionEvent,
    transitionrun: TransitionEvent,
    transitionstart: TransitionEvent,
    unhandledrejection: PromiseRejectionEvent,
    unload: Event,
    volumechange: Event,
    vrdisplayactivate: Event,
    vrdisplayblur: Event,
    vrdisplayconnect: Event,
    vrdisplaydeactivate: Event,
    vrdisplaydisconnect: Event,
    vrdisplaypresentchange: Event,
    waiting: Event,
    wheel: WheelEvent
  ): WindowEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], afterprint = afterprint.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], beforeprint = beforeprint.asInstanceOf[js.Any], beforeunload = beforeunload.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compassneedscalibration = compassneedscalibration.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], devicemotion = devicemotion.asInstanceOf[js.Any], deviceorientation = deviceorientation.asInstanceOf[js.Any], deviceorientationabsolute = deviceorientationabsolute.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], gamepadconnected = gamepadconnected.asInstanceOf[js.Any], gamepaddisconnected = gamepaddisconnected.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], hashchange = hashchange.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], languagechange = languagechange.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], mousewheel = mousewheel.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], orientationchange = orientationchange.asInstanceOf[js.Any], pagehide = pagehide.asInstanceOf[js.Any], pageshow = pageshow.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], readystatechange = readystatechange.asInstanceOf[js.Any], rejectionhandled = rejectionhandled.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], unhandledrejection = unhandledrejection.asInstanceOf[js.Any], unload = unload.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], vrdisplayactivate = vrdisplayactivate.asInstanceOf[js.Any], vrdisplayblur = vrdisplayblur.asInstanceOf[js.Any], vrdisplayconnect = vrdisplayconnect.asInstanceOf[js.Any], vrdisplaydeactivate = vrdisplaydeactivate.asInstanceOf[js.Any], vrdisplaydisconnect = vrdisplaydisconnect.asInstanceOf[js.Any], vrdisplaypresentchange = vrdisplaypresentchange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMap]
  }
}
