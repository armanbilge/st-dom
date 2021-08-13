package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any CSS at-rule that contains other rules nested within it. */
@js.native
trait CSSGroupingRule
  extends StObject
     with CSSRule {
  
  val cssRules: CSSRuleList = js.native
  
  def deleteRule(index: Double): Unit = js.native
  
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
}
