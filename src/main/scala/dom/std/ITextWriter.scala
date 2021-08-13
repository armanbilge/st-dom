package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextWriter extends StObject {
  
  def Close(): Unit = js.native
  
  def Write(s: java.lang.String): Unit = js.native
  
  def WriteLine(s: java.lang.String): Unit = js.native
}
object ITextWriter {
  
  @scala.inline
  def apply(Close: () => Unit, Write: java.lang.String => Unit, WriteLine: java.lang.String => Unit): ITextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.asInstanceOf[ITextWriter]
  }
}
