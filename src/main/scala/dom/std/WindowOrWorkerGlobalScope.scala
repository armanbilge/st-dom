package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  def atob(data: java.lang.String): java.lang.String = js.native
  
  def btoa(data: java.lang.String): java.lang.String = js.native
  
  val caches: CacheStorage = js.native
  
  def clearInterval(): Unit = js.native
  def clearInterval(handle: Double): Unit = js.native
  
  def clearTimeout(): Unit = js.native
  def clearTimeout(handle: Double): Unit = js.native
  
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
    image: ImageBitmapSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): js.Promise[ImageBitmap] = js.native
  
  val crypto: Crypto = js.native
  
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  
  val indexedDB: IDBFactory = js.native
  
  val isSecureContext: scala.Boolean = js.native
  
  val origin: java.lang.String = js.native
  
  val performance: Performance = js.native
  
  def queueMicrotask(callback: VoidFunction): Unit = js.native
  
  def setInterval(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Unit, arguments: js.Any*): Double = js.native
  
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: js.Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Unit, arguments: js.Any*): Double = js.native
}
