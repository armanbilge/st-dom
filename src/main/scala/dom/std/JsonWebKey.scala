package dom.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonWebKey extends StObject {
  
  var alg: js.UndefOr[java.lang.String] = js.native
  
  var crv: js.UndefOr[java.lang.String] = js.native
  
  var d: js.UndefOr[java.lang.String] = js.native
  
  var dp: js.UndefOr[java.lang.String] = js.native
  
  var dq: js.UndefOr[java.lang.String] = js.native
  
  var e: js.UndefOr[java.lang.String] = js.native
  
  var ext: js.UndefOr[scala.Boolean] = js.native
  
  var k: js.UndefOr[java.lang.String] = js.native
  
  var key_ops: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var kty: js.UndefOr[java.lang.String] = js.native
  
  var n: js.UndefOr[java.lang.String] = js.native
  
  var oth: js.UndefOr[js.Array[RsaOtherPrimesInfo]] = js.native
  
  var p: js.UndefOr[java.lang.String] = js.native
  
  var q: js.UndefOr[java.lang.String] = js.native
  
  var qi: js.UndefOr[java.lang.String] = js.native
  
  var use: js.UndefOr[java.lang.String] = js.native
  
  var x: js.UndefOr[java.lang.String] = js.native
  
  var y: js.UndefOr[java.lang.String] = js.native
}
object JsonWebKey {
  
  @scala.inline
  def apply(
    alg: java.lang.String = null,
    crv: java.lang.String = null,
    d: java.lang.String = null,
    dp: java.lang.String = null,
    dq: java.lang.String = null,
    e: java.lang.String = null,
    ext: js.UndefOr[scala.Boolean] = js.undefined,
    k: java.lang.String = null,
    key_ops: js.Array[java.lang.String] = null,
    kty: java.lang.String = null,
    n: java.lang.String = null,
    oth: js.Array[RsaOtherPrimesInfo] = null,
    p: java.lang.String = null,
    q: java.lang.String = null,
    qi: java.lang.String = null,
    use: java.lang.String = null,
    x: java.lang.String = null,
    y: java.lang.String = null
  ): JsonWebKey = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (crv != null) __obj.updateDynamic("crv")(crv.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (dp != null) __obj.updateDynamic("dp")(dp.asInstanceOf[js.Any])
    if (dq != null) __obj.updateDynamic("dq")(dq.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (!js.isUndefined(ext)) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops.asInstanceOf[js.Any])
    if (kty != null) __obj.updateDynamic("kty")(kty.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (oth != null) __obj.updateDynamic("oth")(oth.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (qi != null) __obj.updateDynamic("qi")(qi.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonWebKey]
  }
}
