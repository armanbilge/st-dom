package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyViolationEventInit
  extends StObject
     with EventInit {
  
  var blockedURI: js.UndefOr[java.lang.String] = js.native
  
  var columnNumber: js.UndefOr[Double] = js.native
  
  var documentURI: js.UndefOr[java.lang.String] = js.native
  
  var effectiveDirective: js.UndefOr[java.lang.String] = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
  
  var originalPolicy: js.UndefOr[java.lang.String] = js.native
  
  var referrer: js.UndefOr[java.lang.String] = js.native
  
  var sourceFile: js.UndefOr[java.lang.String] = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
  
  var violatedDirective: js.UndefOr[java.lang.String] = js.native
}
object SecurityPolicyViolationEventInit {
  
  @scala.inline
  def apply(
    blockedURI: java.lang.String = null,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    columnNumber: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    documentURI: java.lang.String = null,
    effectiveDirective: java.lang.String = null,
    lineNumber: js.UndefOr[Double] = js.undefined,
    originalPolicy: java.lang.String = null,
    referrer: java.lang.String = null,
    sourceFile: java.lang.String = null,
    statusCode: js.UndefOr[Double] = js.undefined,
    violatedDirective: java.lang.String = null
  ): SecurityPolicyViolationEventInit = {
    val __obj = js.Dynamic.literal()
    if (blockedURI != null) __obj.updateDynamic("blockedURI")(blockedURI.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(columnNumber)) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    if (documentURI != null) __obj.updateDynamic("documentURI")(documentURI.asInstanceOf[js.Any])
    if (effectiveDirective != null) __obj.updateDynamic("effectiveDirective")(effectiveDirective.asInstanceOf[js.Any])
    if (!js.isUndefined(lineNumber)) __obj.updateDynamic("lineNumber")(lineNumber.asInstanceOf[js.Any])
    if (originalPolicy != null) __obj.updateDynamic("originalPolicy")(originalPolicy.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (sourceFile != null) __obj.updateDynamic("sourceFile")(sourceFile.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (violatedDirective != null) __obj.updateDynamic("violatedDirective")(violatedDirective.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPolicyViolationEventInit]
  }
}
