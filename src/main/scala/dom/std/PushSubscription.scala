package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
@js.native
trait PushSubscription extends StObject {
  
  val endpoint: java.lang.String = js.native
  
  val expirationTime: Double | Null = js.native
  
  def getKey(name: PushEncryptionKeyName): ArrayBuffer | Null = js.native
  
  val options: PushSubscriptionOptions = js.native
  
  def toJSON(): PushSubscriptionJSON = js.native
  
  def unsubscribe(): js.Promise[scala.Boolean] = js.native
}
object PushSubscription {
  
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    getKey: PushEncryptionKeyName => ArrayBuffer | Null,
    options: PushSubscriptionOptions,
    toJSON: () => PushSubscriptionJSON,
    unsubscribe: () => js.Promise[scala.Boolean],
    expirationTime: Double = null.asInstanceOf[Double]
  ): PushSubscription = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], getKey = js.Any.fromFunction1(getKey), options = options.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.updateDynamic("expirationTime")(if (expirationTime != null) expirationTime.asInstanceOf[Double].asInstanceOf[js.Any] else null)
    __obj.asInstanceOf[PushSubscription]
  }
}
